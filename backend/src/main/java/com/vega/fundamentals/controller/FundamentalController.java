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
