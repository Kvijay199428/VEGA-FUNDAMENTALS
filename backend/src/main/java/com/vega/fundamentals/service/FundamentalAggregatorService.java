package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vega.fundamentals.client.UpstoxFundamentalClient;
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.endpoint.Endpoints;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    private final ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

    public FundamentalSnapshot aggregate(String isin) {
        log.info("Aggregating fundamentals for ISIN: {}", isin);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        InstrumentService.InstrumentInfo instrumentInfo = instrumentService.getInstrument(isin);
        Map<String, Boolean> endpointStatus = new HashMap<>();
        List<Map<String, String>> errors = new ArrayList<>();

        CompletableFuture<CompanyProfileDto> profileFuture = fetchAsync(isin, Endpoints.PROFILE, 
                new TypeReference<BaseResponseDto<CompanyProfileDto>>() {}, "profile", endpointStatus, errors);

        CompletableFuture<BalanceSheetDto> balanceSheetFuture = fetchAsync(isin, Endpoints.BALANCE_SHEET, 
                new TypeReference<BaseResponseDto<BalanceSheetDto>>() {}, "balanceSheet", endpointStatus, errors);

        CompletableFuture<CashFlowDto> cashFlowFuture = fetchAsync(isin, Endpoints.CASH_FLOW, 
                new TypeReference<BaseResponseDto<CashFlowDto>>() {}, "cashFlow", endpointStatus, errors);

        CompletableFuture<IncomeStatementDto> incomeStatementFuture = fetchAsync(isin, Endpoints.INCOME_STATEMENT, 
                new TypeReference<BaseResponseDto<IncomeStatementDto>>() {}, "incomeStatement", endpointStatus, errors);

        CompletableFuture<List<ShareHoldingDto>> shareHoldingsFuture = fetchAsync(isin, Endpoints.SHARE_HOLDINGS, 
                new TypeReference<BaseResponseDto<List<ShareHoldingDto>>>() {}, "shareHoldings", endpointStatus, errors);

        CompletableFuture<List<KeyRatioDto>> keyRatiosFuture = fetchAsync(isin, Endpoints.KEY_RATIOS, 
                new TypeReference<BaseResponseDto<List<KeyRatioDto>>>() {}, "keyRatios", endpointStatus, errors);

        CompletableFuture<List<CorporateActionDto>> corporateActionsFuture = fetchAsync(isin, Endpoints.CORPORATE_ACTIONS, 
                new TypeReference<BaseResponseDto<List<CorporateActionDto>>>() {}, "corporateActions", endpointStatus, errors);

        CompletableFuture<List<CompetitorDto>> competitorsFuture = fetchAsync(isin, Endpoints.COMPETITORS, 
                new TypeReference<BaseResponseDto<List<CompetitorDto>>>() {}, "competitors", endpointStatus, errors);

        CompletableFuture.allOf(
                profileFuture, balanceSheetFuture, cashFlowFuture, incomeStatementFuture,
                shareHoldingsFuture, keyRatiosFuture, corporateActionsFuture, competitorsFuture
        ).join();

        stopWatch.stop();

        boolean allSucceeded = endpointStatus.values().stream().allMatch(b -> b);
        String status = allSucceeded ? "success" : (errors.isEmpty() ? "success" : "partial_success");

        FundamentalSnapshot snapshot = FundamentalSnapshot.builder()
                .status(status)
                .source("UPSTOX")
                .isin(isin)
                .symbol(instrumentInfo != null ? instrumentInfo.getSymbol() : null)
                .exchange(instrumentInfo != null ? instrumentInfo.getExchange() : null)
                .generatedTs(Instant.now())
                .requestDurationMs(stopWatch.getTotalTimeMillis())
                .cacheHit(false)
                .endpointStatus(endpointStatus)
                .profile(profileFuture.getNow(null))
                .balanceSheet(balanceSheetFuture.getNow(null))
                .cashFlow(cashFlowFuture.getNow(null))
                .incomeStatement(incomeStatementFuture.getNow(null))
                .shareHoldings(shareHoldingsFuture.getNow(List.of()))
                .keyRatios(keyRatiosFuture.getNow(List.of()))
                .corporateActions(corporateActionsFuture.getNow(List.of()))
                .competitors(competitorsFuture.getNow(List.of()))
                .errors(errors)
                .build();

        snapshot.setAnalysis(analyzer.analyze(snapshot));

        return snapshot;
    }

    private <T> CompletableFuture<T> fetchAsync(String isin, String endpoint, TypeReference<BaseResponseDto<T>> type, 
                                               String name, Map<String, Boolean> endpointStatus, List<Map<String, String>> errors) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                T result = client.fetch(isin, endpoint, type);
                if (result != null) {
                    setFetchedTs(result);
                    synchronized (endpointStatus) {
                        endpointStatus.put(name, true);
                    }
                    return result;
                } else {
                    synchronized (endpointStatus) {
                        endpointStatus.put(name, false);
                    }
                    Map<String, String> error = new HashMap<>();
                    error.put("endpoint", name);
                    error.put("message", "Failed to fetch data");
                    synchronized (errors) {
                        errors.add(error);
                    }
                    return null;
                }
            } catch (Exception e) {
                synchronized (endpointStatus) {
                    endpointStatus.put(name, false);
                }
                Map<String, String> error = new HashMap<>();
                error.put("endpoint", name);
                error.put("message", e.getMessage());
                synchronized (errors) {
                    errors.add(error);
                }
                return null;
            }
        }, executor);
    }

    private void setFetchedTs(Object result) {
        if (result == null) return;
        Instant now = Instant.now();
        if (result instanceof CompanyProfileDto) ((CompanyProfileDto) result).setFetchedTs(now);
        else if (result instanceof BalanceSheetDto) ((BalanceSheetDto) result).setFetchedTs(now);
        else if (result instanceof CashFlowDto) ((CashFlowDto) result).setFetchedTs(now);
        else if (result instanceof IncomeStatementDto) ((IncomeStatementDto) result).setFetchedTs(now);
    }
}
