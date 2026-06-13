package com.vega.fundamentals.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CashFlowContainer {
    private CashFlowDto consolidated;
    private CashFlowDto standalone;
}
