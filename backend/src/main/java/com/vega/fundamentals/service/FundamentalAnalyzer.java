package com.vega.fundamentals.service;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.dto.KeyRatioDto;
import com.vega.fundamentals.dto.SectionResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class FundamentalAnalyzer {

    public static final String VERSION = "1.0";

    private static final Set<String> ROE_ALIASES = Set.of("roe", "roe (%)", "return on equity", "return on equity (%)");
    private static final Set<String> NPM_ALIASES = Set.of("net profit margin", "npm", "net profit margin (%)", "net margin");
    private static final Set<String> PE_ALIASES = Set.of("pe ratio", "p/e ratio", "price earnings ratio", "pe");
    private static final Set<String> PB_ALIASES = Set.of("pb ratio", "p/b ratio", "price to book", "pb");
    private static final Set<String> DE_ALIASES = Set.of("debt to equity", "debt/equity", "debt to equity ratio");

    public Map<String, Object> analyze(FundamentalSnapshot snapshot) {
        Map<String, Object> analysis = new HashMap<>();
        snapshot.setAnalysisVersion(VERSION);
        
        double profitability = calculateProfitability(snapshot);
        double valuation = calculateValuation(snapshot);
        double financialHealth = calculateFinancialHealth(snapshot);
        
        double totalScore = 0;
        double totalWeight = 0;

        if (!Double.isNaN(profitability)) {
            totalScore += profitability * 0.40;
            totalWeight += 0.40;
            analysis.put("profitability", (int) profitability);
        }
        
        if (!Double.isNaN(valuation)) {
            totalScore += valuation * 0.30;
            totalWeight += 0.30;
            analysis.put("valuation", (int) valuation);
        }
        
        if (!Double.isNaN(financialHealth)) {
            totalScore += financialHealth * 0.30;
            totalWeight += 0.30;
            analysis.put("financialHealth", (int) financialHealth);
        }

        if (totalWeight > 0) {
            int overallScore = (int) (totalScore / totalWeight);
            analysis.put("overallScore", overallScore);
        } else {
            analysis.put("overallScore", 0);
        }

        return analysis;
    }

    private double calculateProfitability(FundamentalSnapshot snapshot) {
        double score = 50;
        boolean hasData = false;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                String name = normalizeName(ratio.getName());
                if (ROE_ALIASES.contains(name)) {
                    double roe = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(roe)) {
                        score += roe > 15 ? 10 : -5;
                        hasData = true;
                    }
                }
                if (NPM_ALIASES.contains(name)) {
                    double npm = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(npm)) {
                        score += npm > 10 ? 10 : -5;
                        hasData = true;
                    }
                }
            }
        }
        return hasData ? Math.clamp(score, 0, 100) : Double.NaN;
    }

    private double calculateValuation(FundamentalSnapshot snapshot) {
        double score = 50;
        boolean hasData = false;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                String name = normalizeName(ratio.getName());
                if (PE_ALIASES.contains(name)) {
                    double pe = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(pe)) {
                        if (pe > 0 && pe < 20) score += 15;
                        else if (pe > 40) score -= 10;
                        hasData = true;
                    }
                }
                if (PB_ALIASES.contains(name)) {
                    double pb = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(pb)) {
                        if (pb > 0 && pb < 3) score += 10;
                        else if (pb > 7) score -= 10;
                        hasData = true;
                    }
                }
            }
        }
        return hasData ? Math.clamp(score, 0, 100) : Double.NaN;
    }

    private double calculateFinancialHealth(FundamentalSnapshot snapshot) {
        double score = 50;
        boolean hasData = false;
        List<KeyRatioDto> ratios = getRatios(snapshot);
        if (ratios != null) {
            for (KeyRatioDto ratio : ratios) {
                String name = normalizeName(ratio.getName());
                if (DE_ALIASES.contains(name)) {
                    double de = parseValue(ratio.getCompanyValue());
                    if (!Double.isNaN(de)) {
                        if (de < 0.5) score += 20;
                        else if (de > 1.5) score -= 15;
                        hasData = true;
                    }
                }
            }
        }
        return hasData ? Math.clamp(score, 0, 100) : Double.NaN;
    }

    private List<KeyRatioDto> getRatios(FundamentalSnapshot snapshot) {
        SectionResponse<List<KeyRatioDto>> section = snapshot.getKeyRatios();
        return (section != null && "success".equals(section.getStatus())) ? section.getData() : null;
    }

    private String normalizeName(String name) {
        if (name == null) return "";
        return name.toLowerCase().trim();
    }

    private double parseValue(String val) {
        if (val == null || val.equalsIgnoreCase("n/a") || val.equals("-") || val.trim().isEmpty()) {
            return Double.NaN;
        }
        try {
            return Double.parseDouble(val.replaceAll("[^0-9.-]", ""));
        } catch (NumberFormatException e) {
            return Double.NaN;
        }
    }
}
