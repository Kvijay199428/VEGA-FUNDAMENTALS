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
