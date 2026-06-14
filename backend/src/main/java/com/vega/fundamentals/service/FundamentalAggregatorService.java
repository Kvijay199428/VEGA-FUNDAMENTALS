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
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalAggregatorService {

    private final UpstoxFundamentalClient client;
    private final InstrumentService instrumentService;
    private final FundamentalAnalyzer analyzer;
    private final FundamentalHistoryService historyService;
    private final ExecutorService executor;

    public FundamentalSnapshot aggregate(String isin) {
        log.info("Aggregating fundamentals for ISIN: {}", isin);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);

        // Fetch sequentially to avoid Upstox 1 request/sec global rate limit
        SectionResponse<CompanyProfileDto> profileRes = fetchSync(isin, Endpoints.PROFILE, 
                new TypeReference<BaseResponseDto<CompanyProfileDto>>() {}, "profile");
        sleepQuietly(1000);

        SectionResponse<BalanceSheetContainer> balanceSheetRes = wrapContainer(fetchSync(isin, Endpoints.BALANCE_SHEET, 
                new TypeReference<BaseResponseDto<BalanceSheetDto>>() {}, "balanceSheet"), BalanceSheetContainer.class);
        sleepQuietly(1000);

        SectionResponse<CashFlowContainer> cashFlowRes = wrapContainer(fetchSync(isin, Endpoints.CASH_FLOW, 
                new TypeReference<BaseResponseDto<CashFlowDto>>() {}, "cashFlow"), CashFlowContainer.class);
        sleepQuietly(1000);

        SectionResponse<IncomeStatementContainer> incomeStatementRes = wrapContainer(fetchSync(isin, Endpoints.INCOME_STATEMENT, 
                new TypeReference<BaseResponseDto<IncomeStatementDto>>() {}, "incomeStatement"), IncomeStatementContainer.class);
        sleepQuietly(1000);

        SectionResponse<List<ShareHoldingDto>> shareHoldingsRes = fetchSync(isin, Endpoints.SHARE_HOLDINGS, 
                new TypeReference<BaseResponseDto<List<ShareHoldingDto>>>() {}, "shareHoldings");
        sleepQuietly(1000);

        SectionResponse<List<KeyRatioDto>> keyRatiosRes = fetchSync(isin, Endpoints.KEY_RATIOS, 
                new TypeReference<BaseResponseDto<List<KeyRatioDto>>>() {}, "keyRatios");
        sleepQuietly(1000);

        SectionResponse<List<CorporateActionDto>> corporateActionsRes = fetchSync(isin, Endpoints.CORPORATE_ACTIONS, 
                new TypeReference<BaseResponseDto<List<CorporateActionDto>>>() {}, "corporateActions");
        sleepQuietly(1000);

        SectionResponse<List<CompetitorDto>> competitorsRes = enrichCompetitors(fetchSync(isin, Endpoints.COMPETITORS, 
                new TypeReference<BaseResponseDto<List<CompetitorDto>>>() {}, "competitors"));

        stopWatch.stop();

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
                .balanceSheet(balanceSheetRes)
                .cashFlow(cashFlowRes)
                .incomeStatement(incomeStatementRes)
                .shareHoldings(shareHoldingsRes)
                .keyRatios(keyRatiosRes)
                .corporateActions(corporateActionsRes)
                .competitors(competitorsRes)
                .build();

        boolean anyError = List.of(snapshot.getProfile(), snapshot.getBalanceSheet(), snapshot.getCashFlow(), 
                snapshot.getIncomeStatement(), snapshot.getShareHoldings(), snapshot.getKeyRatios(), 
                snapshot.getCorporateActions(), snapshot.getCompetitors())
                .stream().anyMatch(res -> "error".equals(res.getStatus()));
        
        if (anyError) {
            snapshot.setStatus("partial_success");
        }

        snapshot.setAnalysis(analyzer.analyze(snapshot));

        // Archive changes to JSONL history
        historyService.archiveSnapshot(snapshot);

        return snapshot;
    }

    private void sleepQuietly(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private <T> SectionResponse<T> fetchSync(String isin, String endpoint, TypeReference<BaseResponseDto<T>> type, String name) {
        try {
            T result = client.fetch(isin, endpoint, type);
            if (result != null) {
                return SectionResponseFactory.success(result);
            } else {
                return SectionResponseFactory.error("UPSTOX_FETCH_ERROR", "Failed to fetch " + name, null);
            }
        } catch (Exception e) {
            log.error("Error fetching {} for ISIN: {}: {}", name, isin, e.getMessage());
            return SectionResponseFactory.error("EXCEPTION", e.getMessage(), null);
        }
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
