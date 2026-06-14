package com.vega.fundamentals.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.config.UpstoxCredentialManager;
import com.vega.fundamentals.dto.BaseResponseDto;
import com.vega.fundamentals.endpoint.Endpoints;
import com.vega.fundamentals.service.InstrumentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

@Component
@Slf4j
public class UpstoxFundamentalClient {

    private final HttpClient httpClient;
    private final UpstoxCredentialManager credentialManager;
    private final ObjectMapper objectMapper;
    private final InstrumentService instrumentService;

    public UpstoxFundamentalClient(UpstoxCredentialManager credentialManager, ObjectMapper objectMapper, InstrumentService instrumentService) {
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        this.credentialManager = credentialManager;
        this.objectMapper = objectMapper;
        this.instrumentService = instrumentService;
    }

    public <T> T fetch(String isin, String resource, TypeReference<BaseResponseDto<T>> typeReference) {
        String identifier = isin;

        if (Endpoints.COMPETITORS.equals(resource)) {
            String instrumentKey = instrumentService.getCompetitorInstrumentKey(isin);
            if (instrumentKey != null) {
                identifier = instrumentKey;
            } else {
                // Fallback if not found in map
                identifier = "NSE_EQ|" + isin;
            }
        }

        String encodedIdentifier = URLEncoder.encode(identifier, StandardCharsets.UTF_8);
        String url = Endpoints.getUrl(encodedIdentifier, resource);
        String token = credentialManager.getAccessToken();

        if (token == null) {
            log.error("Access token is missing. Cannot fetch data for ISIN: {}", isin);
            return null;
        }

        int maxRetries = 3;
        long backoffMs = 1000;

        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization", "Bearer " + token)
                    .header("Accept", "application/json")
                    .timeout(Duration.ofSeconds(10))
                    .GET()
                    .build();

            try {
                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                if (response.statusCode() == 200) {
                    BaseResponseDto<T> baseResponse = objectMapper.readValue(response.body(), typeReference);
                    return baseResponse.getData();
                } else if (response.statusCode() == 429) {
                    log.warn("Rate limit (429) encountered for {} (attempt {}/{}). Retrying in {}ms...", identifier, attempt, maxRetries, backoffMs);
                    if (attempt < maxRetries) {
                        Thread.sleep(backoffMs);
                        backoffMs *= 2;
                        continue;
                    } else {
                        log.error("Max retries reached for 429 Too Many Requests on {}", identifier);
                    }
                } else {
                    log.error("Failed to fetch {} for identifier: {}. Status code: {}. Body: {}", 
                            resource, identifier, response.statusCode(), response.body());
                    break;
                }
            } catch (IOException | InterruptedException e) {
                log.warn("Error fetching {} for identifier: {} (attempt {}/{}): {}", resource, identifier, attempt, maxRetries, e.getMessage());
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                    break;
                }
                if (attempt < maxRetries) {
                    try {
                        Thread.sleep(backoffMs);
                        backoffMs *= 2;
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                } else {
                    log.error("Max retries reached due to IO exceptions for {}", identifier);
                }
            }
        }
        return null;
    }
}
