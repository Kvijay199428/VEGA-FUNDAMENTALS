package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FundamentalFetchJob implements Comparable<FundamentalFetchJob> {
    private String isin;
    private int priority;
    private Instant createdTs;
    private String source;

    @Override
    public int compareTo(FundamentalFetchJob other) {
        if (this.priority != other.priority) {
            return Integer.compare(other.priority, this.priority); // Higher priority first
        }
        return this.createdTs.compareTo(other.createdTs); // Older createdTs first
    }
}
