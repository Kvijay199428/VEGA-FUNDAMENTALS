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
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FundamentalCacheService {

    private final ObjectMapper objectMapper;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;
    private static final Duration TTL = Duration.ofHours(24);

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
            if (isFresh(snapshot.getGeneratedTs())) {
                log.info("History hit and fresh for ISIN: {}", isin);
                snapshot.setAnalysis(analyzer.analyze(snapshot));
                return Optional.of(snapshot);
            } else {
                log.info("History hit but expired for ISIN: {}", isin);
            }
        }

        return Optional.empty();
    }

    /**
     * Legacy put removed. Persistence happens exclusively via FundamentalHistoryService
     * during the aggregation phase.
     */
    public void put(String isin, FundamentalSnapshot snapshot) {
        // No-op: Stage 3 eliminates redundant legacy JSON cache writes
    }

    private boolean isFresh(Instant ts) {
        if (ts == null) return false;
        return Duration.between(ts, Instant.now()).compareTo(TTL) < 0;
    }
}
