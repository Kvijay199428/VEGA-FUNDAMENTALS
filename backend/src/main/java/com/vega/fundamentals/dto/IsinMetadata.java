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
        private java.time.Instant lastUpdatedTs;
        private long offset;
    }
}
