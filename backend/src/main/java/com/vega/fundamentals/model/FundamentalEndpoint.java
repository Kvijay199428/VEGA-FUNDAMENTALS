package com.vega.fundamentals.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.vega.fundamentals.dto.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum FundamentalEndpoint {
    PROFILE("profile", "profile.jsonl", new TypeReference<CompanyProfileDto>() {}),
    BALANCE_SHEET("balanceSheet", "balanceSheet.jsonl", new TypeReference<BalanceSheetContainer>() {}),
    CASH_FLOW("cashFlow", "cashFlow.jsonl", new TypeReference<CashFlowContainer>() {}),
    INCOME_STATEMENT("incomeStatement", "incomeStatement.jsonl", new TypeReference<IncomeStatementContainer>() {}),
    SHARE_HOLDINGS("shareHoldings", "shareHoldings.jsonl", new TypeReference<List<ShareHoldingDto>>() {}),
    KEY_RATIOS("keyRatios", "keyRatios.jsonl", new TypeReference<List<KeyRatioDto>>() {}),
    CORPORATE_ACTIONS("corporateActions", "corporateActions.jsonl", new TypeReference<List<CorporateActionDto>>() {}),
    COMPETITORS("competitors", "competitors.jsonl", new TypeReference<List<CompetitorDto>>() {});

    private final String key;
    private final String filename;
    private final TypeReference<?> typeReference;

    public static FundamentalEndpoint fromKey(String key) {
        for (FundamentalEndpoint endpoint : values()) {
            if (endpoint.key.equals(key)) {
                return endpoint;
            }
        }
        // Fallback to name match for resilience
        for (FundamentalEndpoint endpoint : values()) {
            if (endpoint.name().equalsIgnoreCase(key)) {
                return endpoint;
            }
        }
        throw new IllegalArgumentException("Unknown endpoint key: " + key);
    }
}
