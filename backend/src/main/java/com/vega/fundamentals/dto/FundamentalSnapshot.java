package com.vega.fundamentals.dto;

import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class FundamentalSnapshot {
    private String status;
    private String source;
    private String isin;
    private String symbol;
    private String exchange;
    private Instant generatedTs;
    private Long requestDurationMs;
    private boolean cacheHit;

    @Builder.Default
    private Map<String, Boolean> endpointStatus = new HashMap<>();

    private CompanyProfileDto profile;
    private BalanceSheetDto balanceSheet;
    private CashFlowDto cashFlow;
    private IncomeStatementDto incomeStatement;

    @Builder.Default
    private List<ShareHoldingDto> shareHoldings = new ArrayList<>();
    @Builder.Default
    private List<KeyRatioDto> keyRatios = new ArrayList<>();
    @Builder.Default
    private List<CorporateActionDto> corporateActions = new ArrayList<>();
    @Builder.Default
    private List<CompetitorDto> competitors = new ArrayList<>();

    @Builder.Default
    private Map<String, Object> analysis = new HashMap<>();

    @Builder.Default
    private List<Map<String, String>> errors = new ArrayList<>();
}
