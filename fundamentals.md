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
import java.util.concurrent.Executors;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalAggregatorService {

    private final UpstoxFundamentalClient client;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;
    private final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

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
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FundamentalAnalyzer {

    public Map<String, Object> analyze(FundamentalSnapshot snapshot) {
        Map<String, Object> analysis = new HashMap<>();
        
        // Placeholder scoring logic
        int profitability = 65;
        int financialHealth = 45;
        int valuation = 75;
        int ownership = 50;
        int overallScore = (profitability + financialHealth + valuation + ownership) / 4;

        analysis.put("profitability", profitability);
        analysis.put("financialHealth", financialHealth);
        analysis.put("valuation", valuation);
        analysis.put("ownership", ownership);
        analysis.put("overallScore", overallScore);

        return analysis;
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
                metadata.setSymbol(snapshot.getSymbol());
                metadata.setCompanyName(snapshot.getCompanyName());
                metadata.setExchange(snapshot.getExchange());
            } catch (Exception e) {
                log.warn("metadata.json corrupted for ISIN: {}. Rebuilding...", isin);
            }
        }

        if (metadata == null) {
            log.info("metadata.json missing or new ISIN: {}. Initializing...", isin);
            Instant now = Instant.now();
            metadata = IsinMetadata.builder()
                    .isin(isin)
                    .symbol(snapshot.getSymbol())
                    .companyName(snapshot.getCompanyName())
                    .exchange(snapshot.getExchange())
                    .createdTs(now)
                    .firstSeenTs(now)
                    .lastUpdatedTs(now)
                    .build();
            
            rebuildEndpointMetadata(isin, metadata);
        }
        return metadata;
    }

    private void rebuildEndpointMetadata(String isin, IsinMetadata metadata) {
        for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
            LatestRecordInfo latestInfo = readLatestRecordDetailed(isin, endpoint);
            if (latestInfo != null) {
                HistoryRecord record = latestInfo.getRecord();
                metadata.getEndpoints().put(endpoint.getKey(), IsinMetadata.EndpointMetadata.builder()
                        .hash(record.getHash())
                        .version(record.getVersion())
                        .lastUpdatedTs(record.getTs())
                        .offset(latestInfo.getOffset())
                        .build());
            }
        }
        if (!metadata.getEndpoints().isEmpty()) {
            log.info("Successfully rebuilt metadata endpoints for ISIN: {} with {} entries.", isin, metadata.getEndpoints().size());
        }
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
