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
