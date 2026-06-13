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
            SectionResponse<CompanyProfileDto> profileRes = readSection(isinDir, "profile.json", new TypeReference<SectionResponse<CompanyProfileDto>>() {});
            if (profileRes == null || !isFresh(profileRes.getFetchedTs())) {
                log.info("Cache expired or missing for ISIN: {}", isin);
                return Optional.empty();
            }

            InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);
            String companyName = instrumentInfo != null ? instrumentInfo.getName() : null;

            FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                    .schemaVersion("2.0")
                    .isin(isin)
                    .symbol(instrumentInfo != null ? instrumentInfo.getSymbol() : null)
                    .companyName(companyName)
                    .exchange(instrumentInfo != null ? instrumentInfo.getExchange() : null)
                    .cacheHit(true)
                    .status("success")
                    .source("UPSTOX")
                    .generatedTs(profileRes.getFetchedTs())
                    .profile(SectionResponseFactory.cached(profileRes.getData(), profileRes.getFetchedTs()));

            builder.balanceSheet(readAndWrapCached(isinDir, "balanceSheet.json", new TypeReference<SectionResponse<BalanceSheetContainer>>() {}));
            builder.cashFlow(readAndWrapCached(isinDir, "cashFlow.json", new TypeReference<SectionResponse<CashFlowContainer>>() {}));
            builder.incomeStatement(readAndWrapCached(isinDir, "incomeStatement.json", new TypeReference<SectionResponse<IncomeStatementContainer>>() {}));
            
            builder.shareHoldings(readAndWrapCached(isinDir, "shareHoldings.json", new TypeReference<SectionResponse<List<ShareHoldingDto>>>() {}));
            builder.keyRatios(readAndWrapCached(isinDir, "keyRatios.json", new TypeReference<SectionResponse<List<KeyRatioDto>>>() {}));
            builder.corporateActions(readAndWrapCached(isinDir, "corporateActions.json", new TypeReference<SectionResponse<List<CorporateActionDto>>>() {}));
            builder.competitors(readAndWrapCached(isinDir, "competitors.json", new TypeReference<SectionResponse<List<CompetitorDto>>>() {}));

            FundamentalSnapshot snapshot = builder.build();
            
            // Refine status
            boolean anyError = List.of(snapshot.getProfile(), snapshot.getBalanceSheet(), snapshot.getCashFlow(), 
                snapshot.getIncomeStatement(), snapshot.getShareHoldings(), snapshot.getKeyRatios(), 
                snapshot.getCorporateActions(), snapshot.getCompetitors())
                .stream().anyMatch(res -> "error".equals(res.getStatus()));
            if (anyError) snapshot.setStatus("partial_success");

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
            
            writeSection(isinDir, "profile.json", snapshot.getProfile());
            writeSection(isinDir, "balanceSheet.json", snapshot.getBalanceSheet());
            writeSection(isinDir, "cashFlow.json", snapshot.getCashFlow());
            writeSection(isinDir, "incomeStatement.json", snapshot.getIncomeStatement());
            writeSection(isinDir, "shareHoldings.json", snapshot.getShareHoldings());
            writeSection(isinDir, "keyRatios.json", snapshot.getKeyRatios());
            writeSection(isinDir, "corporateActions.json", snapshot.getCorporateActions());
            writeSection(isinDir, "competitors.json", snapshot.getCompetitors());
            
            log.info("Cache saved for ISIN: {}", isin);
        } catch (IOException e) {
            log.error("Failed to save cache for ISIN: {}: {}", isin, e.getMessage());
        }
    }

    private <T> T readSection(Path dir, String filename, TypeReference<T> type) throws IOException {
        File file = dir.resolve(filename).toFile();
        if (file.exists()) {
            return objectMapper.readValue(file, type);
        }
        return null;
    }

    private <T> SectionResponse<T> readAndWrapCached(Path dir, String filename, TypeReference<SectionResponse<T>> type) throws IOException {
        SectionResponse<T> res = readSection(dir, filename, type);
        if (res != null) {
            if ("success".equals(res.getStatus()) || "cached".equals(res.getStatus())) {
                return SectionResponseFactory.cached(res.getData(), res.getFetchedTs());
            }
            return res; // Preserve error status from cache
        }
        return SectionResponseFactory.error("CACHE_MISS", "Section missing in cache", null);
    }

    private void writeSection(Path dir, String filename, Object data) throws IOException {
        if (data != null) {
            objectMapper.writeValue(dir.resolve(filename).toFile(), data);
        }
    }

    private boolean isFresh(Instant ts) {
        if (ts == null) return false;
        return Duration.between(ts, Instant.now()).compareTo(TTL) < 0;
    }
}
