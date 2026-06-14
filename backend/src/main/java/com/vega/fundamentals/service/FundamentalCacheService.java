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
