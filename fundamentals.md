```
// File: logs/vega-fundamentals.log
2026-06-14T02:24:17.010Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication using Java 21.0.10 with PID 22799 (/root/fundamentals/backend/target/classes started by root in /root/fundamentals/backend)
2026-06-14T02:24:17.015Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-14T02:24:19.251Z  INFO 22799 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-14T02:24:19.269Z  INFO 22799 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-14T02:24:19.270Z  INFO 22799 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-14T02:24:19.426Z  INFO 22799 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-14T02:24:19.427Z  INFO 22799 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2319 ms
2026-06-14T02:24:19.564Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-14T02:24:19.683Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loading instruments from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T02:24:21.621Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.service.InstrumentService          : Loaded 17996 instruments (ISINs: 17996, Keys: 139030) from /root/fundamentals/data/instruments/upstox/upstox.json
2026-06-14T02:24:22.848Z  INFO 22799 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-14T02:24:22.863Z  INFO 22799 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 7.049 seconds (process running for 7.979)
2026-06-14T02:24:43.971Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-14T02:24:43.974Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-14T02:24:43.979Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
2026-06-14T02:24:44.717Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE839G01010
2026-06-14T02:24:44.719Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE839G01010...
2026-06-14T02:24:44.722Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE839G01010
2026-06-14T02:24:47.178Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: INE839G01010. Initializing...
2026-06-14T02:24:47.482Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.498Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.514Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.526Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.537Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.542Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.549Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE839G01010 (offset: 0)
2026-06-14T02:24:47.560Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE839G01010 (offset: 0)
2026-06-14T03:40:56.732Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-14T03:40:56.738Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE002A01018...
2026-06-14T03:40:56.741Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE002A01018
2026-06-14T03:40:57.444Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: INE002A01018. Initializing...
2026-06-14T03:40:57.480Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.510Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.518Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.525Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.530Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.534Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.537Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:40:57.542Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-2] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE002A01018 (offset: 0)
2026-06-14T03:41:37.275Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.controller.FundamentalController   : Request received for ISIN: INE397D01024
2026-06-14T03:41:37.280Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: INE397D01024...
2026-06-14T03:41:37.288Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE397D01024
2026-06-14T03:41:37.932Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: INE397D01024. Initializing...
2026-06-14T03:41:37.955Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:37.991Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.005Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.021Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.037Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.053Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.066Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:41:38.080Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-4] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: INE397D01024 (offset: 0)
2026-06-14T03:42:00.072Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.controller.FundamentalController   : Request received for ISIN: IN9397D01014
2026-06-14T03:42:00.074Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalCacheService    : Retrieving fundamentals from history for ISIN: IN9397D01014...
2026-06-14T03:42:00.075Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: IN9397D01014
2026-06-14T03:42:00.475Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : metadata.json missing or new ISIN: IN9397D01014. Initializing...
2026-06-14T03:42:00.492Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of profile for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.500Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of balanceSheet for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.511Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of cashFlow for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.523Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of incomeStatement for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.532Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of shareHoldings for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.541Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of keyRatios for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.549Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of corporateActions for ISIN: IN9397D01014 (offset: 0)
2026-06-14T03:42:00.575Z  INFO 22799 --- [vega.fundamentals] [tomcat-handler-6] c.v.f.service.FundamentalHistoryService  : Archived v1 of competitors for ISIN: IN9397D01014 (offset: 0)
```

```xml
// File: pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.vega</groupId>
    <artifactId>fundamentals</artifactId>
    <version>0.0.1</version>
    <name>vega.fundamentals</name>
    <description>Vega Fundamentals Service</description>
    <properties>
        <java.version>21</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <finalName>vega.fundamentals.0.0.1</finalName>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

```java
// File: src/main/java/com/vega/fundamentals/VegaFundamentalsApplication.java
package com.vega.fundamentals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VegaFundamentalsApplication {

    public static void main(String[] args) {
        SpringApplication.run(VegaFundamentalsApplication.class, args);
    }

}
```

```java
// File: src/main/java/com/vega/fundamentals/client/UpstoxFundamentalClient.java
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
            } else {
                log.error("Failed to fetch {} for identifier: {}. Status code: {}. Body: {}", 
                        resource, identifier, response.statusCode(), response.body());
            }
        } catch (IOException | InterruptedException e) {
            log.error("Error fetching {} for identifier: {}: {}", resource, identifier, e.getMessage());
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
        return null;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/config/AsyncConfig.java
package com.vega.fundamentals.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class AsyncConfig {

    @Bean
    public ExecutorService virtualThreadExecutor() {
        return Executors.newVirtualThreadPerTaskExecutor();
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/config/UpstoxCredentialManager.java
package com.vega.fundamentals.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
@Slf4j
public class UpstoxCredentialManager {

    @Value("${upstox.env-path}")
    private String envPath;

    private String accessToken;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    public void init() {
        loadCredentials();
    }

    public synchronized void loadCredentials() {
        try {
            File file = new File(envPath);
            if (!file.exists()) {
                log.error("Upstox credentials file not found at: {}", envPath);
                return;
            }

            JsonNode root = objectMapper.readTree(file);
            JsonNode accounts = root.path("accounts");
            
            // Try to find the first account with an accessToken
            if (accounts.isObject()) {
                accounts.fields().forEachRemaining(entry -> {
                    JsonNode account = entry.getValue();
                    if (account.has("accessToken")) {
                        this.accessToken = account.get("accessToken").asText();
                    }
                });
            }

            if (this.accessToken == null || this.accessToken.isEmpty()) {
                log.error("No access token found in Upstox credentials file.");
            } else {
                log.info("Upstox access token loaded successfully.");
            }
        } catch (IOException e) {
            log.error("Failed to load Upstox credentials: {}", e.getMessage());
        }
    }

    public String getAccessToken() {
        return accessToken;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/controller/FundamentalController.java
package com.vega.fundamentals.controller;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.service.FundamentalAggregatorService;
import com.vega.fundamentals.service.FundamentalCacheService;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Optional;

@RestController
@RequestMapping("/api/fundamentals")
@RequiredArgsConstructor
@Slf4j
@Validated
public class FundamentalController {

    private final FundamentalAggregatorService aggregatorService;
    private final FundamentalCacheService cacheService;
    private final com.vega.fundamentals.service.FundamentalHistoryService historyService;
    private final com.vega.fundamentals.service.FundamentalAnalyzer analyzer;

    @GetMapping("/{isin}")
    public ResponseEntity<FundamentalSnapshot> getFundamentals(
            @PathVariable 
            @Pattern(regexp = "^[A-Z]{2}[A-Z0-9]{9}[0-9]$", message = "Invalid ISIN format")
            String isin) {
        
        log.info("Request received for ISIN: {}", isin);

        Optional<FundamentalSnapshot> cachedSnapshot = cacheService.get(isin);
        if (cachedSnapshot.isPresent()) {
            return ResponseEntity.ok(cachedSnapshot.get());
        }

        FundamentalSnapshot snapshot = aggregatorService.aggregate(isin);

        return ResponseEntity.ok(snapshot);
    }

    @GetMapping("/{isin}/history")
    public ResponseEntity<FundamentalSnapshot> getHistoricalFundamentals(
            @PathVariable 
            @Pattern(regexp = "^[A-Z]{2}[A-Z0-9]{9}[0-9]$", message = "Invalid ISIN format")
            String isin,
            @RequestParam(required = false) String timestamp) {
        
        log.info("Historical request received for ISIN: {} at {}", isin, timestamp);

        Instant asOf = null;
        if (timestamp != null) {
            try {
                asOf = Instant.parse(timestamp);
            } catch (Exception e) {
                // Try epoch millis if ISO format fails
                try {
                    asOf = Instant.ofEpochMilli(Long.parseLong(timestamp));
                } catch (Exception e2) {
                    return ResponseEntity.badRequest().build();
                }
            }
        }

        Optional<FundamentalSnapshot> snapshot = historyService.reconstructSnapshot(isin, asOf);
        if (snapshot.isPresent()) {
            FundamentalSnapshot s = snapshot.get();
            s.setAnalysis(analyzer.analyze(s));
            return ResponseEntity.ok(s);
        }
        return ResponseEntity.notFound().build();
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/BalanceSheetContainer.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceSheetContainer {
    private BalanceSheetDto consolidated;
    private BalanceSheetDto standalone;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/BalanceSheetDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceSheetDto {
    private Instant fetchedTs;
    private String type;
    @JsonProperty("time_period")
    private String timePeriod;
    @JsonProperty("units_in")
    private String unitsIn;
    private List<BalanceHistoryDto> history;
    @JsonProperty("full_statement")
    private List<StatementItemDto> fullStatement;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class BalanceHistoryDto {
    @JsonProperty("total_asset")
    private Double totalAsset;
    @JsonProperty("total_liability")
    private Double totalLiability;
    private String period;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class StatementItemDto {
    private String particular;
    private List<StatementHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class StatementHistoryDto {
    private String period;
    private Double value;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/BaseResponseDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponseDto<T> {
    private String status;
    private T data;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CashFlowContainer.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CashFlowContainer {
    private CashFlowDto consolidated;
    private CashFlowDto standalone;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CashFlowDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowDto {
    private Instant fetchedTs;
    private String type;
    @JsonProperty("time_period")
    private String timePeriod;
    @JsonProperty("units_in")
    private String unitsIn;
    @JsonProperty("cash_flow")
    private List<CashFlowCategoryDto> cashFlow;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class CashFlowCategoryDto {
    private String category;
    private List<CashFlowHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class CashFlowHistoryDto {
    private Double value;
    private String period;
    private String change;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CompanyProfileDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyProfileDto {
    private Instant fetchedTs;
    @JsonProperty("company_profile")
    private String companyProfile;
    
    private String sector;
    
    @JsonProperty("sector_market_cap_inr")
    private MarketCapDto sectorMarketCapInr;
    
    @JsonProperty("sector_market_cap_usd")
    private MarketCapDto sectorMarketCapUsd;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class MarketCapDto {
    private Double value;
    private String unit;
    private String formatted;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CompetitorDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompetitorDto {
    @JsonProperty("instrument_key")
    private String instrumentKey;
    
    private String isin;
    private String symbol;
    @JsonProperty("company_name")
    private String companyName;
    private String exchange;
    
    @JsonProperty("company_profile")
    private String companyProfile;
    private String sector;
    
    @JsonProperty("sector_market_cap_inr")
    private MarketCapDto sectorMarketCapInr;
    @JsonProperty("sector_market_cap_usd")
    private MarketCapDto sectorMarketCapUsd;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/CorporateActionDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CorporateActionDto {
    private String name;
    @JsonProperty("expiry_date")
    private String expiryDate;
    private Double amount;
    private String ratio;
    @JsonProperty("event_details")
    private List<EventDetailDto> eventDetails;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class EventDetailDto {
    private String name;
    private String value;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/FundamentalSnapshot.java
package com.vega.fundamentals.dto;

import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class FundamentalSnapshot {
    private String schemaVersion;
    private String status;
    private String source;
    private String isin;
    private String symbol;
    private String companyName;
    private String exchange;
    private Instant generatedTs;
    private Long requestDurationMs;
    private boolean cacheHit;

    private SectionResponse<CompanyProfileDto> profile;
    private SectionResponse<BalanceSheetContainer> balanceSheet;
    private SectionResponse<CashFlowContainer> cashFlow;
    private SectionResponse<IncomeStatementContainer> incomeStatement;
    private SectionResponse<List<ShareHoldingDto>> shareHoldings;
    private SectionResponse<List<KeyRatioDto>> keyRatios;
    private SectionResponse<List<CorporateActionDto>> corporateActions;
    private SectionResponse<List<CompetitorDto>> competitors;

    @Builder.Default
    private Map<String, Object> analysis = new HashMap<>();
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/HistoryRecord.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryRecord {
    @Builder.Default
    private String schemaVersion = "1.0";
    private long version;
    private Instant ts;
    private String hash;
    private JsonNode data;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/IncomeStatementContainer.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IncomeStatementContainer {
    private IncomeStatementDto consolidated;
    private IncomeStatementDto standalone;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/IncomeStatementDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeStatementDto {
    private Instant fetchedTs;
    private String type;
    @JsonProperty("time_period")
    private String timePeriod;
    @JsonProperty("units_in")
    private String unitsIn;
    @JsonProperty("income_statement")
    private List<IncomeCategoryDto> incomeStatement;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class IncomeCategoryDto {
    private String category;
    private List<IncomeHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class IncomeHistoryDto {
    private Double value;
    private String period;
    private String change;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/IsinMetadata.java
// File: src/main/java/com/vega/fundamentals/dto/IsinMetadata.java
package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IsinMetadata {
    @Builder.Default
    private String schemaVersion = "1.0";
    private String isin;
    private String symbol;
    private String companyName;
    private String exchange;
    private Instant createdTs;
    private Instant firstSeenTs;
    private Instant lastUpdatedTs;

    @Builder.Default
    private Map<String, EndpointMetadata> endpoints = new HashMap<>();

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EndpointMetadata {
        private long version;
        private String hash;
        private Instant lastUpdatedTs;
        private long offset;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/KeyRatioDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyRatioDto {
    private String name;
    @JsonProperty("company_value")
    private String companyValue;
    @JsonProperty("sector_value")
    private String sectorValue;
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/SectionResponse.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionResponse<T> {
    private String status;
    private Instant fetchedTs;
    private Long ageMinutes;
    private Boolean cacheHit;
    private String errorCode;
    private String message;
    private T data;

    public static <T> SectionResponse<T> success(T data) {
        return SectionResponse.<T>builder()
                .status("success")
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> error(String errorCode, String message, T data) {
        return SectionResponse.<T>builder()
                .status("error")
                .errorCode(errorCode)
                .message(message)
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> cached(T data, Instant fetchedTs) {
        return SectionResponse.<T>builder()
                .status("cached")
                .fetchedTs(fetchedTs)
                .cacheHit(true)
                .data(data)
                .build();
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/dto/ShareHoldingDto.java
package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShareHoldingDto {
    private String category;
    private List<HoldingHistoryDto> history;
}

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class HoldingHistoryDto {
    private String period;
    private Double value;
}
```

```java
// File: src/main/java/com/vega/fundamentals/endpoint/Endpoints.java
package com.vega.fundamentals.endpoint;

public class Endpoints {
    public static final String BASE_URL = "https://api.upstox.com/v2/fundamentals/";
    
    public static final String PROFILE = "profile";
    public static final String BALANCE_SHEET = "balance-sheet?fs=true";
    public static final String CASH_FLOW = "cash-flow";
    public static final String INCOME_STATEMENT = "income-statement";
    public static final String SHARE_HOLDINGS = "share-holdings";
    public static final String KEY_RATIOS = "key-ratios";
    public static final String CORPORATE_ACTIONS = "corporate-actions";
    public static final String COMPETITORS = "competitors";

    public static String getUrl(String identifier, String resource) {
        return BASE_URL + identifier + "/" + resource;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/model/FundamentalEndpoint.java
package com.vega.fundamentals.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vega.fundamentals.dto.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum FundamentalEndpoint {
    PROFILE("profile", "profile.jsonl", new TypeReference<CompanyProfileDto>() {}),
    BALANCE_SHEET("balanceSheet", "balanceSheet.jsonl", new TypeReference<BalanceSheetContainer>() {}),
    CASH_FLOW("cashFlow", "cashFlow.jsonl", new TypeReference<CashFlowContainer>() {}),
    INCOME_STATEMENT("incomeStatement", "incomeStatement.jsonl", new TypeReference<IncomeStatementContainer>() {}),
    SHARE_HOLDINGS("shareHoldings", "shareHoldings.jsonl", new TypeReference<List<ShareHoldingDto>>() {}),
    KEY_RATIOS("keyRatios", "keyRatios.jsonl", new TypeReference<List<KeyRatioDto>>() {}),
    CORPORATE_ACTIONS("corporateActions", "corporateActions.jsonl", new TypeReference<List<CorporateActionDto>>() {}),
    COMPETITORS("competitors", "competitors.jsonl", new TypeReference<List<CompetitorDto>>() {});

    private final String key;
    private final String filename;
    private final TypeReference<?> typeReference;

    public static FundamentalEndpoint fromKey(String key) {
        for (FundamentalEndpoint endpoint : values()) {
            if (endpoint.key.equals(key)) {
                return endpoint;
            }
        }
        // Fallback to name match for resilience
        for (FundamentalEndpoint endpoint : values()) {
            if (endpoint.name().equalsIgnoreCase(key)) {
                return endpoint;
            }
        }
        throw new IllegalArgumentException("Unknown endpoint key: " + key);
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalAggregatorService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vega.fundamentals.client.UpstoxFundamentalClient;
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.endpoint.Endpoints;
import com.vega.fundamentals.util.SectionResponseFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.time.Instant;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalAggregatorService {

    private final UpstoxFundamentalClient client;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;
    private final ExecutorService executor;

    public FundamentalSnapshot aggregate(String isin) {
        log.info("Aggregating fundamentals for ISIN: {}", isin);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);

        CompletableFuture<SectionResponse<CompanyProfileDto>> profileFuture = fetchAsync(isin, Endpoints.PROFILE, 
                new TypeReference<BaseResponseDto<CompanyProfileDto>>() {}, "profile");

        CompletableFuture<SectionResponse<BalanceSheetContainer>> balanceSheetFuture = fetchAsync(isin, Endpoints.BALANCE_SHEET, 
                new TypeReference<BaseResponseDto<BalanceSheetDto>>() {}, "balanceSheet")
                .thenApply(res -> wrapContainer(res, BalanceSheetContainer.class));

        CompletableFuture<SectionResponse<CashFlowContainer>> cashFlowFuture = fetchAsync(isin, Endpoints.CASH_FLOW, 
                new TypeReference<BaseResponseDto<CashFlowDto>>() {}, "cashFlow")
                .thenApply(res -> wrapContainer(res, CashFlowContainer.class));

        CompletableFuture<SectionResponse<IncomeStatementContainer>> incomeStatementFuture = fetchAsync(isin, Endpoints.INCOME_STATEMENT, 
                new TypeReference<BaseResponseDto<IncomeStatementDto>>() {}, "incomeStatement")
                .thenApply(res -> wrapContainer(res, IncomeStatementContainer.class));

        CompletableFuture<SectionResponse<List<ShareHoldingDto>>> shareHoldingsFuture = fetchAsync(isin, Endpoints.SHARE_HOLDINGS, 
                new TypeReference<BaseResponseDto<List<ShareHoldingDto>>>() {}, "shareHoldings");

        CompletableFuture<SectionResponse<List<KeyRatioDto>>> keyRatiosFuture = fetchAsync(isin, Endpoints.KEY_RATIOS, 
                new TypeReference<BaseResponseDto<List<KeyRatioDto>>>() {}, "keyRatios");

        CompletableFuture<SectionResponse<List<CorporateActionDto>>> corporateActionsFuture = fetchAsync(isin, Endpoints.CORPORATE_ACTIONS, 
                new TypeReference<BaseResponseDto<List<CorporateActionDto>>>() {}, "corporateActions");

        CompletableFuture<SectionResponse<List<CompetitorDto>>> competitorsFuture = fetchAsync(isin, Endpoints.COMPETITORS, 
                new TypeReference<BaseResponseDto<List<CompetitorDto>>>() {}, "competitors")
                .thenApply(this::enrichCompetitors);

        CompletableFuture.allOf(
                profileFuture, balanceSheetFuture, cashFlowFuture, incomeStatementFuture,
                shareHoldingsFuture, keyRatiosFuture, corporateActionsFuture, competitorsFuture
        ).join();

        stopWatch.stop();

        SectionResponse<CompanyProfileDto> profileRes = profileFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null));
        String companyName = instrumentInfo != null ? instrumentInfo.getName() : null;

        FundamentalSnapshot snapshot = FundamentalSnapshot.builder()
                .schemaVersion("2.0")
                .status("success")
                .source("UPSTOX")
                .isin(isin)
                .symbol(instrumentInfo != null ? instrumentInfo.getSymbol() : null)
                .companyName(companyName)
                .exchange(instrumentInfo != null ? instrumentInfo.getExchange() : null)
                .generatedTs(Instant.now())
                .requestDurationMs(stopWatch.getTotalTimeMillis())
                .cacheHit(false)
                .profile(profileRes)
                .balanceSheet(balanceSheetFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null)))
                .cashFlow(cashFlowFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null)))
                .incomeStatement(incomeStatementFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", null)))
                .shareHoldings(shareHoldingsFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .keyRatios(keyRatiosFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .corporateActions(corporateActionsFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .competitors(competitorsFuture.getNow(SectionResponseFactory.error("INTERNAL_ERROR", "Fetch failed", List.of())))
                .build();

        boolean anyError = List.of(snapshot.getProfile(), snapshot.getBalanceSheet(), snapshot.getCashFlow(), 
                snapshot.getIncomeStatement(), snapshot.getShareHoldings(), snapshot.getKeyRatios(), 
                snapshot.getCorporateActions(), snapshot.getCompetitors())
                .stream().anyMatch(res -> "error".equals(res.getStatus()));
        
        if (anyError) {
            snapshot.setStatus("partial_success");
        }

        snapshot.setAnalysis(analyzer.analyze(snapshot));

        // Archive changes to JSONL history
        historyService.archiveSnapshot(snapshot);

        return snapshot;
    }

    private <T> CompletableFuture<SectionResponse<T>> fetchAsync(String isin, String endpoint, TypeReference<BaseResponseDto<T>> type, String name) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                T result = client.fetch(isin, endpoint, type);
                if (result != null) {
                    return SectionResponseFactory.success(result);
                } else {
                    return SectionResponseFactory.error("UPSTOX_FETCH_ERROR", "Failed to fetch " + name, null);
                }
            } catch (Exception e) {
                log.error("Error fetching {} for ISIN: {}: {}", name, isin, e.getMessage());
                return SectionResponseFactory.error("EXCEPTION", e.getMessage(), null);
            }
        }, executor);
    }

    private SectionResponse<List<CompetitorDto>> enrichCompetitors(SectionResponse<List<CompetitorDto>> sectionRes) {
        if (!"success".equals(sectionRes.getStatus()) || sectionRes.getData() == null) {
            return sectionRes;
        }

        for (CompetitorDto competitor : sectionRes.getData()) {
            InstrumentService.InstrumentInfo info = instrumentService.getByInstrumentKey(competitor.getInstrumentKey());
            if (info != null) {
                competitor.setIsin(info.getIsin());
                competitor.setSymbol(info.getSymbol());
                competitor.setCompanyName(info.getName());
                competitor.setExchange(info.getExchange());
            }
        }
        return sectionRes;
    }

    @SuppressWarnings("unchecked")
    private <T, C> SectionResponse<C> wrapContainer(SectionResponse<T> sectionRes, Class<C> containerClass) {
        if ("error".equals(sectionRes.getStatus())) {
            return SectionResponseFactory.error(sectionRes.getErrorCode(), sectionRes.getMessage(), null);
        }
        
        try {
            C container = containerClass.getDeclaredConstructor().newInstance();
            if (sectionRes.getData() != null) {
                containerClass.getMethod("setConsolidated", sectionRes.getData().getClass()).invoke(container, sectionRes.getData());
            }
            return SectionResponseFactory.success(container);
        } catch (Exception e) {
            return SectionResponseFactory.error("CONTAINER_ERROR", e.getMessage(), null);
        }
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalAnalyzer.java
package com.vega.fundamentals.service;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.dto.KeyRatioDto;
import com.vega.fundamentals.dto.SectionResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FundamentalAnalyzer {

    public Map<String, Object> analyze(FundamentalSnapshot snapshot) {
        Map<String, Object> analysis = new HashMap<>();
        
        // Basic Analysis Logic
        int profitability = calculateProfitability(snapshot);
        int valuation = calculateValuation(snapshot);
        int financialHealth = calculateFinancialHealth(snapshot);
        int ownership = calculateOwnership(snapshot);
        
        int overallScore = (profitability + financialHealth + valuation + ownership) / 4;

        analysis.put("profitability", profitability);
        analysis.put("financialHealth", financialHealth);
        analysis.put("valuation", valuation);
        analysis.put("ownership", ownership);
        analysis.put("overallScore", overallScore);

        return analysis;
    }

    private int calculateProfitability(FundamentalSnapshot snapshot) {
        // Look for ROE, Net Profit Margin in Key Ratios
        double score = 50;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                if ("ROE".equalsIgnoreCase(ratio.getName())) {
                    score += parseValue(ratio.getCompanyValue()) > 15 ? 10 : -5;
                }
                if ("Net Profit Margin".equalsIgnoreCase(ratio.getName())) {
                    score += parseValue(ratio.getCompanyValue()) > 10 ? 10 : -5;
                }
            }
        }
        return (int) Math.clamp(score, 0, 100);
    }

    private int calculateValuation(FundamentalSnapshot snapshot) {
        // Look for PE, PB in Key Ratios
        double score = 50;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                if ("PE Ratio".equalsIgnoreCase(ratio.getName())) {
                    double pe = parseValue(ratio.getCompanyValue());
                    if (pe > 0 && pe < 20) score += 15;
                    else if (pe > 40) score -= 10;
                }
                if ("PB Ratio".equalsIgnoreCase(ratio.getName())) {
                    double pb = parseValue(ratio.getCompanyValue());
                    if (pb > 0 && pb < 3) score += 10;
                    else if (pb > 7) score -= 10;
                }
            }
        }
        return (int) Math.clamp(score, 0, 100);
    }

    private int calculateFinancialHealth(FundamentalSnapshot snapshot) {
        // Look for Debt to Equity
        double score = 50;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                if ("Debt to Equity".equalsIgnoreCase(ratio.getName())) {
                    double de = parseValue(ratio.getCompanyValue());
                    if (de < 0.5) score += 20;
                    else if (de > 1.5) score -= 15;
                }
            }
        }
        return (int) Math.clamp(score, 0, 100);
    }

    private int calculateOwnership(FundamentalSnapshot snapshot) {
        // Placeholder for shareholding analysis
        return 50; 
    }

    private List<KeyRatioDto> getRatios(FundamentalSnapshot snapshot) {
        SectionResponse<List<KeyRatioDto>> section = snapshot.getKeyRatios();
        return (section != null && "success".equals(section.getStatus())) ? section.getData() : null;
    }

    private double parseValue(String val) {
        if (val == null) return 0;
        try {
            return Double.parseDouble(val.replaceAll("[^0-9.-]", ""));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalCacheService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.util.SectionResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FundamentalCacheService {

    private final ObjectMapper objectMapper;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;

    public FundamentalCacheService(ObjectMapper objectMapper,
                                 InstrumentService instrumentService,
                                 FundamentalAnalyzer analyzer,
                                 FundamentalHistoryService historyService) {
        this.objectMapper = objectMapper;
        this.instrumentService = instrumentService;
        this.analyzer = analyzer;
        this.historyService = historyService;
    }

    public Optional<FundamentalSnapshot> get(String isin) {
        // History is the absolute source of truth
        log.info("Retrieving fundamentals from history for ISIN: {}...", isin);
        Optional<FundamentalSnapshot> historical = historyService.reconstructSnapshot(isin);
        
        if (historical.isPresent()) {
            FundamentalSnapshot snapshot = historical.get();
            log.info("History hit for ISIN: {}", isin);
            snapshot.setAnalysis(analyzer.analyze(snapshot));
            return Optional.of(snapshot);
        }

        return Optional.empty();
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/FundamentalHistoryService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.model.FundamentalEndpoint;
import com.vega.fundamentals.util.SectionResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Service
@Slf4j
public class FundamentalHistoryService {

    private static final java.util.Set<String> VOLATILE_FIELDS = java.util.Set.of(
            "fetchedTs", "generatedTs", "cacheHit", "ageMinutes",
            "requestDurationMs", "status", "message", "errorCode"
    );

    private final String historyPath;
    private final ObjectMapper objectMapper;
    private final ConcurrentHashMap<String, ReentrantLock> locks = new ConcurrentHashMap<>();

    public FundamentalHistoryService(@Value("${storage.history.fundamentals-path}") String historyPath, ObjectMapper objectMapper) {
        this.historyPath = historyPath;
        this.objectMapper = objectMapper.copy();
        this.objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    }

    /**
     * Archives all changed sections of a snapshot.
     */
    public void archiveSnapshot(FundamentalSnapshot snapshot) {
        if (snapshot == null || snapshot.getIsin() == null) return;

        String isin = snapshot.getIsin();
        ReentrantLock lock = locks.computeIfAbsent(isin, k -> new ReentrantLock());
        lock.lock();
        try {
            Path isinHistoryDir = Path.of(historyPath, isin);
            Files.createDirectories(isinHistoryDir);
            
            IsinMetadata metadata = loadOrRebuildMetadata(snapshot);

            for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
                SectionResponse<?> section = getSection(snapshot, endpoint);
                archiveIfChanged(isin, endpoint, section, metadata);
            }
            
            saveIsinMetadata(isin, metadata);

        } catch (Exception e) {
            log.error("Failed to archive snapshot for ISIN {}: {}", isin, e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    private SectionResponse<?> getSection(FundamentalSnapshot snapshot, FundamentalEndpoint endpoint) {
        return switch (endpoint) {
            case PROFILE -> snapshot.getProfile();
            case BALANCE_SHEET -> snapshot.getBalanceSheet();
            case CASH_FLOW -> snapshot.getCashFlow();
            case INCOME_STATEMENT -> snapshot.getIncomeStatement();
            case SHARE_HOLDINGS -> snapshot.getShareHoldings();
            case KEY_RATIOS -> snapshot.getKeyRatios();
            case CORPORATE_ACTIONS -> snapshot.getCorporateActions();
            case COMPETITORS -> snapshot.getCompetitors();
        };
    }

    private void archiveIfChanged(String isin, FundamentalEndpoint endpoint, SectionResponse<?> section, IsinMetadata metadata) {
        if (section == null || !"success".equals(section.getStatus()) || section.getData() == null) {
            return;
        }

        try {
            JsonNode dataNode = objectMapper.valueToTree(section.getData());
            JsonNode normalizedNode = normalize(dataNode);
            JsonNode canonicalNode = canonicalize(normalizedNode, endpoint);
            String currentHash = generateHash(canonicalNode);

            IsinMetadata.EndpointMetadata lastEntry = metadata.getEndpoints().get(endpoint.getKey());

            if (lastEntry != null && currentHash.equals(lastEntry.getHash())) {
                log.debug("No change detected for {} (ISIN: {}). Skipping archive.", endpoint.getKey(), isin);
                return;
            }

            // Data has changed, archive it
            long nextVersion = (lastEntry != null) ? lastEntry.getVersion() + 1 : 1;
            HistoryRecord record = HistoryRecord.builder()
                    .version(nextVersion)
                    .ts(Instant.now())
                    .hash(currentHash)
                    .data(dataNode)
                    .build();

            long offset = appendHistory(Path.of(historyPath, isin), endpoint, record);

            // Update metadata
            metadata.getEndpoints().put(endpoint.getKey(), IsinMetadata.EndpointMetadata.builder()
                    .hash(currentHash)
                    .version(nextVersion)
                    .lastUpdatedTs(record.getTs())
                    .offset(offset)
                    .build());
            
            metadata.setLastUpdatedTs(record.getTs());

            log.info("Archived v{} of {} for ISIN: {} (offset: {})", nextVersion, endpoint.getKey(), isin, offset);

        } catch (Exception e) {
            log.error("Failed to archive {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
        }
    }

    private IsinMetadata loadOrRebuildMetadata(FundamentalSnapshot snapshot) throws IOException {
        String isin = snapshot.getIsin();
        Path isinDir = Path.of(historyPath, isin);
        File metadataFile = isinDir.resolve("metadata.json").toFile();

        IsinMetadata metadata = null;
        if (metadataFile.exists()) {
            try {
                metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
                // Update with latest info from snapshot if provided
                metadata.setSymbol(snapshot.getSymbol());
                metadata.setCompanyName(snapshot.getCompanyName());
                metadata.setExchange(snapshot.getExchange());
            } catch (Exception e) {
                log.warn("metadata.json corrupted for ISIN: {}. Rebuilding...", isin);
            }
        }

        if (metadata == null) {
            log.info("metadata.json missing or corrupted for ISIN: {}. Rebuilding from history...", isin);
            metadata = rebuildMetadataFromHistory(isin);
            
            // Supplement with snapshot data if history was incomplete
            if (metadata.getSymbol() == null) metadata.setSymbol(snapshot.getSymbol());
            if (metadata.getCompanyName() == null) metadata.setCompanyName(snapshot.getCompanyName());
            if (metadata.getExchange() == null) metadata.setExchange(snapshot.getExchange());
        }
        return metadata;
    }

    public IsinMetadata rebuildMetadataFromHistory(String isin) {
        Instant now = Instant.now();
        IsinMetadata metadata = IsinMetadata.builder()
                .isin(isin)
                .createdTs(now) // Default to now, will be updated if history found
                .firstSeenTs(now)
                .lastUpdatedTs(now)
                .endpoints(new HashMap<>())
                .build();

        Instant absoluteFirstTs = null;
        Instant absoluteLastTs = null;

        for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
            LatestRecordInfo latestInfo = readLatestRecordDetailed(isin, endpoint);
            if (latestInfo != null) {
                HistoryRecord lastRecord = latestInfo.getRecord();
                metadata.getEndpoints().put(endpoint.getKey(), IsinMetadata.EndpointMetadata.builder()
                        .hash(lastRecord.getHash())
                        .version(lastRecord.getVersion())
                        .lastUpdatedTs(lastRecord.getTs())
                        .offset(latestInfo.getOffset())
                        .build());

                if (absoluteLastTs == null || lastRecord.getTs().isAfter(absoluteLastTs)) {
                    absoluteLastTs = lastRecord.getTs();
                }

                // Recover metadata from PROFILE if possible
                if (endpoint == FundamentalEndpoint.PROFILE) {
                    try {
                        CompanyProfileDto profile = objectMapper.convertValue(lastRecord.getData(), CompanyProfileDto.class);
                        // Some profile info might be null if not enriched, but Aggregator usually enriches.
                        // However, history stores raw or enriched data depending on when it was archived.
                    } catch (Exception e) {
                        log.warn("Failed to extract profile info during metadata rebuild for ISIN: {}", isin);
                    }
                }

                // Find the first record for this endpoint to get firstSeenTs
                HistoryRecord firstRecord = readFirstRecord(isin, endpoint);
                if (firstRecord != null) {
                    if (absoluteFirstTs == null || firstRecord.getTs().isBefore(absoluteFirstTs)) {
                        absoluteFirstTs = firstRecord.getTs();
                    }
                }
            }
        }

        if (absoluteFirstTs != null) {
            metadata.setFirstSeenTs(absoluteFirstTs);
            metadata.setCreatedTs(absoluteFirstTs); // createdTs usually aligns with first seen
        }
        if (absoluteLastTs != null) {
            metadata.setLastUpdatedTs(absoluteLastTs);
        }

        // Try to recover Symbol/Name from reconstruction if possible (PROFILE section)
        reconstructSnapshot(isin).ifPresent(snapshot -> {
            metadata.setSymbol(snapshot.getSymbol());
            metadata.setCompanyName(snapshot.getCompanyName());
            metadata.setExchange(snapshot.getExchange());
        });

        if (!metadata.getEndpoints().isEmpty()) {
            log.info("Successfully rebuilt metadata from history for ISIN: {} with {} endpoints.", isin, metadata.getEndpoints().size());
        }
        return metadata;
    }

    private void rebuildEndpointMetadata(String isin, IsinMetadata metadata) {
        // Legacy method now delegates to the more comprehensive rebuild
        IsinMetadata rebuilt = rebuildMetadataFromHistory(isin);
        metadata.setEndpoints(rebuilt.getEndpoints());
        metadata.setFirstSeenTs(rebuilt.getFirstSeenTs());
        metadata.setCreatedTs(rebuilt.getCreatedTs());
        metadata.setLastUpdatedTs(rebuilt.getLastUpdatedTs());
        if (metadata.getSymbol() == null) metadata.setSymbol(rebuilt.getSymbol());
        if (metadata.getCompanyName() == null) metadata.setCompanyName(rebuilt.getCompanyName());
        if (metadata.getExchange() == null) metadata.setExchange(rebuilt.getExchange());
    }

    private HistoryRecord readFirstRecord(String isin, FundamentalEndpoint endpoint) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            String line = raf.readLine();
            if (line != null && !line.trim().isEmpty()) {
                return objectMapper.readValue(line, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read first record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private void saveIsinMetadata(String isin, IsinMetadata metadata) throws IOException {
        File metadataFile = Path.of(historyPath, isin, "metadata.json").toFile();
        objectMapper.writeValue(metadataFile, metadata);
        // Clean up legacy index if it exists
        Files.deleteIfExists(Path.of(historyPath, isin, "latest-index.json"));
    }

    private JsonNode normalize(JsonNode node) {
        if (node == null) return null;
        if (node.isArray()) {
            com.fasterxml.jackson.databind.node.ArrayNode normalizedArray = objectMapper.createArrayNode();
            for (JsonNode item : node) {
                normalizedArray.add(normalize(item));
            }
            return normalizedArray;
        }
        if (!node.isObject()) return node;
        
        ObjectNode normalized = node.deepCopy();
        VOLATILE_FIELDS.forEach(normalized::remove);
        
        java.util.Iterator<Map.Entry<String, JsonNode>> fields = normalized.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            normalized.set(field.getKey(), normalize(field.getValue()));
        }
        
        return normalized;
    }

    private JsonNode canonicalize(JsonNode node, FundamentalEndpoint endpoint) {
        if (node == null || !node.isArray()) return node;

        com.fasterxml.jackson.databind.node.ArrayNode array = (com.fasterxml.jackson.databind.node.ArrayNode) node;
        java.util.List<JsonNode> elements = new java.util.ArrayList<>();
        array.forEach(elements::add);

        switch (endpoint) {
            case COMPETITORS -> elements.sort(java.util.Comparator.comparing(n -> n.path("instrument_key").asText("")));
            case SHARE_HOLDINGS -> elements.sort(java.util.Comparator.comparing(n -> n.path("category").asText("")));
            case KEY_RATIOS -> elements.sort(java.util.Comparator.comparing(n -> n.path("name").asText("")));
            case CORPORATE_ACTIONS -> elements.sort(java.util.Comparator.comparing((JsonNode n) -> n.path("name").asText(""))
                    .thenComparing(n -> n.path("expiry_date").asText("")));
        }

        com.fasterxml.jackson.databind.node.ArrayNode sortedArray = objectMapper.createArrayNode();
        elements.forEach(sortedArray::add);
        return sortedArray;
    }

    private String generateHash(JsonNode node) throws NoSuchAlgorithmException, JsonProcessingException {
        String canonicalJson = objectMapper.writeValueAsString(node);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(canonicalJson.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    private long appendHistory(Path dir, FundamentalEndpoint endpoint, HistoryRecord record) throws IOException {
        File historyFile = dir.resolve(endpoint.getFilename()).toFile();
        long offset = historyFile.exists() ? historyFile.length() : 0;
        
        String line = objectMapper.writeValueAsString(record);
        try (FileWriter fw = new FileWriter(historyFile, true)) {
            fw.write(line + "\n");
        }
        return offset;
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin) {
        return reconstructSnapshot(isin, null);
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin, Instant asOf) {
        Path isinDir = Path.of(historyPath, isin);
        if (!Files.exists(isinDir)) return Optional.empty();

        File metadataFile = isinDir.resolve("metadata.json").toFile();
        if (!metadataFile.exists() && asOf == null) return Optional.empty();

        try {
            IsinMetadata metadata = metadataFile.exists() ? objectMapper.readValue(metadataFile, IsinMetadata.class) : null;

            FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                    .schemaVersion("2.0")
                    .status("success")
                    .source("HISTORY")
                    .isin(isin)
                    .cacheHit(true);

            if (metadata != null) {
                builder.symbol(metadata.getSymbol())
                        .companyName(metadata.getCompanyName())
                        .exchange(metadata.getExchange())
                        .generatedTs(metadata.getLastUpdatedTs());
            }

            for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
                setReconstructedSection(builder, isin, endpoint, metadata, asOf);
            }

            FundamentalSnapshot snapshot = builder.build();
            return Optional.of(snapshot);

        } catch (IOException e) {
            log.error("Failed to reconstruct snapshot for ISIN {}: {}", isin, e.getMessage());
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    private void setReconstructedSection(FundamentalSnapshot.FundamentalSnapshotBuilder builder, String isin, FundamentalEndpoint endpoint, IsinMetadata metadata, Instant asOf) {
        SectionResponse<?> section = reconstructSection(isin, endpoint, metadata, asOf);
        switch (endpoint) {
            case PROFILE -> builder.profile((SectionResponse<CompanyProfileDto>) section);
            case BALANCE_SHEET -> builder.balanceSheet((SectionResponse<BalanceSheetContainer>) section);
            case CASH_FLOW -> builder.cashFlow((SectionResponse<CashFlowContainer>) section);
            case INCOME_STATEMENT -> builder.incomeStatement((SectionResponse<IncomeStatementContainer>) section);
            case SHARE_HOLDINGS -> builder.shareHoldings((SectionResponse<List<ShareHoldingDto>>) section);
            case KEY_RATIOS -> builder.keyRatios((SectionResponse<List<KeyRatioDto>>) section);
            case CORPORATE_ACTIONS -> builder.corporateActions((SectionResponse<List<CorporateActionDto>>) section);
            case COMPETITORS -> builder.competitors((SectionResponse<List<CompetitorDto>>) section);
        }
    }

    @SuppressWarnings("unchecked")
    private <T> SectionResponse<T> reconstructSection(String isin, FundamentalEndpoint endpoint, IsinMetadata metadata, Instant asOf) {
        HistoryRecord record = null;

        if (asOf == null && metadata != null) {
            IsinMetadata.EndpointMetadata endpointMeta = metadata.getEndpoints().get(endpoint.getKey());
            if (endpointMeta != null && endpointMeta.getOffset() >= 0) {
                record = readRecordAtOffset(isin, endpoint, endpointMeta.getOffset());
                // Integrity check: verify hash matches metadata
                if (record != null && !record.getHash().equals(endpointMeta.getHash())) {
                    log.warn("Hash mismatch for {} (ISIN: {}) at offset {}. Expected: {}, Actual: {}. Falling back to latest scan.",
                            endpoint.getKey(), isin, endpointMeta.getOffset(), endpointMeta.getHash(), record.getHash());
                    record = null;
                }
            }
        }

        if (record == null) {
            record = (asOf == null) ? readLatestRecord(isin, endpoint) : readRecordAtTimestamp(isin, endpoint, asOf);
        }

        if (record == null) {
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("HISTORY_MISSING")
                    .message("No historical data found for " + endpoint.getKey())
                    .build();
        }

        try {
            T data = (T) objectMapper.convertValue(record.getData(), endpoint.getTypeReference());
            return SectionResponseFactory.cached(data, record.getTs());
        } catch (Exception e) {
            log.error("Failed to deserialize {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("DESERIALIZATION_ERROR")
                    .message("Failed to deserialize " + endpoint.getKey())
                    .build();
        }
    }

    public HistoryRecord readLatestRecord(String isin, FundamentalEndpoint endpoint) {
        LatestRecordInfo info = readLatestRecordDetailed(isin, endpoint);
        return info != null ? info.getRecord() : null;
    }

    private HistoryRecord readRecordAtOffset(String isin, FundamentalEndpoint endpoint, long offset) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            if (offset >= raf.length()) return null;
            raf.seek(offset);
            String line = raf.readLine();
            if (line != null) {
                return objectMapper.readValue(line, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read record at offset {} for {} (ISIN: {}): {}", offset, endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private HistoryRecord readRecordAtTimestamp(String isin, FundamentalEndpoint endpoint, Instant timestamp) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            // Simple reverse scan for small files. For large files, we'd want an index.
            long pos = length - 1;
            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    long offset = (pos == 0) ? 0 : pos + 1;
                    raf.seek(offset);
                    String line = raf.readLine();
                    if (line != null && !line.trim().isEmpty()) {
                        HistoryRecord record = objectMapper.readValue(line, HistoryRecord.class);
                        if (!record.getTs().isAfter(timestamp)) {
                            return record;
                        }
                    }
                    if (pos == 0) break;
                    pos = offset - 2; // Move before the newline we just found
                } else {
                    pos--;
                }
            }
        } catch (IOException e) {
            log.error("Failed to read record at timestamp for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private LatestRecordInfo readLatestRecordDetailed(String isin, FundamentalEndpoint endpoint) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try {
            return readLastLineDetailed(historyFile.toFile());
        } catch (IOException e) {
            log.error("Failed to read latest record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private LatestRecordInfo readLastLineDetailed(File file) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            long pos = length - 1;
            raf.seek(pos);
            while (pos > 0 && raf.readByte() == '\n') {
                pos--;
                raf.seek(pos);
            }

            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    long offset = (pos == 0) ? 0 : pos + 1;
                    raf.seek(offset);

                    byte[] bytes = new byte[(int) (length - offset)];
                    raf.readFully(bytes);
                    String line = new String(bytes, StandardCharsets.UTF_8).trim();
                    if (line.isEmpty()) return null;

                    HistoryRecord record = objectMapper.readValue(line, HistoryRecord.class);
                    return new LatestRecordInfo(record, offset);
                }
                pos--;
            }
        }
        return null;
    }

    @lombok.Data
    @lombok.AllArgsConstructor
    private static class LatestRecordInfo {
        private HistoryRecord record;
        private long offset;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/service/InstrumentService.java
package com.vega.fundamentals.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class InstrumentService {

    private final String instrumentPath;
    private final ObjectMapper objectMapper;
    private final Map<String, InstrumentInfo> isinMap = new HashMap<>();
    private final Map<String, InstrumentInfo> instrumentKeyMap = new HashMap<>();

    public InstrumentService(@Value("${upstox.instrument-path}") String instrumentPath, ObjectMapper objectMapper) {
        this.instrumentPath = instrumentPath;
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void init() {
        log.info("Loading instruments from {}", instrumentPath);
        File file = new File(instrumentPath);
        if (!file.exists()) {
            log.warn("Instrument file not found at {}", instrumentPath);
            return;
        }

        try {
            JsonNode root = objectMapper.readTree(file);
            if (root.isArray()) {
                for (JsonNode node : root) {
                    String isin = node.path("isin").asText(null);
                    String instrumentKey = node.path("instrument_key").asText(null);
                    
                    InstrumentInfo info = new InstrumentInfo();
                    info.setIsin(isin);
                    info.setSymbol(node.path("trading_symbol").asText(node.path("asset_symbol").asText()));
                    info.setName(node.path("name").asText(null));
                    info.setExchange(node.path("exchange").asText());
                    info.setInstrumentKey(instrumentKey);

                    if (isin != null && !isin.isEmpty()) {
                        isinMap.put(isin, info);
                    }
                    if (instrumentKey != null && !instrumentKey.isEmpty()) {
                        instrumentKeyMap.put(instrumentKey, info);
                    }
                }
            }
            log.info("Loaded {} instruments (ISINs: {}, Keys: {}) from {}", 
                    isinMap.size(), isinMap.size(), instrumentKeyMap.size(), instrumentPath);
        } catch (IOException e) {
            log.error("Failed to load instruments: {}", e.getMessage());
        }
    }

    public InstrumentInfo getInstrument(String isin) {
        return isinMap.get(isin);
    }

    public InstrumentInfo getByInstrumentKey(String instrumentKey) {
        return instrumentKeyMap.get(instrumentKey);
    }

    public String getCompetitorInstrumentKey(String isin) {
        InstrumentInfo info = isinMap.get(isin);
        if (info == null) {
            return null;
        }
        if (info.getInstrumentKey() != null && !info.getInstrumentKey().isBlank()) {
            return info.getInstrumentKey();
        }
        return info.getExchange() + "|" + isin;
    }

    @Data
    public static class InstrumentInfo {
        private String isin;
        private String symbol;
        private String name;
        private String exchange;
        private String instrumentKey;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/util/GlobalExceptionHandler.java
package com.vega.fundamentals.util;

import jakarta.validation.ConstraintViolationException;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(ConstraintViolationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ErrorResponse.builder()
                        .status("error")
                        .message(e.getMessage())
                        .build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleAllExceptions(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse.builder()
                        .status("error")
                        .message("An unexpected error occurred: " + e.getMessage())
                        .build());
    }

    @Data
    @Builder
    public static class ErrorResponse {
        private String status;
        private String message;
    }
}
```

```java
// File: src/main/java/com/vega/fundamentals/util/SectionResponseFactory.java
package com.vega.fundamentals.util;

import com.vega.fundamentals.dto.SectionResponse;
import java.time.Duration;
import java.time.Instant;

public class SectionResponseFactory {

    public static <T> SectionResponse<T> success(T data) {
        return SectionResponse.<T>builder()
                .status("success")
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> error(String errorCode, String message, T data) {
        return SectionResponse.<T>builder()
                .status("error")
                .errorCode(errorCode)
                .message(message)
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> cached(T data, Instant fetchedTs) {
        SectionResponse<T> response = SectionResponse.<T>builder()
                .status("cached")
                .fetchedTs(fetchedTs)
                .cacheHit(true)
                .data(data)
                .build();
        
        if (fetchedTs != null) {
            response.setAgeMinutes(Duration.between(fetchedTs, Instant.now()).toMinutes());
        }
        
        return response;
    }
}
```

```yaml
// File: src/main/resources/application.yml
server:
  port: 8080
  compression:
    enabled: true
    mime-types: application/json

spring:
  application:
    name: vega.fundamentals
  threads:
    virtual:
      enabled: true

logging:
  file:
    name: logs/vega-fundamentals.log
  level:
    com.vega.fundamentals: INFO

upstox:
  env-path: /root/fundamentals/auth/upstox/auth.upstox.json
  instrument-path: /root/fundamentals/data/instruments/upstox/upstox.json

storage:
  cache:
    fundamentals-path: /root/fundamentals/storage/cache/fundamentals/
  history:
    fundamentals-path: /root/fundamentals/storage/history/fundamentals/
```

```jsonl
// File: history/fundamentals/IN9397D01014/balanceSheet.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.495165492Z","hash":"350782e2c813b11bec1d27950107ad022a6d69d53961be3f2c642f759cf4d8ad","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","history":[],"time_period":"yearly","units_in":"crore","full_statement":[]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/IN9397D01014/cashFlow.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.503311338Z","hash":"3b13751d193f8deebf77d77e0636773b401e6c7d59d81c01125094fc65942b09","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","cash_flow":[{"category":"operating","history":[]},{"category":"investing","history":[]},{"category":"financing","history":[]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/IN9397D01014/competitors.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.567949107Z","hash":"59be13d89da7a7f9865d286f28838709c9b6a6861df8dff9c368723b63c3835d","data":[{"isin":"INE397D01024","symbol":"BHARTIARTL","exchange":"NSE","sector":"Telecommunication","instrument_key":"NSE_EQ|INE397D01024","company_name":"BHARTI AIRTEL LIMITED","company_profile":"Bharti Airtel Limited is a telecommunication company. It operates through two business divisions: India & South Asia and Africa. Its B2C Services consists of Mobile Services (India), Homes Services, and Digital TV Services. Its B2B Services consists of Airtel Business, Passive Infrastructure Services and South Asia. Its Mobile Services (India) segment offers postpaid, pre-paid, roaming, Internet and other value-added services. Its Homes Services segment provides fixed-line telephone and broadband services for homes in approximately 1,512 cities. Its Digital TV Services provides direct-to-home platform, which offers a total of 709 channels including 99 HD channels, 67 SVOD services, four international channels and five interactive services. Its Airtel Business segment offers fixed-line voice (PRIs), data and other connectivity solutions, such as Multi-Protocol Label Switching, Voice over Internet Protocol, SIP trucking. Its South Asia segment represents its operation in Bangladesh.","sector_market_cap_inr":{"value":1110530.63,"unit":"crore","formatted":"1,110,530.63 Cr"},"sector_market_cap_usd":{"value":123.39,"unit":"billion","formatted":"$123.39B"}},{"isin":"INE669E01016","symbol":"IDEA","exchange":"NSE","sector":"Telecommunication","instrument_key":"NSE_EQ|INE669E01016","company_name":"VODAFONE IDEA LIMITED","company_profile":"Vodafone Idea Limited is an India-based telecom service provider. The Company is engaged in the business of telecommunication services. It provides pan-India voice and data services across second-generation (2G), third generation (3G) and fourth generation (4G) platforms. Its Vodafone Idea business services provide communication solutions to global and Indian corporations, public sector and government bodies, small and medium enterprises, and start-ups. The Company’s services include Voice Services, Broadband Services, Content and Digital Offerings, and Other Value-Added Services (VAS) Offerings. It offers a variety of other VAS offerings, including Voice and SMS based services such as caller tunes, voice & SMS chat and Utility services such as missed call alerts. Its subsidiaries include Vodafone Foundation, Vodafone Idea Business Services Limited, Vodafone Idea Communication Systems Limited, Vodafone Idea Manpower Services Limited, among others.","sector_market_cap_inr":{"value":161431.12,"unit":"crore","formatted":"161,431.12 Cr"},"sector_market_cap_usd":{"value":17.94,"unit":"billion","formatted":"$17.94B"}},{"isin":"INE343G01021","symbol":"BHARTIHEXA","exchange":"NSE","sector":"Telecom-Service","instrument_key":"NSE_EQ|INE343G01021","company_name":"BHARTI HEXACOM LIMITED","company_profile":"Bharti Hexacom Limited is a communications solutions provider. It offers consumer mobile services, fixed-line telephone and broadband services to customers in the Rajasthan and the Northeast telecommunication circles in India, which comprises the states of Arunachal Pradesh, Manipur, Meghalaya, Mizoram, Nagaland, and Tripura. It offers services under the brand Airtel. Its business divisions include Mobile Services and Homes and Office Services. The Mobile Services division offers postpaid, pre-paid, roaming, high-speed Internet access and a host of services like Airtel television (TV), video calls, live-streaming videos, gaming, and buffer-less High Definition (HD). The Homes and Office Services division offers fixed-line telephone and broadband services for homes. Its digital services include Airtel Payments Bank, Airtel Xstream, Airtel Thanks, Airtel Wynk (music streaming) and Direct-to-Home (Digital TV). It offers local, national, and international long-distance telephone services.","sector_market_cap_inr":{"value":73997.5,"unit":"crore","formatted":"73,997.50 Cr"},"sector_market_cap_usd":{"value":8.22,"unit":"billion","formatted":"$8.22B"}},{"isin":"INE151A01013","symbol":"TATACOMM","exchange":"NSE","sector":"Telecommunication","instrument_key":"NSE_EQ|INE151A01013","company_name":"TATA COMMUNICATIONS LTD","company_profile":"Tata Communications Limited is an India-based communications technology company. The Company enables digital transformation for enterprises globally. It delivers services powered by cloud, mobility, Internet of Things (IoT), collaboration, security, and network services. Its segments include Voice Solutions, Data Services, Transformation Services, Real Estate and Campaign Registry. The Voice Solutions segment includes international and national long-distance voice services. The Data Services segment includes core and Nextgen connectivity services, digital platforms and connected services. The Transformation Services segment includes the business of providing telecommunication network management and support services. The Real Estate segment includes rentals for premises given on lease. The Campaign Registry segment includes the business of collecting robotically driven campaign information and processing and sharing that information with mobile operators and the messaging ecosystem.","sector_market_cap_inr":{"value":56002.5,"unit":"crore","formatted":"56,002.50 Cr"},"sector_market_cap_usd":{"value":6.22,"unit":"billion","formatted":"$6.22B"}},{"isin":"INE517B01013","symbol":"TTML","exchange":"NSE","sector":"Telecommunication","instrument_key":"NSE_EQ|INE517B01013","company_name":"TATA TELESERV(MAHARASTRA)","company_profile":"Tata Teleservices (Maharashtra) Limited is engaged in the business of providing telecommunication services. The Company, equipped with Unified Licenses (UL)-access service authorization, operates in Mumbai and Maharashtra License Service Area (LSA), caters to the regions of Maharashtra and Goa. It operates under the brand name of Tata Tele Business Services and offers a comprehensive suite of smart digital solutions comprising Network & Connectivity, Business Communications, Security, Marketing, and Managed Services. Its Network & Connectivity includes Business Wi-Fi, Smart WAN, Internet Leased Line and Broadband. Its Business Communication includes Outbound & Marketing Communications, Inbound Communications, and Integrated Solutions. Its Smartflo UCaaS offers business communication by integrating Microsoft Teams and PSTN. Its Smart Internet Telephony offers voice services over the internet. Its EZ Cloud Connect provides secure connectivity across offices, data centers and cloud ports.","sector_market_cap_inr":{"value":9076.73,"unit":"crore","formatted":"9,076.73 Cr"},"sector_market_cap_usd":{"value":1.01,"unit":"billion","formatted":"$1.01B"}},{"isin":"INE153A01019","symbol":"MTNL","exchange":"NSE","sector":"Telecommunication","instrument_key":"NSE_EQ|INE153A01019","company_name":"MAHANAGAR TELEPHONE NIGAM","company_profile":"Mahanagar Telephone Nigam Limited is an India-based telecommunication services company. The Company is a provider of fixed-line telecommunication service in the two metropolitan cities of Delhi and Mumbai. Its segments include Basic and Cellular. Its mobile services include prepaid, postpaid, third generation (3G) data plans, 3G settings, mobile television, international calling, value-added services, mobile connection requests, and mobile recharge. It also provides toll-free services, leased circuits, Web hosting, industrial training, toll-free services, universal access numbers, and virtual card calling. It offers mobile services in the city of Delhi, including Noida, Gurgaon, Faridabad and Ghaziabad and the Mumbai city, along with the areas falling under the Mumbai Municipal Corporation, New Mumbai Corporation and Thane Municipal Corporation. Its subsidiaries include Mahanagar Telephone (Mauritius) Limited, Millennium Telecom Limited, MTML International Limited and others.","sector_market_cap_inr":{"value":1942.29,"unit":"crore","formatted":"1,942.29 Cr"},"sector_market_cap_usd":{"value":215.81,"unit":"million","formatted":"$215.81M"}},{"isin":"INE982F01036","symbol":"HATHWAY","exchange":"NSE","sector":"Telecommunication","instrument_key":"NSE_EQ|INE982F01036","company_name":"HATHWAY CABLE & DATACOM","company_profile":"Hathway Cable and Datacom Limited is an India-based cable broadband service provider. The Company is engaged in the distribution of Internet services through cable (broadband). The Company’s segments include Broadband Business, Cable Television Business, and Dealing in securities. Its Broadband Business segment is a cable television service provider and offers high-speed cable broadband services in over 16 cities (4 metros and 3 mini-metros). The Company offers its Cable Television services to over 350 cities and towns, operating a presence across nation (pan) India regions. Its business broadband services include Fiber Internet Services, Multi Office Connectivity, Dedicated fiber Internet services, and Internet Leased Line. The Company also caters to a diverse range of customers with over-the-top (OTT) offerings. Its subsidiaries include Hathway Digital Limited, Hathway Bhawani Cabletel & Datacom Limited, Channels India Network Private Limited, and others.","sector_market_cap_inr":{"value":1892.24,"unit":"crore","formatted":"1,892.24 Cr"},"sector_market_cap_usd":{"value":210.25,"unit":"million","formatted":"$210.25M"}},{"isin":"INE1VXE01018","symbol":"STLNETWORK","exchange":"NSE","sector":"Telecom-Service","instrument_key":"NSE_EQ|INE1VXE01018","company_name":"STL NETWORKS LIMITED","company_profile":"STL Networks Limited is an India-based company. The Company operates through its brand Invenia, which is a digital infrastructure and information technology (IT) services company. The Company’s services include cloud services, cybersecurity services, data center services, fiber services, managed services, and network services. Its cloud services include cloud-design and consultancy, cloud infrastructure services, cloud transformation and migration, and cloud-native enablement services. Its cybersecurity services include cybersecurity consulting services, security architecture and engineering services, security audit and compliance services, and security operations. Its data center services include data center - design and advisory, end-to-end data center-build, and data center inter-connectivity. Its industries include defense, energy and utilities, government, healthcare, mining, telecom and transport.","sector_market_cap_inr":{"value":1345.14,"unit":"crore","formatted":"1,345.14 Cr"},"sector_market_cap_usd":{"value":149.46,"unit":"million","formatted":"$149.46M"}},{"isin":"INE809I01019","symbol":"ONMOBILE","exchange":"NSE","sector":"IT - Software","instrument_key":"NSE_EQ|INE809I01019","company_name":"ONMOBILE GLOBAL LTD.","company_profile":"OnMobile Global Limited is an India-based mobile gaming and entertainment company. The Company's portfolio includes mobile gaming products like Challenges Arena and ONMO, the gamification platform (Gamize) and a diverse range of mobile entertainment products such as Tones, Videos and Contests. Challenges Arena provides gamers with an immersive platform to play, compete, and connect with friends through engaging quizzes and captivating theme-based challenges. ONMO blends streaming, social gaming, e-sports, and artificial intelligence (AI) into a mobile gaming offering. Gamize products include gamification and loyalty program. The Company provides Ring Back Tones (RBT) service in partnership with telecom operators. Videos & Editorials, its white label video streaming solution, offers bite-sized entertainment along with long-form sports and kids content/videos. Its mobile contest platform features a content library, instant gratification, fair winner selection and real prizes.","sector_market_cap_inr":{"value":525.44,"unit":"crore","formatted":"525.44 Cr"},"sector_market_cap_usd":{"value":58.38,"unit":"million","formatted":"$58.38M"}},{"isin":"INE330H01018","symbol":"RCOM","exchange":"NSE","sector":"Telecommunication","instrument_key":"NSE_EQ|INE330H01018","company_name":"RELIANCE COMMUNICATIONS L","company_profile":"Reliance Communications Limited is an India-based telecommunication service provider with businesses including the National/ International long-distance business. The Company is focused on providing complete telephony services to its clients. It provides wireline and wireless telecom services to the business and government segments. These include a comprehensive portfolio spanning network connectivity, enterprise voice, cloud telephony, access number services, collaboration services, wholesale voice and value-added service (VAS). The Company serves approximately 1,960 businesses of all sizes, from multinational conglomerates to small and medium-sized enterprises (SMEs) belonging to almost every vertical including banking, financial services and insurance (BFSI), manufacturing, logistics, healthcare, information technology (IT) and information technology-enabled services (ITeS), and over the top (OTT). Its cloud PBX solutions offer a full suite of analytics and management tools.","sector_market_cap_inr":{"value":259.96,"unit":"crore","formatted":"259.96 Cr"},"sector_market_cap_usd":{"value":28.88,"unit":"million","formatted":"$28.88M"}}]}
```

```jsonl
// File: history/fundamentals/IN9397D01014/corporateActions.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.544014953Z","hash":"4f53cda18c2baa0c0354bb5f9a3ecbe5ed12ab4d8e11ba873c2f11161202b945","data":[]}
```

```jsonl
// File: history/fundamentals/IN9397D01014/incomeStatement.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.515998338Z","hash":"c0d5fa32457dde227c751b05035e8415e9df617122841d21d5e72d9bdb77b0f0","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","income_statement":[{"category":"revenue","history":[]},{"category":"operating_profit","history":[]},{"category":"net_profit","history":[]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/IN9397D01014/keyRatios.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.535814338Z","hash":"4f53cda18c2baa0c0354bb5f9a3ecbe5ed12ab4d8e11ba873c2f11161202b945","data":[]}
```

```json
// File: history/fundamentals/IN9397D01014/metadata.json
{"schemaVersion":"1.0","isin":"IN9397D01014","symbol":null,"companyName":null,"exchange":null,"createdTs":"2026-06-14T03:42:00.477652876Z","firstSeenTs":"2026-06-14T03:42:00.477652876Z","lastUpdatedTs":"2026-06-14T03:42:00.567949107Z","endpoints":{"balanceSheet":{"version":1,"hash":"350782e2c813b11bec1d27950107ad022a6d69d53961be3f2c642f759cf4d8ad","lastUpdatedTs":"2026-06-14T03:42:00.495165492Z","offset":0},"cashFlow":{"version":1,"hash":"3b13751d193f8deebf77d77e0636773b401e6c7d59d81c01125094fc65942b09","lastUpdatedTs":"2026-06-14T03:42:00.503311338Z","offset":0},"competitors":{"version":1,"hash":"59be13d89da7a7f9865d286f28838709c9b6a6861df8dff9c368723b63c3835d","lastUpdatedTs":"2026-06-14T03:42:00.567949107Z","offset":0},"corporateActions":{"version":1,"hash":"4f53cda18c2baa0c0354bb5f9a3ecbe5ed12ab4d8e11ba873c2f11161202b945","lastUpdatedTs":"2026-06-14T03:42:00.544014953Z","offset":0},"incomeStatement":{"version":1,"hash":"c0d5fa32457dde227c751b05035e8415e9df617122841d21d5e72d9bdb77b0f0","lastUpdatedTs":"2026-06-14T03:42:00.515998338Z","offset":0},"keyRatios":{"version":1,"hash":"4f53cda18c2baa0c0354bb5f9a3ecbe5ed12ab4d8e11ba873c2f11161202b945","lastUpdatedTs":"2026-06-14T03:42:00.535814338Z","offset":0},"profile":{"version":1,"hash":"2fafeaa55949132bc33e0eeb6f1aa0d38039dfa23dc574f7e385625ccff00ddf","lastUpdatedTs":"2026-06-14T03:42:00.487621800Z","offset":0},"shareHoldings":{"version":1,"hash":"4f53cda18c2baa0c0354bb5f9a3ecbe5ed12ab4d8e11ba873c2f11161202b945","lastUpdatedTs":"2026-06-14T03:42:00.526865107Z","offset":0}}}
```

```jsonl
// File: history/fundamentals/IN9397D01014/profile.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.487621800Z","hash":"2fafeaa55949132bc33e0eeb6f1aa0d38039dfa23dc574f7e385625ccff00ddf","data":{"fetchedTs":null,"sector":"Other","company_profile":null,"sector_market_cap_inr":{"value":176.42,"unit":"crore","formatted":"176.42 Cr"},"sector_market_cap_usd":{"value":19.6,"unit":"million","formatted":"$19.60M"}}}
```

```jsonl
// File: history/fundamentals/IN9397D01014/shareHoldings.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:42:00.526865107Z","hash":"4f53cda18c2baa0c0354bb5f9a3ecbe5ed12ab4d8e11ba873c2f11161202b945","data":[]}
```

```jsonl
// File: history/fundamentals/INE002A01018/balanceSheet.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.507198950Z","hash":"91be9b9ea30f3542de7afea3f76042eac4711777b8449f558e6bfa174b9efb20","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","history":[{"period":"Mar 2026","total_asset":2178140.0,"total_liability":1092274.0},{"period":"Mar 2025","total_asset":1950121.0,"total_liability":940495.0},{"period":"Mar 2024","total_asset":1755986.0,"total_liability":830198.0},{"period":"Mar 2023","total_asset":1607431.0,"total_liability":778550.0}],"time_period":"yearly","units_in":"crore","full_statement":[{"particular":"Non-Current Assets","history":[{"period":"Mar 2026","value":1583891.0},{"period":"Mar 2025","value":1450851.0},{"period":"Mar 2024","value":1285886.0},{"period":"Mar 2023","value":1182135.0}]},{"particular":"Current Assets","history":[{"period":"Mar 2026","value":594249.0},{"period":"Mar 2025","value":499270.0},{"period":"Mar 2024","value":470100.0},{"period":"Mar 2023","value":425296.0}]},{"particular":"Total Assets","history":[{"period":"Mar 2026","value":2178140.0},{"period":"Mar 2025","value":1950121.0},{"period":"Mar 2024","value":1755986.0},{"period":"Mar 2023","value":1607431.0}]},{"particular":"Current Liabilities","history":[{"period":"Mar 2026","value":541254.0},{"period":"Mar 2025","value":453737.0},{"period":"Mar 2024","value":397367.0},{"period":"Mar 2023","value":395743.0}]},{"particular":"Net Current Asset","history":[{"period":"Mar 2026","value":52995.0},{"period":"Mar 2025","value":45533.0},{"period":"Mar 2024","value":72733.0},{"period":"Mar 2023","value":29553.0}]},{"particular":"Non-Current Liabilities","history":[{"period":"Mar 2026","value":551020.0},{"period":"Mar 2025","value":486758.0},{"period":"Mar 2024","value":432831.0},{"period":"Mar 2023","value":382807.0}]},{"particular":"Equity Capital","history":[{"period":"Mar 2026","value":1085866.0},{"period":"Mar 2025","value":1009626.0},{"period":"Mar 2024","value":925788.0},{"period":"Mar 2023","value":828881.0}]},{"particular":"Total Equity & Liabilities","history":[{"period":"Mar 2026","value":2178140.0},{"period":"Mar 2025","value":1950121.0},{"period":"Mar 2024","value":1755986.0},{"period":"Mar 2023","value":1607431.0}]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE002A01018/cashFlow.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.515409180Z","hash":"4b520290ed57a12c5ba578cc606d50cc391f72fb1397cee0432f9f58d2c5fc0b","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","cash_flow":[{"category":"operating","history":[{"value":192113.0,"period":"Mar 2026","change":"+7.5%"},{"value":178703.0,"period":"Mar 2025","change":"+12.54%"},{"value":158788.0,"period":"Mar 2024","change":"+38.04%"},{"value":115032.0,"period":"Mar 2023","change":null}]},{"category":"investing","history":[{"value":-101089.0,"period":"Mar 2026","change":"+26.5%"},{"value":-137535.0,"period":"Mar 2025","change":"-21.09%"},{"value":-113581.0,"period":"Mar 2024","change":"-24.49%"},{"value":-91235.0,"period":"Mar 2023","change":null}]},{"category":"financing","history":[{"value":-51549.0,"period":"Mar 2026","change":"-61.64%"},{"value":-31891.0,"period":"Mar 2025","change":"-91.58%"},{"value":-16646.0,"period":"Mar 2024","change":"-259.22%"},{"value":10455.0,"period":"Mar 2023","change":null}]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE002A01018/competitors.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.540355257Z","hash":"fa14adebd910a1cb7d3ed4cf3fe6c61f0540efce2adb71bbd3e9ac0920eb93ed","data":[{"isin":"INE242A01010","symbol":"IOC","exchange":"NSE","sector":"Refineries","instrument_key":"NSE_EQ|INE242A01010","company_name":"INDIAN OIL CORP LTD","company_profile":"Indian Oil Corporation Limited is an India-based oil company. The Company's segments include Petroleum Products, Petrochemicals, Gas, and Other Business Activities. Its Other Business Activities segment includes oil and gas exploration activities, explosives and cryogenic business, and wind mill and solar power generation. Its business interests span the entire hydrocarbon value-chain, ranging from refining (downstream), pipeline transportation and marketing to exploration and production of petrochemicals, natural gas and alternative energy. Its downstream business includes city gas distribution (CGD), natural gas supply to bulk consumers, and distribution and marketing of LPG and Industrial Fuels. Its green energy portfolio focuses on CBG and sustainable aviation fuel (SAF). It owns and operates approximately 10 refineries across India. Its subsidiaries include Chennai Petroleum Corporation Limited, IndianOil (Mauritius) Limited, IOC Sweden AB, and IndOil Global B.V., among others.","sector_market_cap_inr":{"value":199038.86,"unit":"crore","formatted":"199,038.86 Cr"},"sector_market_cap_usd":{"value":22.12,"unit":"billion","formatted":"$22.12B"}},{"isin":"INE029A01011","symbol":"BPCL","exchange":"NSE","sector":"Refineries","instrument_key":"NSE_EQ|INE029A01011","company_name":"BHARAT PETROLEUM CORP  LT","company_profile":"Bharat Petroleum Corporation Limited is an India-based company, which is engaged in the refining of crude oil and marketing of petroleum products. Its segments include Downstream Petroleum and Exploration & Production of Hydrocarbons. Its businesses include fuels and services, Bharatgas, MAK lubricants, aviation services, gas, industrial and commercial, international trade, proficiency testing, and pipelines. It has a variety of product offerings, like petrol, diesel, automotive LPG and CNG along with premium petrol products like Speed and Speed 97. It offers specialized fuel station formats like Ghar, Highway Star, Pure for Sure, and other such services. MAK Lubricants provides lubricants and greases in India and international markets. It has refineries in Mumbai, Kochi and Bina, LPG bottling plants and Lube blending plants at various locations. Its marketing infrastructure includes a network of installations, depots, retail outlets, aviation fueling stations and LPG distributors.","sector_market_cap_inr":{"value":131109.64,"unit":"crore","formatted":"131,109.64 Cr"},"sector_market_cap_usd":{"value":14.57,"unit":"billion","formatted":"$14.57B"}},{"isin":"INE094A01015","symbol":"HINDPETRO","exchange":"NSE","sector":"Refineries","instrument_key":"NSE_EQ|INE094A01015","company_name":"HINDUSTAN PETROLEUM CORP","company_profile":"Hindustan Petroleum Corporation Limited is engaged in the business of refining of crude oil and marketing of petroleum products, production of hydrocarbons and providing services for management of exploration and production (E&P) blocks, manufacturing of ethanol, sugar and generation of power, operating liquefied natural gas (LNG) regasification terminal (under construction phase), green and renewable energy business. Its Downstream Petroleum segment is engaged in refining and marketing of petroleum products. Its businesses include HP Refineries, HP Retail (Petrol Pumps); HP Gas (LPG); HP Lubricants; HP Aviation; HP Direct Sales; HP Projects and Pipelines; HP Supplies, Operations and Distribution (SOD); HP International Trade; HP Natural Gas and Renewables; HP Natural Gas; HP Petrochemicals, and HP Research and Development. It exports various petroleum products from its refineries, including Fuel Oil, naphtha, high sulphur gasoil, and high sulphur gasoline.","sector_market_cap_inr":{"value":82719.1,"unit":"crore","formatted":"82,719.10 Cr"},"sector_market_cap_usd":{"value":9.19,"unit":"billion","formatted":"$9.19B"}},{"isin":"INE103A01014","symbol":"MRPL","exchange":"NSE","sector":"Refineries","instrument_key":"NSE_EQ|INE103A01014","company_name":"MRPL","company_profile":"Mangalore Refinery and Petrochemicals Limited (MRPL) is an India-based company engaged in the business of refining of crude oil. The Company operates through the Petroleum Products segment. It offers various direct sales products such as Bitumen, Diesel, Sulfur, Petcoke, ATF (thru' JV), Polypropylene, Xylol (Xylenes), and others. Its refinery has producing capacity of a range of petroleum products like Naphtha, liquified petroleum gas (LPG), Motor Spirit, High-Speed Diesel, Kerosene, Aviation Turbine Fuel, Sulfur, Xylene, Bitumen along with Pet Coke, and Polypropylene. It operates an Aromatic Complex, a petrochemical unit capable of producing 0.905 MMTPA of Para Xylene and 0.273 MMTPA of Benzene. MRPL has two Captive Jetties in New Mangalore Port Trust (NMPT), Single Point Mooring Facility, While Oil Loading Facility, Rail Wagon Loading Silo for Petcoke, and Truck Loading Silos for Petcoke. The Company is a subsidiary of Oil and Natural Gas Corporation Limited.","sector_market_cap_inr":{"value":28208.08,"unit":"crore","formatted":"28,208.08 Cr"},"sector_market_cap_usd":{"value":3.13,"unit":"billion","formatted":"$3.13B"}},{"isin":"INE178A01016","symbol":"CHENNPETRO","exchange":"NSE","sector":"Refineries","instrument_key":"NSE_EQ|INE178A01016","company_name":"CHENNAI PETROLEUM CORP LT","company_profile":"Chennai Petroleum Corporation Limited is an India-based refining company, which is engaged in the processing of crude oil into refined petroleum products and other products. Its refineries include the Manali Refinery and Cauvery Basin Refinery. The Manali Refinery located at North Chennai has a capacity of 10.5 MMTPA. The main products of the refinery are liquefied petroleum gas (LPG), Motor Spirit, Superior Kerosene, Aviation Turbine Fuel, High Speed Diesel, Naphtha, Bitumen, Lube Base Stocks, Paraffin Wax, Fuel Oil, Hexane and Petrochemical feed stocks. Its second refinery is located at Cauvery Basin at Nagapattinam, which is set up with a capacity of approximately 1.0 MMTPA. Its specialty products include Hexane (Food Grade), Paraffin Wax, Micro Crystalline Wax, Sulphur, Pet coke (Fuel Grade), Mineral Turpentine Oil, Propylene, Poly Butene Feed Stock, Methyl Ethyl Ketone (MEK) Feed Stock, and others. Its fuel products include light diesel oil (LDO), Motor Gasoline, and others.","sector_market_cap_inr":{"value":16921.55,"unit":"crore","formatted":"16,921.55 Cr"},"sector_market_cap_usd":{"value":1.88,"unit":"billion","formatted":"$1.88B"}},{"isin":"INE717W01049","symbol":"GANDHAR","exchange":"NSE","sector":"Lubricants","instrument_key":"NSE_EQ|INE717W01049","company_name":"GANDHAR OIL REFINE IND L","company_profile":"Gandhar Oil Refinery (India) Limited is an India-based company, which is engaged in the specialty oil industry. The Company manufactures and trades petroleum products / specialty oils, trading in non-coking coal and provides consignment / del-credere agency services for the sale of polymers to local markets. It manufactures white oils and other allied products that have applications in cosmetics, healthcare, and pharmaceuticals. Its products category includes industrial oil, which includes lube oil, hydraulic oil, and spark erosion oil; automotive oil, which includes agricultural oil and CNG engine oil; mineral oil & petroleum jelly, which include spray oil and white petroleum jelly, and rubber process oil. Its products are marketed under the Divyol brand. It operates three manufacturing facilities in Taloja (Maharashtra), Silvassa (Dadra and Nagar Haveli), and Sharjah (UAE). Its subsidiaries include Gandhar Shipping & Logistics Pvt. Ltd., Gandhar Foundation, and Texol Lubritech FZC.","sector_market_cap_inr":{"value":1565.09,"unit":"crore","formatted":"1,565.09 Cr"},"sector_market_cap_usd":{"value":173.9,"unit":"million","formatted":"$173.90M"}}]}
```

```jsonl
// File: history/fundamentals/INE002A01018/corporateActions.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.535979027Z","hash":"cc5bf877f5d1dec853d25ef19646a5506880eb0287aa18c491d72618576d4bc9","data":[{"name":"Dividend","amount":6.0,"ratio":null,"expiry_date":"05 Jun 2026","event_details":[{"name":"Announcement date","value":"24 Apr 2026"},{"name":"Ex dividend date","value":"05 Jun 2026"},{"name":"Record date","value":"05 Jun 2026"},{"name":"Dividend type","value":"Final"},{"name":"Amount","value":"6.0"},{"name":"Dividend %","value":"60.0"},{"name":"Details","value":"Rs.6.0000 per share(60%)Final Dividend"}]},{"name":"Dividend","amount":5.5,"ratio":null,"expiry_date":"14 Aug 2025","event_details":[{"name":"Announcement date","value":"25 Apr 2025"},{"name":"Ex dividend date","value":"14 Aug 2025"},{"name":"Record date","value":"14 Aug 2025"},{"name":"Dividend type","value":"Final"},{"name":"Amount","value":"5.5"},{"name":"Dividend %","value":"55.0"},{"name":"Details","value":"Rs.5.5000 per share(55%)Final Dividend"}]}]}
```

```jsonl
// File: history/fundamentals/INE002A01018/incomeStatement.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.522310719Z","hash":"9d98e06937eab2bdefece2c05be474e0c7a5004ee007fdc6607a1dca138639de","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","income_statement":[{"category":"revenue","history":[{"value":1086181.0,"period":"Mar 2026","change":"+10.53%"},{"value":982671.0,"period":"Mar 2025","change":"+7.15%"},{"value":917121.0,"period":"Mar 2024","change":"+3.1%"},{"value":889569.0,"period":"Mar 2023","change":null}]},{"category":"operating_profit","history":[{"value":123162.0,"period":"Mar 2026","change":"+16.17%"},{"value":106017.0,"period":"Mar 2025","change":"+1.61%"},{"value":104340.0,"period":"Mar 2024","change":"+10.95%"},{"value":94046.0,"period":"Mar 2023","change":null}]},{"category":"net_profit","history":[{"value":95610.0,"period":"Mar 2026","change":"+18.35%"},{"value":80787.0,"period":"Mar 2025","change":"+2.74%"},{"value":78633.0,"period":"Mar 2024","change":"+6.13%"},{"value":74088.0,"period":"Mar 2023","change":null}]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE002A01018/keyRatios.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.532088180Z","hash":"51626a0c81e5fa541e60213160a0b00c79fc9561b6be11bdc638805645c891ef","data":[{"name":"P/E","company_value":"22.52","sector_value":"11.44"},{"name":"P/B","company_value":"2.01","sector_value":"1.4"},{"name":"ROA","company_value":"4.88%","sector_value":"7.82%"},{"name":"ROE","company_value":"10.94%","sector_value":"18.46%"},{"name":"ROCE","company_value":"10.58%","sector_value":"18.55%"},{"name":"Quick Ratio","company_value":"0.79","sector_value":"0.79"},{"name":"EV/EBITDA","company_value":"9.99","sector_value":"6.57"}]}
```

```json
// File: history/fundamentals/INE002A01018/metadata.json
{"schemaVersion":"1.0","isin":"INE002A01018","symbol":"RELIANCE","companyName":"RELIANCE INDUSTRIES LTD","exchange":"NSE","createdTs":"2026-06-14T03:40:57.447494334Z","firstSeenTs":"2026-06-14T03:40:57.447494334Z","lastUpdatedTs":"2026-06-14T03:40:57.540355257Z","endpoints":{"balanceSheet":{"version":1,"hash":"91be9b9ea30f3542de7afea3f76042eac4711777b8449f558e6bfa174b9efb20","lastUpdatedTs":"2026-06-14T03:40:57.507198950Z","offset":0},"cashFlow":{"version":1,"hash":"4b520290ed57a12c5ba578cc606d50cc391f72fb1397cee0432f9f58d2c5fc0b","lastUpdatedTs":"2026-06-14T03:40:57.515409180Z","offset":0},"competitors":{"version":1,"hash":"fa14adebd910a1cb7d3ed4cf3fe6c61f0540efce2adb71bbd3e9ac0920eb93ed","lastUpdatedTs":"2026-06-14T03:40:57.540355257Z","offset":0},"corporateActions":{"version":1,"hash":"cc5bf877f5d1dec853d25ef19646a5506880eb0287aa18c491d72618576d4bc9","lastUpdatedTs":"2026-06-14T03:40:57.535979027Z","offset":0},"incomeStatement":{"version":1,"hash":"9d98e06937eab2bdefece2c05be474e0c7a5004ee007fdc6607a1dca138639de","lastUpdatedTs":"2026-06-14T03:40:57.522310719Z","offset":0},"keyRatios":{"version":1,"hash":"51626a0c81e5fa541e60213160a0b00c79fc9561b6be11bdc638805645c891ef","lastUpdatedTs":"2026-06-14T03:40:57.532088180Z","offset":0},"profile":{"version":1,"hash":"461ec8e51bc472ec7a2918082ad43e4e8090b8af82beb2d3689077496af2dd0c","lastUpdatedTs":"2026-06-14T03:40:57.470156873Z","offset":0},"shareHoldings":{"version":1,"hash":"247a7336ab896306936d44ef62d0b025b156eee479fea44b5de5fee39d2abf74","lastUpdatedTs":"2026-06-14T03:40:57.528238334Z","offset":0}}}
```

```jsonl
// File: history/fundamentals/INE002A01018/profile.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.470156873Z","hash":"461ec8e51bc472ec7a2918082ad43e4e8090b8af82beb2d3689077496af2dd0c","data":{"fetchedTs":null,"sector":"Refineries","company_profile":"Reliance Industries Limited is engaged in the activities of hydrocarbon exploration and production, petroleum refining and marketing, petrochemicals, advanced materials and composites, renewables, retail and digital services. The Company’s segments include Oil to Chemicals (O2C), Oil and Gas, Retail, and Digital Services. The O2C segment covers refining, petrochemicals, fuel retailing, aviation fuel, and bulk wholesale marketing, with a portfolio that includes transportation fuels, polymers, polyesters, and elastomers. The Oil and Gas segment focuses on the exploration, development, and production of crude oil and natural gas. The Retail segment involves consumer retail and related services. The Digital Services segment provides a range of digital services. It also operates an oncology-focused healthcare platform, which focuses on technology-driven cancer care. Its subsidiaries include 7-India Convenience Retail Limited, Amante India Limited, Cover Story Clothing Limited, and others.","sector_market_cap_inr":{"value":1749418.46,"unit":"crore","formatted":"1,749,418.46 Cr"},"sector_market_cap_usd":{"value":194.38,"unit":"billion","formatted":"$194.38B"}}}
```

```jsonl
// File: history/fundamentals/INE002A01018/shareHoldings.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:40:57.528238334Z","hash":"247a7336ab896306936d44ef62d0b025b156eee479fea44b5de5fee39d2abf74","data":[{"category":"promoters","history":[{"period":"Mar 2026","value":50.0},{"period":"Dec 2025","value":50.01},{"period":"Sep 2025","value":50.01},{"period":"Jun 2025","value":50.07}]},{"category":"fii","history":[{"period":"Mar 2026","value":18.67},{"period":"Dec 2025","value":19.09},{"period":"Sep 2025","value":18.65},{"period":"Jun 2025","value":19.21}]},{"category":"other_dii","history":[{"period":"Mar 2026","value":10.77},{"period":"Dec 2025","value":10.66},{"period":"Sep 2025","value":10.67},{"period":"Jun 2025","value":10.48}]},{"category":"retail_and_other","history":[{"period":"Mar 2026","value":10.79},{"period":"Dec 2025","value":10.73},{"period":"Sep 2025","value":11.01},{"period":"Jun 2025","value":10.92}]},{"category":"mutual_funds","history":[{"period":"Mar 2026","value":9.78},{"period":"Dec 2025","value":9.52},{"period":"Sep 2025","value":9.66},{"period":"Jun 2025","value":9.32}]}]}
```

```jsonl
// File: history/fundamentals/INE397D01024/balanceSheet.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:37.980372875Z","hash":"6ef7e2c8f1c423fdd23f7ddc18266e6f4c5697b9d9f616719e03232685ff869a","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","history":[{"period":"Mar 2025","total_asset":514360.4,"total_liability":360892.7},{"period":"Mar 2024","total_asset":444531.0,"total_liability":338967.1},{"period":"Mar 2023","total_asset":446633.2,"total_liability":340188.9},{"period":"Mar 2022","total_asset":363656.0,"total_liability":271721.0}],"time_period":"yearly","units_in":"crore","full_statement":[{"particular":"Non-Current Assets","history":[{"period":"Mar 2025","value":446771.6},{"period":"Mar 2024","value":386254.9},{"period":"Mar 2023","value":389131.9},{"period":"Mar 2022","value":311628.1}]},{"particular":"Current Assets","history":[{"period":"Mar 2025","value":67588.8},{"period":"Mar 2024","value":58276.1},{"period":"Mar 2023","value":57501.3},{"period":"Mar 2022","value":52027.9}]},{"particular":"Total Assets","history":[{"period":"Mar 2025","value":514360.4},{"period":"Mar 2024","value":444531.0},{"period":"Mar 2023","value":446633.2},{"period":"Mar 2022","value":363656.0}]},{"particular":"Current Liabilities","history":[{"period":"Mar 2025","value":180440.2},{"period":"Mar 2024","value":138667.8},{"period":"Mar 2023","value":121963.8},{"period":"Mar 2022","value":114026.0}]},{"particular":"Net Current Asset","history":[{"period":"Mar 2025","value":-112851.4},{"period":"Mar 2024","value":-80391.7},{"period":"Mar 2023","value":-64462.5},{"period":"Mar 2022","value":-61998.1}]},{"particular":"Non-Current Liabilities","history":[{"period":"Mar 2025","value":180452.5},{"period":"Mar 2024","value":200299.3},{"period":"Mar 2023","value":218225.1},{"period":"Mar 2022","value":157695.0}]},{"particular":"Equity Capital","history":[{"period":"Mar 2025","value":153467.7},{"period":"Mar 2024","value":105563.9},{"period":"Mar 2023","value":106444.3},{"period":"Mar 2022","value":91935.0}]},{"particular":"Total Equity & Liabilities","history":[{"period":"Mar 2025","value":514360.4},{"period":"Mar 2024","value":444531.0},{"period":"Mar 2023","value":446633.2},{"period":"Mar 2022","value":363656.0}]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE397D01024/cashFlow.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:37.996051952Z","hash":"a6499687cbe0f62ba1db38d5db698d704d19ec7755a9d0659919aac713cc5f97","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","cash_flow":[{"category":"operating","history":[{"value":98332.2,"period":"Mar 2025","change":"+24.63%"},{"value":78898.2,"period":"Mar 2024","change":"+20.78%"},{"value":65324.6,"period":"Mar 2023","change":"+18.74%"},{"value":55016.6,"period":"Mar 2022","change":null}]},{"category":"investing","history":[{"value":-60269.8,"period":"Mar 2025","change":"-20.05%"},{"value":-50203.9,"period":"Mar 2024","change":"-28.46%"},{"value":-39080.2,"period":"Mar 2023","change":"+6.66%"},{"value":-41869.6,"period":"Mar 2022","change":null}]},{"category":"financing","history":[{"value":-36533.2,"period":"Mar 2025","change":"-31.52%"},{"value":-27778.5,"period":"Mar 2024","change":"-13.52%"},{"value":-24469.5,"period":"Mar 2023","change":"-60.95%"},{"value":-15203.2,"period":"Mar 2022","change":null}]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE397D01024/competitors.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:38.072702337Z","hash":"7d30b01e9b30fc3df31a03005fb6fa95782994070c4ed833076958e89c3403ac","data":[{"isin":"INE669E01016","symbol":"IDEA","exchange":"BSE","sector":"Telecommunication","instrument_key":"BSE_EQ|INE669E01016","company_name":"VODAFONE IDEA  LIMITED","company_profile":"Vodafone Idea Limited is an India-based telecom service provider. The Company is engaged in the business of telecommunication services. It provides pan-India voice and data services across second-generation (2G), third generation (3G) and fourth generation (4G) platforms. Its Vodafone Idea business services provide communication solutions to global and Indian corporations, public sector and government bodies, small and medium enterprises, and start-ups. The Company’s services include Voice Services, Broadband Services, Content and Digital Offerings, and Other Value-Added Services (VAS) Offerings. It offers a variety of other VAS offerings, including Voice and SMS based services such as caller tunes, voice & SMS chat and Utility services such as missed call alerts. Its subsidiaries include Vodafone Foundation, Vodafone Idea Business Services Limited, Vodafone Idea Communication Systems Limited, Vodafone Idea Manpower Services Limited, among others.","sector_market_cap_inr":{"value":161431.12,"unit":"crore","formatted":"161,431.12 Cr"},"sector_market_cap_usd":{"value":17.94,"unit":"billion","formatted":"$17.94B"}},{"isin":"INE343G01021","symbol":"BHARTIHEXA","exchange":"BSE","sector":"Telecom-Service","instrument_key":"BSE_EQ|INE343G01021","company_name":"Bharti Hexacom Limited","company_profile":"Bharti Hexacom Limited is a communications solutions provider. It offers consumer mobile services, fixed-line telephone and broadband services to customers in the Rajasthan and the Northeast telecommunication circles in India, which comprises the states of Arunachal Pradesh, Manipur, Meghalaya, Mizoram, Nagaland, and Tripura. It offers services under the brand Airtel. Its business divisions include Mobile Services and Homes and Office Services. The Mobile Services division offers postpaid, pre-paid, roaming, high-speed Internet access and a host of services like Airtel television (TV), video calls, live-streaming videos, gaming, and buffer-less High Definition (HD). The Homes and Office Services division offers fixed-line telephone and broadband services for homes. Its digital services include Airtel Payments Bank, Airtel Xstream, Airtel Thanks, Airtel Wynk (music streaming) and Direct-to-Home (Digital TV). It offers local, national, and international long-distance telephone services.","sector_market_cap_inr":{"value":73997.5,"unit":"crore","formatted":"73,997.50 Cr"},"sector_market_cap_usd":{"value":8.22,"unit":"billion","formatted":"$8.22B"}},{"isin":"INE151A01013","symbol":"TATACOMM","exchange":"BSE","sector":"Telecommunication","instrument_key":"BSE_EQ|INE151A01013","company_name":"TATA COMMUNICATIONS LTD.","company_profile":"Tata Communications Limited is an India-based communications technology company. The Company enables digital transformation for enterprises globally. It delivers services powered by cloud, mobility, Internet of Things (IoT), collaboration, security, and network services. Its segments include Voice Solutions, Data Services, Transformation Services, Real Estate and Campaign Registry. The Voice Solutions segment includes international and national long-distance voice services. The Data Services segment includes core and Nextgen connectivity services, digital platforms and connected services. The Transformation Services segment includes the business of providing telecommunication network management and support services. The Real Estate segment includes rentals for premises given on lease. The Campaign Registry segment includes the business of collecting robotically driven campaign information and processing and sharing that information with mobile operators and the messaging ecosystem.","sector_market_cap_inr":{"value":56002.5,"unit":"crore","formatted":"56,002.50 Cr"},"sector_market_cap_usd":{"value":6.22,"unit":"billion","formatted":"$6.22B"}},{"isin":"INE517B01013","symbol":"TTML","exchange":"BSE","sector":"Telecommunication","instrument_key":"BSE_EQ|INE517B01013","company_name":"TATA TELESERVICES (MAHARASHTRA","company_profile":"Tata Teleservices (Maharashtra) Limited is engaged in the business of providing telecommunication services. The Company, equipped with Unified Licenses (UL)-access service authorization, operates in Mumbai and Maharashtra License Service Area (LSA), caters to the regions of Maharashtra and Goa. It operates under the brand name of Tata Tele Business Services and offers a comprehensive suite of smart digital solutions comprising Network & Connectivity, Business Communications, Security, Marketing, and Managed Services. Its Network & Connectivity includes Business Wi-Fi, Smart WAN, Internet Leased Line and Broadband. Its Business Communication includes Outbound & Marketing Communications, Inbound Communications, and Integrated Solutions. Its Smartflo UCaaS offers business communication by integrating Microsoft Teams and PSTN. Its Smart Internet Telephony offers voice services over the internet. Its EZ Cloud Connect provides secure connectivity across offices, data centers and cloud ports.","sector_market_cap_inr":{"value":9076.73,"unit":"crore","formatted":"9,076.73 Cr"},"sector_market_cap_usd":{"value":1.01,"unit":"billion","formatted":"$1.01B"}},{"isin":"INE153A01019","symbol":"MTNL","exchange":"BSE","sector":"Telecommunication","instrument_key":"BSE_EQ|INE153A01019","company_name":"MAHANAGAR TELEPHONE NIGAM LTD.","company_profile":"Mahanagar Telephone Nigam Limited is an India-based telecommunication services company. The Company is a provider of fixed-line telecommunication service in the two metropolitan cities of Delhi and Mumbai. Its segments include Basic and Cellular. Its mobile services include prepaid, postpaid, third generation (3G) data plans, 3G settings, mobile television, international calling, value-added services, mobile connection requests, and mobile recharge. It also provides toll-free services, leased circuits, Web hosting, industrial training, toll-free services, universal access numbers, and virtual card calling. It offers mobile services in the city of Delhi, including Noida, Gurgaon, Faridabad and Ghaziabad and the Mumbai city, along with the areas falling under the Mumbai Municipal Corporation, New Mumbai Corporation and Thane Municipal Corporation. Its subsidiaries include Mahanagar Telephone (Mauritius) Limited, Millennium Telecom Limited, MTML International Limited and others.","sector_market_cap_inr":{"value":1942.29,"unit":"crore","formatted":"1,942.29 Cr"},"sector_market_cap_usd":{"value":215.81,"unit":"million","formatted":"$215.81M"}},{"isin":"INE982F01036","symbol":"HATHWAY","exchange":"BSE","sector":"Telecommunication","instrument_key":"BSE_EQ|INE982F01036","company_name":"HATHWAY CABLE & DATACOM LTD","company_profile":"Hathway Cable and Datacom Limited is an India-based cable broadband service provider. The Company is engaged in the distribution of Internet services through cable (broadband). The Company’s segments include Broadband Business, Cable Television Business, and Dealing in securities. Its Broadband Business segment is a cable television service provider and offers high-speed cable broadband services in over 16 cities (4 metros and 3 mini-metros). The Company offers its Cable Television services to over 350 cities and towns, operating a presence across nation (pan) India regions. Its business broadband services include Fiber Internet Services, Multi Office Connectivity, Dedicated fiber Internet services, and Internet Leased Line. The Company also caters to a diverse range of customers with over-the-top (OTT) offerings. Its subsidiaries include Hathway Digital Limited, Hathway Bhawani Cabletel & Datacom Limited, Channels India Network Private Limited, and others.","sector_market_cap_inr":{"value":1892.24,"unit":"crore","formatted":"1,892.24 Cr"},"sector_market_cap_usd":{"value":210.25,"unit":"million","formatted":"$210.25M"}},{"isin":"INE1VXE01018","symbol":"STLNETWORK","exchange":"BSE","sector":"Telecom-Service","instrument_key":"BSE_EQ|INE1VXE01018","company_name":"STL Networks Limited","company_profile":"STL Networks Limited is an India-based company. The Company operates through its brand Invenia, which is a digital infrastructure and information technology (IT) services company. The Company’s services include cloud services, cybersecurity services, data center services, fiber services, managed services, and network services. Its cloud services include cloud-design and consultancy, cloud infrastructure services, cloud transformation and migration, and cloud-native enablement services. Its cybersecurity services include cybersecurity consulting services, security architecture and engineering services, security audit and compliance services, and security operations. Its data center services include data center - design and advisory, end-to-end data center-build, and data center inter-connectivity. Its industries include defense, energy and utilities, government, healthcare, mining, telecom and transport.","sector_market_cap_inr":{"value":1345.14,"unit":"crore","formatted":"1,345.14 Cr"},"sector_market_cap_usd":{"value":149.46,"unit":"million","formatted":"$149.46M"}},{"isin":"INE809I01019","symbol":"ONMOBILE","exchange":"BSE","sector":"IT - Software","instrument_key":"BSE_EQ|INE809I01019","company_name":"ONMOBILE","company_profile":"OnMobile Global Limited is an India-based mobile gaming and entertainment company. The Company's portfolio includes mobile gaming products like Challenges Arena and ONMO, the gamification platform (Gamize) and a diverse range of mobile entertainment products such as Tones, Videos and Contests. Challenges Arena provides gamers with an immersive platform to play, compete, and connect with friends through engaging quizzes and captivating theme-based challenges. ONMO blends streaming, social gaming, e-sports, and artificial intelligence (AI) into a mobile gaming offering. Gamize products include gamification and loyalty program. The Company provides Ring Back Tones (RBT) service in partnership with telecom operators. Videos & Editorials, its white label video streaming solution, offers bite-sized entertainment along with long-form sports and kids content/videos. Its mobile contest platform features a content library, instant gratification, fair winner selection and real prizes.","sector_market_cap_inr":{"value":525.44,"unit":"crore","formatted":"525.44 Cr"},"sector_market_cap_usd":{"value":58.38,"unit":"million","formatted":"$58.38M"}},{"isin":"INE330H01018","symbol":"RCOM","exchange":"BSE","sector":"Telecommunication","instrument_key":"BSE_EQ|INE330H01018","company_name":"RELIANCE COMMUNICATIONS LTD.","company_profile":"Reliance Communications Limited is an India-based telecommunication service provider with businesses including the National/ International long-distance business. The Company is focused on providing complete telephony services to its clients. It provides wireline and wireless telecom services to the business and government segments. These include a comprehensive portfolio spanning network connectivity, enterprise voice, cloud telephony, access number services, collaboration services, wholesale voice and value-added service (VAS). The Company serves approximately 1,960 businesses of all sizes, from multinational conglomerates to small and medium-sized enterprises (SMEs) belonging to almost every vertical including banking, financial services and insurance (BFSI), manufacturing, logistics, healthcare, information technology (IT) and information technology-enabled services (ITeS), and over the top (OTT). Its cloud PBX solutions offer a full suite of analytics and management tools.","sector_market_cap_inr":{"value":259.96,"unit":"crore","formatted":"259.96 Cr"},"sector_market_cap_usd":{"value":28.88,"unit":"million","formatted":"$28.88M"}},{"isin":"INE043A01012","symbol":"GTL","exchange":"BSE","sector":"Telecommunication","instrument_key":"BSE_EQ|INE043A01012","company_name":"GTL LTD.","company_profile":"GTL Limited is an India-based infrastructure services company focused on telecom. The Company is principally engaged in providing network services to telecom operators, original equipment manufacturers (OEMs) and tower companies. The Company provides network operations and maintenance services, which include corrective and preventive maintenance of the network, capex sizing and planning services, remote monitoring and trouble ticketing, and technical support and process management. It also offers energy management solutions, which are delivered through technical audit for power consumption, monitoring utilization of sources of energy and plugging leakage thereof, driving modernization with energy equipment and integrating non-traditional or alternate sources of energy with reduced carbon dioxide (CO2) footprint. It also offers monitoring/supervising/controlling the existing diesel filing practices and providing and maintaining the energy saving equipment’s.","sector_market_cap_inr":{"value":133.07,"unit":"crore","formatted":"133.07 Cr"},"sector_market_cap_usd":{"value":14.79,"unit":"million","formatted":"$14.79M"}}]}
```

```jsonl
// File: history/fundamentals/INE397D01024/corporateActions.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:38.059687260Z","hash":"33703281844d40462b71ef93ce25535c1b441ebede2ea9bad069a635c23e6dc4","data":[{"name":"Dividend","amount":16.0,"ratio":null,"expiry_date":"18 Jul 2025","event_details":[{"name":"Announcement date","value":"13 May 2025"},{"name":"Ex dividend date","value":"18 Jul 2025"},{"name":"Record date","value":"18 Jul 2025"},{"name":"Dividend type","value":"Final"},{"name":"Amount","value":"16.0"},{"name":"Dividend %","value":"320.0"},{"name":"Details","value":"Rs.16.0000 per share(320%)Final Dividend"}]},{"name":"Dividend","amount":4.0,"ratio":null,"expiry_date":"18 Jul 2025","event_details":[{"name":"Announcement date","value":"14 May 2025"},{"name":"Ex dividend date","value":"18 Jul 2025"},{"name":"Record date","value":"18 Jul 2025"},{"name":"Dividend type","value":"Final"},{"name":"Amount","value":"4.0"},{"name":"Dividend %","value":"320.0"},{"name":"Details","value":"Rs.4.0000 per share(320%)Final Dividend"}]}]}
```

```jsonl
// File: history/fundamentals/INE397D01024/incomeStatement.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:38.012119029Z","hash":"e52c7302949e3bd5078454b0f592637bfb227a8286c1598f83fcb4793ee2eb5e","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","income_statement":[{"category":"revenue","history":[{"value":213790.1,"period":"Mar 2026","change":"+22.47%"},{"value":174558.9,"period":"Mar 2025","change":"+15.28%"},{"value":151417.8,"period":"Mar 2024","change":"+8.09%"},{"value":140081.4,"period":"Mar 2023","change":null}]},{"category":"operating_profit","history":[{"value":45172.7,"period":"Mar 2026","change":"+17.64%"},{"value":38398.5,"period":"Mar 2025","change":"+202.85%"},{"value":12679.0,"period":"Mar 2024","change":"-23.44%"},{"value":16560.7,"period":"Mar 2023","change":null}]},{"category":"net_profit","history":[{"value":33822.8,"period":"Mar 2026","change":"-9.76%"},{"value":37481.3,"period":"Mar 2025","change":"+337.97%"},{"value":8558.0,"period":"Mar 2024","change":"-30.35%"},{"value":12287.4,"period":"Mar 2023","change":null}]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE397D01024/keyRatios.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:38.043430414Z","hash":"7f03e0a6bb0afdab3ff848e7e10369436b51a0ee20cc065e610fd06981b39232","data":[{"name":"P/E","company_value":"32.83","sector_value":"18.95"},{"name":"P/B","company_value":"7.45","sector_value":"2.3"},{"name":"ROA","company_value":"6.13%","sector_value":"-2.65%"},{"name":"ROE","company_value":"17.91%","sector_value":"17.02%"},{"name":"ROCE","company_value":"19.0%","sector_value":"-6.87%"},{"name":"EV/EBITDA","company_value":"10.48","sector_value":"8.95"}]}
```

```json
// File: history/fundamentals/INE397D01024/metadata.json
{"schemaVersion":"1.0","isin":"INE397D01024","symbol":"BHARTIARTL","companyName":"BHARTI AIRTEL LTD.","exchange":"BSE","createdTs":"2026-06-14T03:41:37.935294644Z","firstSeenTs":"2026-06-14T03:41:37.935294644Z","lastUpdatedTs":"2026-06-14T03:41:38.072702337Z","endpoints":{"balanceSheet":{"version":1,"hash":"6ef7e2c8f1c423fdd23f7ddc18266e6f4c5697b9d9f616719e03232685ff869a","lastUpdatedTs":"2026-06-14T03:41:37.980372875Z","offset":0},"cashFlow":{"version":1,"hash":"a6499687cbe0f62ba1db38d5db698d704d19ec7755a9d0659919aac713cc5f97","lastUpdatedTs":"2026-06-14T03:41:37.996051952Z","offset":0},"competitors":{"version":1,"hash":"7d30b01e9b30fc3df31a03005fb6fa95782994070c4ed833076958e89c3403ac","lastUpdatedTs":"2026-06-14T03:41:38.072702337Z","offset":0},"corporateActions":{"version":1,"hash":"33703281844d40462b71ef93ce25535c1b441ebede2ea9bad069a635c23e6dc4","lastUpdatedTs":"2026-06-14T03:41:38.059687260Z","offset":0},"incomeStatement":{"version":1,"hash":"e52c7302949e3bd5078454b0f592637bfb227a8286c1598f83fcb4793ee2eb5e","lastUpdatedTs":"2026-06-14T03:41:38.012119029Z","offset":0},"keyRatios":{"version":1,"hash":"7f03e0a6bb0afdab3ff848e7e10369436b51a0ee20cc065e610fd06981b39232","lastUpdatedTs":"2026-06-14T03:41:38.043430414Z","offset":0},"profile":{"version":1,"hash":"3194638579339997f65a9e7ab5fb66ecd912f0f35898a1ead3321ff642062964","lastUpdatedTs":"2026-06-14T03:41:37.948489414Z","offset":0},"shareHoldings":{"version":1,"hash":"6de8c33023a75fc8d2739bd251dd701e90672ada7acd6cc826a3517c0b5ead7a","lastUpdatedTs":"2026-06-14T03:41:38.027019952Z","offset":0}}}
```

```jsonl
// File: history/fundamentals/INE397D01024/profile.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:37.948489414Z","hash":"3194638579339997f65a9e7ab5fb66ecd912f0f35898a1ead3321ff642062964","data":{"fetchedTs":null,"sector":"Telecommunication","company_profile":"Bharti Airtel Limited is a telecommunication company. It operates through two business divisions: India & South Asia and Africa. Its B2C Services consists of Mobile Services (India), Homes Services, and Digital TV Services. Its B2B Services consists of Airtel Business, Passive Infrastructure Services and South Asia. Its Mobile Services (India) segment offers postpaid, pre-paid, roaming, Internet and other value-added services. Its Homes Services segment provides fixed-line telephone and broadband services for homes in approximately 1,512 cities. Its Digital TV Services provides direct-to-home platform, which offers a total of 709 channels including 99 HD channels, 67 SVOD services, four international channels and five interactive services. Its Airtel Business segment offers fixed-line voice (PRIs), data and other connectivity solutions, such as Multi-Protocol Label Switching, Voice over Internet Protocol, SIP trucking. Its South Asia segment represents its operation in Bangladesh.","sector_market_cap_inr":{"value":1110530.63,"unit":"crore","formatted":"1,110,530.63 Cr"},"sector_market_cap_usd":{"value":123.39,"unit":"billion","formatted":"$123.39B"}}}
```

```jsonl
// File: history/fundamentals/INE397D01024/shareHoldings.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T03:41:38.027019952Z","hash":"6de8c33023a75fc8d2739bd251dd701e90672ada7acd6cc826a3517c0b5ead7a","data":[{"category":"promoters","history":[{"period":"Mar 2026","value":48.87},{"period":"Dec 2025","value":48.87},{"period":"Sep 2025","value":50.27},{"period":"Jun 2025","value":51.25}]},{"category":"fii","history":[{"period":"Mar 2026","value":27.8},{"period":"Dec 2025","value":28.76},{"period":"Sep 2025","value":27.42},{"period":"Jun 2025","value":26.72}]},{"category":"other_dii","history":[{"period":"Mar 2026","value":8.63},{"period":"Dec 2025","value":8.3},{"period":"Sep 2025","value":8.19},{"period":"Jun 2025","value":8.11}]},{"category":"retail_and_other","history":[{"period":"Mar 2026","value":2.68},{"period":"Dec 2025","value":2.72},{"period":"Sep 2025","value":2.79},{"period":"Jun 2025","value":2.81}]},{"category":"mutual_funds","history":[{"period":"Mar 2026","value":12.03},{"period":"Dec 2025","value":11.36},{"period":"Sep 2025","value":11.32},{"period":"Jun 2025","value":11.1}]}]}
```

```jsonl
// File: history/fundamentals/INE839G01010/balanceSheet.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.495303602Z","hash":"350782e2c813b11bec1d27950107ad022a6d69d53961be3f2c642f759cf4d8ad","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","history":[],"time_period":"yearly","units_in":"crore","full_statement":[]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE839G01010/cashFlow.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.512145525Z","hash":"3b13751d193f8deebf77d77e0636773b401e6c7d59d81c01125094fc65942b09","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","cash_flow":[{"category":"operating","history":[]},{"category":"investing","history":[]},{"category":"financing","history":[]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE839G01010/competitors.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.556368833Z","hash":"178aab1373c50acb74dd8834091c23ffe08deb51b1563a1949472201806e3aaf","data":[{"isin":"INE318A01026","symbol":"PIDILITIND","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE318A01026","company_name":"PIDILITE INDUSTRIES LTD","company_profile":"Pidilite Industries Limited is an India-based manufacturer of consumer and industrial specialty chemicals. The Company's segments include Consumer and Bazaar (C&B), Business to Business (B2B), and Others. The C&B segment covers the sale of products mainly to end consumers, which are retail users such as carpenters, painters, plumbers, mechanics, households, students and offices, among others. The Company's products include adhesives, sealants, art & craft materials and others, construction, and paint chemicals. The B2B segment includes industrial products such as adhesives, synthetic resins, organic pigments, pigment preparations, construction chemicals (projects) and surfactants, among others. It caters to various industries, such as packaging, textiles, joineries, printing inks, paper and leather, among others.","sector_market_cap_inr":{"value":156330.29,"unit":"crore","formatted":"156,330.29 Cr"},"sector_market_cap_usd":{"value":17.37,"unit":"billion","formatted":"$17.37B"}},{"isin":"INE647A01010","symbol":"SRF","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE647A01010","company_name":"SRF LTD","company_profile":"SRF Limited is a chemical-based multi-business company engaged in the manufacturing of industrial and specialty intermediates. Its segments include Technical Textiles Business (TTB), Chemicals Business (CB), Performance Films and Foil Business (PFB) and Others. The TTB segment's business includes nylon tire cord fabric, belting fabric, polyester tire cord fabric and industrial yarns and its research and development. The CB segment's business includes refrigerant gases, industrial chemicals, specialty chemicals, fluorochemicals and allied products and its research and development. The PFB segment's business includes polyester films and polypropylene films. The others segment includes coated fabric, laminated fabric and other ancillary activities. The Company has eleven manufacturing plants in India and one each in Thailand, South Africa and Hungary. The Company exports to over 90 countries. It serves various industries, such as automotive, pharmaceuticals, manufacturing and chemicals.","sector_market_cap_inr":{"value":81172.97,"unit":"crore","formatted":"81,172.97 Cr"},"sector_market_cap_usd":{"value":9.02,"unit":"billion","formatted":"$9.02B"}},{"isin":"INE473A01011","symbol":"LINDEINDIA","exchange":"NSE","sector":"Gases & Fuels","instrument_key":"NSE_EQ|INE473A01011","company_name":"LINDE INDIA LIMITED","company_profile":"Linde India Limited is an India-based industrial gases and engineering company. It operates through two segments: Gases and Related Products & Services, and Project Engineering. Gases and Related Products & Services comprise the manufacture and sale of industrial, medical and special gases, as well as related products and services. Gases and Related Products & Services segment includes onsite, bulk, and packaged gas solutions tailored to the needs of diverse industries. The Project Engineering segment comprises the sale of cryogenic and non-cryogenic air separation plants and projects. Its portfolio includes a range of industrial and specialty gases, mixtures, equipment, and engineering services. It supplies pipeline gases to large-scale industries, such as primary steel, glass, and chemicals, ensuring uninterrupted and efficient supply. It also covers nitrogen plants, pressure swing adsorption systems, and complete gas distribution solutions. Its operations span over 80 countries.","sector_market_cap_inr":{"value":59035.93,"unit":"crore","formatted":"59,035.93 Cr"},"sector_market_cap_usd":{"value":6.56,"unit":"billion","formatted":"$6.56B"}},{"isin":"INE09N301011","symbol":"FLUOROCHEM","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE09N301011","company_name":"GUJARAT FLUOROCHEM LTD","company_profile":"Gujarat Fluorochemicals Limited is an India-based chemical company, which is engaged in the manufacturing and trading of bulk chemicals, fluorochemicals, fluoropolymers, refrigerants, and allied activities. The Company's business segment is chemicals, which comprises bulk chemicals, fluorochemicals, fluoropolymers, and battery chemicals. Its fluoropolymers include fluorinated ethylene propylene, polyphthalamide, polyvinylidene fluoride, perfluoroalkoxy alkanes, micro powders, and polytetrafluoroethylene, which are used in the semiconductors, paints, and oil & gas industries. Its fluorochemicals include carbon, fluorine, nitrogen, hydrogen, and oxygen, which are used in the agrochemical and pharmaceutical industries. Its bulk chemicals include caustic soda, methylene di chloride, and chloroform, which caters to the pharma, plastics, and textiles industries. Its refrigerant products include R22, R32, R407C, and R410A. The Company supplies both domestic and international markets.","sector_market_cap_inr":{"value":40172.15,"unit":"crore","formatted":"40,172.15 Cr"},"sector_market_cap_usd":{"value":4.46,"unit":"billion","formatted":"$4.46B"}},{"isin":"INE048G01026","symbol":"NAVINFLUOR","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE048G01026","company_name":"NAVIN FLUORINE INT. LTD","company_profile":"Navin Fluorine International Limited is an India-based company that is primarily focused on fluorine chemistry, which produces refrigeration gases, inorganic fluorides, specialty organofluorines. The Company operates through the Chemical Business segment. It has two geographical segments based upon the location of its customers, which include within India and outside India. It is the manufacturer of specialty fluorochemicals, which comprises synthetic cryolite, fluorocarbon gases, and hydrofluoric acid and other fluorine chemicals. It offers contract research and manufacturing services. The Company has anhydrous hydrofluoric and diluted hydrofluoric acid manufacturing capacities in India with a multi-product portfolio. It serves industries, including stainless steel, glass, oil and gas, abrasives, electronic products, and life and crop science, among others. The Company’s manufacturing facilities are located at Surat in Gujarat and Dewas in Madhya Pradesh.","sector_market_cap_inr":{"value":37465.13,"unit":"crore","formatted":"37,465.13 Cr"},"sector_market_cap_usd":{"value":4.16,"unit":"billion","formatted":"$4.16B"}},{"isin":"INE233A01035","symbol":"GODREJIND","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE233A01035","company_name":"GODREJ INDUSTRIES LTD","company_profile":"Godrej Industries Limited is a holding company. The Company's segments include Chemicals, Animal Feeds, Veg Oils, Estate and Property Development, Finance and Investments, Dairy, Crop Protection, Hospitality, and Others. Chemicals segment includes the business of production and sale of oleochemicals and surfactants, such as, fatty alcohols, esters and waxes, refined glycerin, sodium lauryl sulphate and sodium lauryl ether sulphate. Animal Feed segment includes the business of production and sale of compound feeds for cattle, poultry, shrimp and fish. Veg Oils segment includes the business of processing and bulk trading of refined vegetable oils and vanaspati, international vegetable oil trading and oil palm plantation. Estate and property development segment includes the business of development and sale of real estate and leasing and leave and licensing of properties. Finance and Investments includes financial services and investments in associates companies and other investments.","sector_market_cap_inr":{"value":35015.92,"unit":"crore","formatted":"35,015.92 Cr"},"sector_market_cap_usd":{"value":3.89,"unit":"billion","formatted":"$3.89B"}},{"isin":"INE019C01026","symbol":"HSCL","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE019C01026","company_name":"HIMADRI SPECIALITY CHEM L","company_profile":"Himadri Speciality Chemical Limited is an India-based global specialty chemical company with a focus on research and development (R&D) and sustainability. The Company develops raw materials of lithium-ion battery value chain. It is primarily engaged in the manufacturing of carbon materials and chemicals. Its segments include Carbon materials and chemicals, and Power. Its diverse product portfolio includes specialty carbon black, coal tar pitch, refined naphthalene, advance materials, sulphonated naphthalene formaldehyde (SNF), specialty oils, power and others catering to various industries such as lithium-ion batteries, paints, plastics, tires, aluminum, graphite electrodes, agrochemicals, defense and construction chemicals. Its product offerings include anode materials, silicon-based anode materials, cathode materials, graphene, hybrid polycarboxylate ether, and COLORX. It operates in both domestic and international markets, exporting to approximately 54 countries across the globe.","sector_market_cap_inr":{"value":34316.4,"unit":"crore","formatted":"34,316.40 Cr"},"sector_market_cap_usd":{"value":3.81,"unit":"billion","formatted":"$3.81B"}},{"isin":"INE288B01029","symbol":"DEEPAKNTR","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE288B01029","company_name":"DEEPAK NITRITE LTD","company_profile":"Deepak Nitrite Limited is an India-based company, which is engaged in manufacturing and trading of chemicals. The Company operates through two segments: Advanced Intermediates and Phenolics. Its Advanced Intermediates segment offers Nitrites, Nitro Toluidines, Fuel Additives, Xylidines, Oximes, Cumidines, Speciality Agrochemicals, Optical Brightening Agent (OBA), diamino stilbene disulfonic acid (DASDA), and Benzotrifluoride. Its Phenolics segment offers cumene, phenol, acetone, isopropyl alcohol, and ammonium sulfate (AMS). The Company's products cater to several industries, such as paints, pharma, health care, colorants, rubber chemicals, explosives, dyes, pigments, food colors, pharmaceuticals, refineries, agrochemicals, glass, personal care, paper, detergents, and textiles. Its manufacturing facilities are located at Nandesari and Dahej (Gujarat); Roha and Taloja (Maharashtra); and Hyderabad (Telangana).","sector_market_cap_inr":{"value":22779.0,"unit":"crore","formatted":"22,779.00 Cr"},"sector_market_cap_usd":{"value":2.53,"unit":"billion","formatted":"$2.53B"}},{"isin":"INE501A01019","symbol":"DEEPAKFERT","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE501A01019","company_name":"DEEPAK FERTILIZERS & PETR","company_profile":"Deepak Fertilisers and Petrochemicals Corporation Limited is primarily engaged in the business of the manufacture, trading, and sale of bulk chemicals. It also has operations in value added real estate. It operates through three segments: Chemicals, Bulk Fertilizers, and Realty. Its Chemicals segment offers products, such as ammonia, methanol, dilute nitric acid, concentrated nitric acid, carbon dioxide (CO2), technical ammonium nitrate, iso-propyl alcohol, propane, bulk, and specialty chemicals. Its Bulk Fertilizers segment offers products, such as nitro phosphate (NP), muriate of potash, diammonium phosphate (DAP), single super phosphate, Sulphur, micronutrients, single superphosphate (SSF) and bio fertilizers. Its Realty segment includes the real estate business. It offers a range of NP Fertilizers, nitrogen phosphorous potassium variants, water-soluble fertilizers and bentonite Sulphur. Its subsidiaries include Mahadhan AgriTech Limited, Performance Chemiserve Limited, and others.","sector_market_cap_inr":{"value":19624.93,"unit":"crore","formatted":"19,624.93 Cr"},"sector_market_cap_usd":{"value":2.18,"unit":"billion","formatted":"$2.18B"}},{"isin":"INE100A01010","symbol":"ATUL","exchange":"NSE","sector":"Chemicals","instrument_key":"NSE_EQ|INE100A01010","company_name":"ATUL LTD","company_profile":"Atul Ltd is an India-based company, which is in the business of life science chemicals and performance, and other chemicals. It serves various industries across the world, such as adhesives, agriculture, animal feed, automobile, composites, construction, cosmetic, defense, dyestuff, electrical and electronics, flavor, food, footwear, fragrance, glass, home care, horticulture, hospitality, paint and coatings, paper, personal care, pharmaceutical, plastic, polymer, rubber, soap and detergent, sport and leisure, textile, tire, and wind energy. It operates through three segments: Life Science Chemicals, Performance and Other Chemicals, and Others. Its Life Science Chemicals segment offers active pharmaceutical ingredients (APIs), API intermediates, crop protection chemicals. Its Performance and Other Chemicals segment offers adhesion promoters, bulk chemicals, epoxy resins and hardeners, intermediates, and textile dyes. Its Others segment offers agribiotech, food products and services.","sector_market_cap_inr":{"value":19177.03,"unit":"crore","formatted":"19,177.03 Cr"},"sector_market_cap_usd":{"value":2.13,"unit":"billion","formatted":"$2.13B"}}]}
```

```jsonl
// File: history/fundamentals/INE839G01010/corporateActions.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.547440295Z","hash":"81d22a1109d2834b276d7a48bf858c027648c290f10ed8c0a9c1cd00601c0597","data":[{"name":"Dividend","amount":0.5,"ratio":null,"expiry_date":"04 Sep 2025","event_details":[{"name":"Announcement date","value":"26 May 2025"},{"name":"Ex dividend date","value":"04 Sep 2025"},{"name":"Record date","value":"05 Sep 2025"},{"name":"Dividend type","value":"Final"},{"name":"Amount","value":"0.5"},{"name":"Dividend %","value":"5.0"},{"name":"Details","value":"Recommended Final Dividend of 0.50 per equity share."}]}]}
```

```jsonl
// File: history/fundamentals/INE839G01010/incomeStatement.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.523320910Z","hash":"c0d5fa32457dde227c751b05035e8415e9df617122841d21d5e72d9bdb77b0f0","data":{"consolidated":{"fetchedTs":null,"type":"consolidated","time_period":"yearly","units_in":"crore","income_statement":[{"category":"revenue","history":[]},{"category":"operating_profit","history":[]},{"category":"net_profit","history":[]}]},"standalone":null}}
```

```jsonl
// File: history/fundamentals/INE839G01010/keyRatios.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.540853756Z","hash":"078b70ba89bd42c96df9efcebe6d6c3fcc4336412ffb68da84dd19cda48cb621","data":[{"name":"P/E","company_value":"16.16","sector_value":"15.0"},{"name":"P/B","company_value":"0.63","sector_value":"2.9"},{"name":"ROA","company_value":"2.76%","sector_value":"57.81%"},{"name":"ROE","company_value":"3.89%","sector_value":"-2.11%"},{"name":"ROCE","company_value":"5.49%","sector_value":"70.54%"},{"name":"EV/EBITDA","company_value":"7.01","sector_value":"-6.01"}]}
```

```json
// File: history/fundamentals/INE839G01010/metadata.json
{"schemaVersion":"1.0","isin":"INE839G01010","symbol":"JOCIL","companyName":"JOCIL LIMITED","exchange":"NSE","createdTs":"2026-06-14T02:24:47.180022987Z","firstSeenTs":"2026-06-14T02:24:47.180022987Z","lastUpdatedTs":"2026-06-14T02:24:47.556368833Z","endpoints":{"balanceSheet":{"version":1,"hash":"350782e2c813b11bec1d27950107ad022a6d69d53961be3f2c642f759cf4d8ad","lastUpdatedTs":"2026-06-14T02:24:47.495303602Z","offset":0},"cashFlow":{"version":1,"hash":"3b13751d193f8deebf77d77e0636773b401e6c7d59d81c01125094fc65942b09","lastUpdatedTs":"2026-06-14T02:24:47.512145525Z","offset":0},"competitors":{"version":1,"hash":"178aab1373c50acb74dd8834091c23ffe08deb51b1563a1949472201806e3aaf","lastUpdatedTs":"2026-06-14T02:24:47.556368833Z","offset":0},"corporateActions":{"version":1,"hash":"81d22a1109d2834b276d7a48bf858c027648c290f10ed8c0a9c1cd00601c0597","lastUpdatedTs":"2026-06-14T02:24:47.547440295Z","offset":0},"incomeStatement":{"version":1,"hash":"c0d5fa32457dde227c751b05035e8415e9df617122841d21d5e72d9bdb77b0f0","lastUpdatedTs":"2026-06-14T02:24:47.523320910Z","offset":0},"keyRatios":{"version":1,"hash":"078b70ba89bd42c96df9efcebe6d6c3fcc4336412ffb68da84dd19cda48cb621","lastUpdatedTs":"2026-06-14T02:24:47.540853756Z","offset":0},"profile":{"version":1,"hash":"aaae9e78eaa487ad486810c4c60c1f2627e272aa3be1e49602def15d07b5e84c","lastUpdatedTs":"2026-06-14T02:24:47.446868295Z","offset":0},"shareHoldings":{"version":1,"hash":"8ba85cb58ebf20d7ed9e0b4799e7ff5315e0e1e1899147d25fc6c834c2af813e","lastUpdatedTs":"2026-06-14T02:24:47.533742987Z","offset":0}}}
```

```jsonl
// File: history/fundamentals/INE839G01010/profile.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.446868295Z","hash":"aaae9e78eaa487ad486810c4c60c1f2627e272aa3be1e49602def15d07b5e84c","data":{"fetchedTs":null,"sector":"Chemicals","company_profile":"Jocil Limited is engaged in the manufacture of stearic acid, fatty acids, refined glycerin, soap noodles, toilet soap, industrial oxygen and in the generation of power from biomass and wind. The Company operates through three segments: Chemicals, Soap, and Power. The Chemicals segment includes fatty acids. The Soap segment includes toilet soap, and soap products. The Power Generation segment includes the power generated by biomass power plants and wind energy generators (WEGs). Its businesses include oleochemicals, soap and contract manufacturing. The oleochemicals business includes stearic acids, distilled fatty acids, fractioned fatty acids, and refined glycerin. The Company has about six megawatts (MW) biomass cogeneration captive power plant located within the factory premises. It also has four WEGs of total 6.30 MW setup in Tamil Nadu and the power generated from these plants is sold to Tamil Nadu Generation and Distribution Corporation Limited (TANGEDCO).","sector_market_cap_inr":{"value":134.14,"unit":"crore","formatted":"134.14 Cr"},"sector_market_cap_usd":{"value":14.9,"unit":"million","formatted":"$14.90M"}}}
```

```jsonl
// File: history/fundamentals/INE839G01010/shareHoldings.jsonl
{"schemaVersion":"1.0","version":1,"ts":"2026-06-14T02:24:47.533742987Z","hash":"8ba85cb58ebf20d7ed9e0b4799e7ff5315e0e1e1899147d25fc6c834c2af813e","data":[{"category":"promoters","history":[{"period":"Mar 2026","value":55.02},{"period":"Dec 2025","value":55.02},{"period":"Sep 2025","value":55.02},{"period":"Jun 2025","value":55.02}]},{"category":"fii","history":[{"period":"Mar 2026","value":0.0},{"period":"Dec 2025","value":0.0},{"period":"Sep 2025","value":0.0},{"period":"Jun 2025","value":0.0}]},{"category":"other_dii","history":[{"period":"Mar 2026","value":0.0},{"period":"Dec 2025","value":0.0},{"period":"Sep 2025","value":0.0},{"period":"Jun 2025","value":0.0}]},{"category":"retail_and_other","history":[{"period":"Mar 2026","value":44.98},{"period":"Dec 2025","value":44.98},{"period":"Sep 2025","value":44.98},{"period":"Jun 2025","value":44.98}]},{"category":"mutual_funds","history":[{"period":"Mar 2026","value":0.0},{"period":"Dec 2025","value":0.0},{"period":"Sep 2025","value":0.0},{"period":"Jun 2025","value":0.0}]}]}
```
