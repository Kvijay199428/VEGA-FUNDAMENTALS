```
// File: logs/vega-fundamentals.log
2026-06-13T07:26:57.730Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication v0.0.1 using Java 21.0.10 with PID 17952 (/root/fundamentals/backend/target/vega.fundamentals.0.0.1.jar started by root in /root/fundamentals/backend)
2026-06-13T07:26:57.735Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-13T07:27:00.816Z  INFO 17952 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-13T07:27:00.838Z  INFO 17952 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-13T07:27:00.839Z  INFO 17952 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-13T07:27:00.938Z  INFO 17952 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-13T07:27:00.939Z  INFO 17952 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2886 ms
2026-06-13T07:27:01.107Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-13T07:27:02.516Z  INFO 17952 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-13T07:27:02.553Z  INFO 17952 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 6.285 seconds (process running for 7.841)
2026-06-13T07:27:09.875Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-13T07:27:09.882Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-13T07:27:09.886Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
2026-06-13T07:27:10.318Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:27:10.660Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Cache hit for ISIN: INE002A01018
2026-06-13T07:27:18.057Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:27:18.059Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE002A01018
2026-06-13T07:27:20.043Z ERROR 17952 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for ISIN: INE002A01018. Status code: 400. Body: {"status":"error","errors":[{"errorCode":"UDAPI100011","message":"Invalid Instrument key","propertyPath":"getCompetitors.instrumentKey","invalidValue":"INE002A01018","error_code":"UDAPI100011","property_path":"getCompetitors.instrumentKey","invalid_value":"INE002A01018"}]}
2026-06-13T07:27:20.132Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-1] c.v.f.service.FundamentalCacheService    : Cache saved for ISIN: INE002A01018
2026-06-13T07:27:24.282Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:27:24.297Z  INFO 17952 --- [vega.fundamentals] [tomcat-handler-3] c.v.f.service.FundamentalCacheService    : Cache hit for ISIN: INE002A01018
2026-06-13T07:28:36.185Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Starting VegaFundamentalsApplication v0.0.1 using Java 21.0.10 with PID 18390 (/root/fundamentals/backend/target/vega.fundamentals.0.0.1.jar started by root in /root/fundamentals/backend)
2026-06-13T07:28:36.249Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : No active profile set, falling back to 1 default profile: "default"
2026-06-13T07:28:39.459Z  INFO 18390 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2026-06-13T07:28:39.478Z  INFO 18390 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-06-13T07:28:39.479Z  INFO 18390 --- [vega.fundamentals] [main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2026-06-13T07:28:39.580Z  INFO 18390 --- [vega.fundamentals] [main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-06-13T07:28:39.581Z  INFO 18390 --- [vega.fundamentals] [main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2985 ms
2026-06-13T07:28:39.745Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.config.UpstoxCredentialManager     : Upstox access token loaded successfully.
2026-06-13T07:28:41.183Z  INFO 18390 --- [vega.fundamentals] [main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
2026-06-13T07:28:41.228Z  INFO 18390 --- [vega.fundamentals] [main] c.v.f.VegaFundamentalsApplication        : Started VegaFundamentalsApplication in 6.701 seconds (process running for 8.248)
2026-06-13T07:28:49.025Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-06-13T07:28:49.029Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-06-13T07:28:49.032Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
2026-06-13T07:28:49.470Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.controller.FundamentalController   : Request received for ISIN: INE002A01018
2026-06-13T07:28:49.475Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.s.FundamentalAggregatorService     : Aggregating fundamentals for ISIN: INE002A01018
2026-06-13T07:28:51.454Z ERROR 18390 --- [vega.fundamentals] [] c.v.f.client.UpstoxFundamentalClient     : Failed to fetch competitors for ISIN: INE002A01018. Status code: 400. Body: {"status":"error","errors":[{"errorCode":"UDAPI100011","message":"Invalid Instrument key","propertyPath":"getCompetitors.instrumentKey","invalidValue":"INE002A01018","error_code":"UDAPI100011","property_path":"getCompetitors.instrumentKey","invalid_value":"INE002A01018"}]}
2026-06-13T07:28:52.149Z  INFO 18390 --- [vega.fundamentals] [tomcat-handler-0] c.v.f.service.FundamentalCacheService    : Cache saved for ISIN: INE002A01018
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
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Component
@Slf4j
public class UpstoxFundamentalClient {

    private final HttpClient httpClient;
    private final UpstoxCredentialManager credentialManager;
    private final ObjectMapper objectMapper;

    public UpstoxFundamentalClient(UpstoxCredentialManager credentialManager, ObjectMapper objectMapper) {
        this.httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        this.credentialManager = credentialManager;
        this.objectMapper = objectMapper;
    }

    public <T> T fetch(String isin, String resource, TypeReference<BaseResponseDto<T>> typeReference) {
        String url = Endpoints.getUrl(isin, resource);
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
                log.error("Failed to fetch {} for ISIN: {}. Status code: {}. Body: {}", 
                        resource, isin, response.statusCode(), response.body());
            }
        } catch (IOException | InterruptedException e) {
            log.error("Error fetching {} for ISIN: {}: {}", resource, isin, e.getMessage());
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

import java.util.Optional;

@RestController
@RequestMapping("/api/fundamentals")
@RequiredArgsConstructor
@Slf4j
@Validated
public class FundamentalController {

    private final FundamentalAggregatorService aggregatorService;
    private final FundamentalCacheService cacheService;

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
        cacheService.put(isin, snapshot);

        return ResponseEntity.ok(snapshot);
    }
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
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompetitorDto {
    @JsonProperty("instrument_key")
    private String instrumentKey;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class FundamentalSnapshot {
    private String status;
    private String source;
    private String isin;
    private String symbol;
    private String exchange;
    private Instant generatedTs;
    private Long requestDurationMs;
    private boolean cacheHit;

    @Builder.Default
    private Map<String, Boolean> endpointStatus = new HashMap<>();

    private CompanyProfileDto profile;
    private BalanceSheetDto balanceSheet;
    private CashFlowDto cashFlow;
    private IncomeStatementDto incomeStatement;

    @Builder.Default
    private List<ShareHoldingDto> shareHoldings = new ArrayList<>();
    @Builder.Default
    private List<KeyRatioDto> keyRatios = new ArrayList<>();
    @Builder.Default
    private List<CorporateActionDto> corporateActions = new ArrayList<>();
    @Builder.Default
    private List<CompetitorDto> competitors = new ArrayList<>();

    @Builder.Default
    private Map<String, Object> analysis = new HashMap<>();

    @Builder.Default
    private List<Map<String, String>> errors = new ArrayList<>();
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

    public static String getUrl(String isin, String resource) {
        return BASE_URL + isin + "/" + resource;
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
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    private final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public FundamentalSnapshot aggregate(String isin) {
        log.info("Aggregating fundamentals for ISIN: {}", isin);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);
        Map<String, Boolean> endpointStatus = new HashMap<>();
        List<Map<String, String>> errors = new ArrayList<>();

        CompletableFuture<CompanyProfileDto> profileFuture = fetchAsync(isin, Endpoints.PROFILE, 
                new TypeReference<BaseResponseDto<CompanyProfileDto>>() {}, "profile", endpointStatus, errors);

        CompletableFuture<BalanceSheetDto> balanceSheetFuture = fetchAsync(isin, Endpoints.BALANCE_SHEET, 
                new TypeReference<BaseResponseDto<BalanceSheetDto>>() {}, "balanceSheet", endpointStatus, errors);

        CompletableFuture<CashFlowDto> cashFlowFuture = fetchAsync(isin, Endpoints.CASH_FLOW, 
                new TypeReference<BaseResponseDto<CashFlowDto>>() {}, "cashFlow", endpointStatus, errors);

        CompletableFuture<IncomeStatementDto> incomeStatementFuture = fetchAsync(isin, Endpoints.INCOME_STATEMENT, 
                new TypeReference<BaseResponseDto<IncomeStatementDto>>() {}, "incomeStatement", endpointStatus, errors);

        CompletableFuture<List<ShareHoldingDto>> shareHoldingsFuture = fetchAsync(isin, Endpoints.SHARE_HOLDINGS, 
                new TypeReference<BaseResponseDto<List<ShareHoldingDto>>>() {}, "shareHoldings", endpointStatus, errors);

        CompletableFuture<List<KeyRatioDto>> keyRatiosFuture = fetchAsync(isin, Endpoints.KEY_RATIOS, 
                new TypeReference<BaseResponseDto<List<KeyRatioDto>>>() {}, "keyRatios", endpointStatus, errors);

        CompletableFuture<List<CorporateActionDto>> corporateActionsFuture = fetchAsync(isin, Endpoints.CORPORATE_ACTIONS, 
                new TypeReference<BaseResponseDto<List<CorporateActionDto>>>() {}, "corporateActions", endpointStatus, errors);

        CompletableFuture<List<CompetitorDto>> competitorsFuture = fetchAsync(isin, Endpoints.COMPETITORS, 
                new TypeReference<BaseResponseDto<List<CompetitorDto>>>() {}, "competitors", endpointStatus, errors);

        CompletableFuture.allOf(
                profileFuture, balanceSheetFuture, cashFlowFuture, incomeStatementFuture,
                shareHoldingsFuture, keyRatiosFuture, corporateActionsFuture, competitorsFuture
        ).join();

        stopWatch.stop();

        boolean allSucceeded = endpointStatus.values().stream().allMatch(b -> b);
        String status = allSucceeded ? "success" : (errors.isEmpty() ? "success" : "partial_success");

        FundamentalSnapshot snapshot = FundamentalSnapshot.builder()
                .status(status)
                .source("UPSTOX")
                .isin(isin)
                .symbol(instrumentInfo != null ? instrumentInfo.getSymbol() : null)
                .exchange(instrumentInfo != null ? instrumentInfo.getExchange() : null)
                .generatedTs(Instant.now())
                .requestDurationMs(stopWatch.getTotalTimeMillis())
                .cacheHit(false)
                .endpointStatus(endpointStatus)
                .profile(profileFuture.getNow(null))
                .balanceSheet(balanceSheetFuture.getNow(null))
                .cashFlow(cashFlowFuture.getNow(null))
                .incomeStatement(incomeStatementFuture.getNow(null))
                .shareHoldings(shareHoldingsFuture.getNow(List.of()))
                .keyRatios(keyRatiosFuture.getNow(List.of()))
                .corporateActions(corporateActionsFuture.getNow(List.of()))
                .competitors(competitorsFuture.getNow(List.of()))
                .errors(errors)
                .build();

        snapshot.setAnalysis(analyzer.analyze(snapshot));

        return snapshot;
    }

    private <T> CompletableFuture<T> fetchAsync(String isin, String endpoint, TypeReference<BaseResponseDto<T>> type, 
                                               String name, Map<String, Boolean> endpointStatus, List<Map<String, String>> errors) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                T result = client.fetch(isin, endpoint, type);
                if (result != null) {
                    setFetchedTs(result);
                    synchronized (endpointStatus) {
                        endpointStatus.put(name, true);
                    }
                    return result;
                } else {
                    synchronized (endpointStatus) {
                        endpointStatus.put(name, false);
                    }
                    Map<String, String> error = new HashMap<>();
                    error.put("endpoint", name);
                    error.put("message", "Failed to fetch data");
                    synchronized (errors) {
                        errors.add(error);
                    }
                    return null;
                }
            } catch (Exception e) {
                synchronized (endpointStatus) {
                    endpointStatus.put(name, false);
                }
                Map<String, String> error = new HashMap<>();
                error.put("endpoint", name);
                error.put("message", e.getMessage());
                synchronized (errors) {
                    errors.add(error);
                }
                return null;
            }
        }, executor);
    }

    private void setFetchedTs(Object result) {
        if (result == null) return;
        Instant now = Instant.now();
        if (result instanceof CompanyProfileDto) ((CompanyProfileDto) result).setFetchedTs(now);
        else if (result instanceof BalanceSheetDto) ((BalanceSheetDto) result).setFetchedTs(now);
        else if (result instanceof CashFlowDto) ((CashFlowDto) result).setFetchedTs(now);
        else if (result instanceof IncomeStatementDto) ((IncomeStatementDto) result).setFetchedTs(now);
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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FundamentalCacheService {

    private final String cachePath;
    private final ObjectMapper objectMapper;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private static final Duration TTL = Duration.ofHours(24);

    public FundamentalCacheService(@Value("${storage.cache.fundamentals-path}") String cachePath, 
                                 ObjectMapper objectMapper,
                                 InstrumentService instrumentService,
                                 FundamentalAnalyzer analyzer) {
        this.cachePath = cachePath;
        this.objectMapper = objectMapper;
        this.instrumentService = instrumentService;
        this.analyzer = analyzer;
    }

    public Optional<FundamentalSnapshot> get(String isin) {
        Path isinDir = Path.of(cachePath, isin);
        if (!Files.exists(isinDir)) {
            return Optional.empty();
        }

        try {
            File profileFile = isinDir.resolve("profile.json").toFile();
            if (!profileFile.exists()) return Optional.empty();
            
            CompanyProfileDto profile = objectMapper.readValue(profileFile, CompanyProfileDto.class);
            if (!isFresh(profile.getFetchedTs())) {
                log.info("Cache expired for ISIN: {}", isin);
                return Optional.empty();
            }

            InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);

            FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                    .isin(isin)
                    .symbol(instrumentInfo != null ? instrumentInfo.getSymbol() : null)
                    .exchange(instrumentInfo != null ? instrumentInfo.getExchange() : null)
                    .cacheHit(true)
                    .status("success")
                    .source("UPSTOX")
                    .generatedTs(profile.getFetchedTs())
                    .profile(profile);

            readSection(isinDir, "balanceSheet.json", BalanceSheetDto.class).ifPresent(builder::balanceSheet);
            readSection(isinDir, "cashFlow.json", CashFlowDto.class).ifPresent(builder::cashFlow);
            readSection(isinDir, "incomeStatement.json", IncomeStatementDto.class).ifPresent(builder::incomeStatement);
            
            builder.shareHoldings(readListSection(isinDir, "shareHoldings.json", ShareHoldingDto.class));
            builder.keyRatios(readListSection(isinDir, "keyRatios.json", KeyRatioDto.class));
            builder.corporateActions(readListSection(isinDir, "corporateActions.json", CorporateActionDto.class));
            builder.competitors(readListSection(isinDir, "competitors.json", CompetitorDto.class));

            FundamentalSnapshot snapshot = builder.build();
            snapshot.setAnalysis(analyzer.analyze(snapshot));

            log.info("Cache hit for ISIN: {}", isin);
            return Optional.of(snapshot);
        } catch (IOException e) {
            log.error("Failed to read cache for ISIN: {}: {}", isin, e.getMessage());
        }
        return Optional.empty();
    }

    public void put(String isin, FundamentalSnapshot snapshot) {
        Path isinDir = Path.of(cachePath, isin);
        try {
            Files.createDirectories(isinDir);
            
            if (snapshot.getProfile() != null) writeSection(isinDir, "profile.json", snapshot.getProfile());
            if (snapshot.getBalanceSheet() != null) writeSection(isinDir, "balanceSheet.json", snapshot.getBalanceSheet());
            if (snapshot.getCashFlow() != null) writeSection(isinDir, "cashFlow.json", snapshot.getCashFlow());
            if (snapshot.getIncomeStatement() != null) writeSection(isinDir, "incomeStatement.json", snapshot.getIncomeStatement());
            
            writeSection(isinDir, "shareHoldings.json", snapshot.getShareHoldings());
            writeSection(isinDir, "keyRatios.json", snapshot.getKeyRatios());
            writeSection(isinDir, "corporateActions.json", snapshot.getCorporateActions());
            writeSection(isinDir, "competitors.json", snapshot.getCompetitors());
            
            log.info("Cache saved for ISIN: {}", isin);
        } catch (IOException e) {
            log.error("Failed to save cache for ISIN: {}: {}", isin, e.getMessage());
        }
    }

    private <T> Optional<T> readSection(Path dir, String filename, Class<T> clazz) throws IOException {
        File file = dir.resolve(filename).toFile();
        if (file.exists()) {
            return Optional.of(objectMapper.readValue(file, clazz));
        }
        return Optional.empty();
    }

    private <T> List<T> readListSection(Path dir, String filename, Class<T> clazz) throws IOException {
        File file = dir.resolve(filename).toFile();
        if (file.exists()) {
            return objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(List.class, clazz));
        }
        return new ArrayList<>();
    }

    private void writeSection(Path dir, String filename, Object data) throws IOException {
        objectMapper.writeValue(dir.resolve(filename).toFile(), data);
    }

    private boolean isFresh(Instant ts) {
        if (ts == null) return false;
        return Duration.between(ts, Instant.now()).compareTo(TTL) < 0;
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
                    if (isin != null && !isin.isEmpty()) {
                        InstrumentInfo info = new InstrumentInfo();
                        info.setSymbol(node.path("trading_symbol").asText(node.path("asset_symbol").asText()));
                        info.setExchange(node.path("exchange").asText());
                        isinMap.put(isin, info);
                    }
                }
            }
            log.info("Loaded {} instruments from {}", isinMap.size(), instrumentPath);
        } catch (IOException e) {
            log.error("Failed to load instruments: {}", e.getMessage());
        }
    }

    public InstrumentInfo getInstrument(String isin) {
        return isinMap.get(isin);
    }

    @Data
    public static class InstrumentInfo {
        private String symbol;
        private String exchange;
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

```yaml
// File: src/main/resources/application.yml
server:
  port: 8080

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

server:
  port: 8080
  compression:
    enabled: true
    mime-types: application/json

storage:
  cache:
    fundamentals-path: /root/fundamentals/storage/cache/fundamentals/
```
