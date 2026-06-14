package com.vega.fundamentals.service;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.dto.KeyRatioDto;
import com.vega.fundamentals.dto.SectionResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FundamentalAnalyzer {

    public Map<String, Object> analyze(FundamentalSnapshot snapshot) {
        Map<String, Object> analysis = new HashMap<>();
        
        // Basic Analysis Logic
        int profitability = calculateProfitability(snapshot);
        int valuation = calculateValuation(snapshot);
        int financialHealth = calculateFinancialHealth(snapshot);
        int ownership = calculateOwnership(snapshot);
        
        int overallScore = (profitability + financialHealth + valuation + ownership) / 4;

        analysis.put("profitability", profitability);
        analysis.put("financialHealth", financialHealth);
        analysis.put("valuation", valuation);
        analysis.put("ownership", ownership);
        analysis.put("overallScore", overallScore);

        return analysis;
    }

    private int calculateProfitability(FundamentalSnapshot snapshot) {
        // Look for ROE, Net Profit Margin in Key Ratios
        double score = 50;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                if ("ROE".equalsIgnoreCase(ratio.getName())) {
                    score += parseValue(ratio.getCompanyValue()) > 15 ? 10 : -5;
                }
                if ("Net Profit Margin".equalsIgnoreCase(ratio.getName())) {
                    score += parseValue(ratio.getCompanyValue()) > 10 ? 10 : -5;
                }
            }
        }
        return (int) Math.clamp(score, 0, 100);
    }

    private int calculateValuation(FundamentalSnapshot snapshot) {
        // Look for PE, PB in Key Ratios
        double score = 50;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                if ("PE Ratio".equalsIgnoreCase(ratio.getName())) {
                    double pe = parseValue(ratio.getCompanyValue());
                    if (pe > 0 && pe < 20) score += 15;
                    else if (pe > 40) score -= 10;
                }
                if ("PB Ratio".equalsIgnoreCase(ratio.getName())) {
                    double pb = parseValue(ratio.getCompanyValue());
                    if (pb > 0 && pb < 3) score += 10;
                    else if (pb > 7) score -= 10;
                }
            }
        }
        return (int) Math.clamp(score, 0, 100);
    }

    private int calculateFinancialHealth(FundamentalSnapshot snapshot) {
        // Look for Debt to Equity
        double score = 50;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                if ("Debt to Equity".equalsIgnoreCase(ratio.getName())) {
                    double de = parseValue(ratio.getCompanyValue());
                    if (de < 0.5) score += 20;
                    else if (de > 1.5) score -= 15;
                }
            }
        }
        return (int) Math.clamp(score, 0, 100);
    }

    private int calculateOwnership(FundamentalSnapshot snapshot) {
        // Placeholder for shareholding analysis
        return 50; 
    }

    private List<KeyRatioDto> getRatios(FundamentalSnapshot snapshot) {
        SectionResponse<List<KeyRatioDto>> section = snapshot.getKeyRatios();
        return (section != null && "success".equals(section.getStatus())) ? section.getData() : null;
    }

    private double parseValue(String val) {
        if (val == null) return 0;
        try {
            return Double.parseDouble(val.replaceAll("[^0-9.-]", ""));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
