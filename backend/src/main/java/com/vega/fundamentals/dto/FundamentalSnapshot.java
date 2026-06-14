package com.vega.fundamentals.dto;

import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
public class FundamentalSnapshot {
    private String schemaVersion;
    private String status;
    private String source;
    private String isin;
    private String symbol;
    private String companyName;
    private String exchange;
    private Instant generatedTs;
    private Long requestDurationMs;
    private boolean cacheHit;
    private String analysisVersion;

    private SectionResponse<CompanyProfileDto> profile;
    private SectionResponse<BalanceSheetContainer> balanceSheet;
    private SectionResponse<CashFlowContainer> cashFlow;
    private SectionResponse<IncomeStatementContainer> incomeStatement;
    private SectionResponse<List<ShareHoldingDto>> shareHoldings;
    private SectionResponse<List<KeyRatioDto>> keyRatios;
    private SectionResponse<List<CorporateActionDto>> corporateActions;
    private SectionResponse<List<CompetitorDto>> competitors;

    @Builder.Default
    private Map<String, Object> analysis = new HashMap<>();
}
