# Scoring Engine

The Fundamental Analyzer deterministically computes scores based on the available fundamental data. The scoring algorithm itself is versioned (`analysisVersion`), ensuring that historical records maintain reproducibility even as the methodology evolves.

## Categories & Weights

- **Profitability (40%):** Evaluates ROE (>15%) and Net Margin (>10%).
- **Valuation (30%):** Evaluates P/E Ratio (<20) and P/B Ratio (<3).
- **Financial Health (30%):** Evaluates Debt-to-Equity Ratio (<0.5).

*Note: Missing fields (N/A) or unparseable data points are automatically excluded from the calculation, meaning the score proportionally adapts to available data without distorting the final average.*

## Versioning
Currently active analysis version: **v1.0**
