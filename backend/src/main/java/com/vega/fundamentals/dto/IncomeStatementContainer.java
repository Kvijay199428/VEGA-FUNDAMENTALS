package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IncomeStatementContainer {
    private IncomeStatementDto consolidated;
    private IncomeStatementDto standalone;
}
