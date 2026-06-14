# Storage Engine Model

The history engine utilizes an append-only JSONL storage mechanism to act as an event store.

## Directory Structure

```
history/
  ISIN/
    metadata.json
    profile.jsonl
    balanceSheet.jsonl
    cashFlow.jsonl
    incomeStatement.jsonl
    shareHoldings.jsonl
    keyRatios.jsonl
    corporateActions.jsonl
    competitors.jsonl
```

## Event Sourcing Principles

- **Append-Only:** Files are only ever appended to. Existing records are never modified.
- **Immutable History:** Allows complete reproduction of a company's fundamental state at any given second.
- **Versioning & Deduplication:** Hashing canonicalized JSON structures prevents unnecessary versions when identical business data is re-fetched.
- **Self-Healing Metadata:** The `metadata.json` index can be entirely recovered (including provenance like `firstSeenTs` and `symbol`) by scanning the JSONL history files.
