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

        return snapshot;
    }

    private <T> CompletableFuture<SectionResponse<T>> fetchAsync(String isin, String endpoint, TypeReference<BaseResponseDto<T>> type, String name) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                T result = client.fetch(isin, endpoint, type);
                if (result != null) {
                    historyService.archiveIfChanged(isin, name, result);
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
