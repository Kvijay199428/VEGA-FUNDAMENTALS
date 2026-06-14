# Future Roadmap

The following enhancements are planned to further expand the capabilities of the Vega Fundamentals platform:

1. **Trend Analysis:** Compute scores not just on point-in-time snapshots, but on the trajectory of fundamentals over multiple periods.
2. **Multi-Year Scoring:** Integrate deep historical comparison metrics directly into the Analyzer.
3. **Sparse Indexing:** Implement a sparse index for O(1) timestamp retrieval on extremely large JSONL files.
4. **Analytics Engine:** Enable cross-sectional queries across the entire stored universe of instruments.
5. **Sector Benchmarking:** Compare a company's metrics against dynamic sector averages retrieved from the event store.
6. **Score Versioning Registry:** Complete the migration to `AnalyzerRegistry`, allowing endpoints like `/compare` to display `v1` vs `v2` scoring logic side-by-side.
