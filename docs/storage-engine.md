# Storage Engine Model

The history engine utilizes an append-only JSONL storage mechanism to act as an event store.

## Directory Structure

### Business History
```
storage/history/fundamentals/
  ISIN/
    metadata.json
    profile.jsonl
    balanceSheet.jsonl
    ...
```

### Operational Queue
```
storage/queue/
  pending.json     # Persisted priority queue
  jobs/            # Active job snapshots
    ISIN.json      # Current status (queued/processing)
```

## Data Separation
Operational data (like queue positions and transient job states) is strictly separated from the business history. 
- **Queue Jobs:** Ephemeral snapshots that are deleted upon completion.
- **Fundamental History:** Immutable, versioned records of business data.

## Event Sourcing Principles

- **Append-Only:** Files are only ever appended to. Existing records are never modified.
- **Immutable History:** Allows complete reproduction of a company's fundamental state at any given second.
- **Versioning & Deduplication:** Hashing canonicalized JSON structures prevents unnecessary versions when identical business data is re-fetched.
- **Self-Healing Metadata:** The `metadata.json` index can be entirely recovered (including provenance like `firstSeenTs` and `symbol`) by scanning the JSONL history files.
