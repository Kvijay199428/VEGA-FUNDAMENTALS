package com.vega.fundamentals.model;

import com.vega.fundamentals.dto.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum FundamentalEndpoint {
    PROFILE("profile", "profile.jsonl", CompanyProfileDto.class),
    BALANCE_SHEET("balanceSheet", "balanceSheet.jsonl", BalanceSheetContainer.class),
    CASH_FLOW("cashFlow", "cashFlow.jsonl", CashFlowContainer.class),
    INCOME_STATEMENT("incomeStatement", "incomeStatement.jsonl", IncomeStatementContainer.class),
    SHARE_HOLDINGS("shareHoldings", "shareHoldings.jsonl", List.class),
    KEY_RATIOS("keyRatios", "keyRatios.jsonl", List.class),
    CORPORATE_ACTIONS("corporateActions", "corporateActions.jsonl", List.class),
    COMPETITORS("competitors", "competitors.jsonl", List.class);

    private final String key;
    private final String filename;
    private final Class<?> dataType;

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
