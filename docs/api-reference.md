# API Reference

The Fundamental API supports retrieving both current and historical point-in-time snapshots.

### 1. Get Current Fundamentals
`GET /api/fundamentals/{isin}`

Returns the latest aggregated snapshot for the given ISIN, computing fresh analysis. 

### 2. Get Historical Fundamentals
`GET /api/fundamentals/{isin}/history`

Reconstructs the latest immutable snapshot entirely from the local JSONL event store.

### 3. Get Point-in-Time Fundamentals
`GET /api/fundamentals/{isin}/history?timestamp={iso-8601-timestamp}`

Reconstructs the company's fundamental snapshot exactly as it was known to the system at the specified timestamp. This prevents retroactive score changes and ensures reproducibility.
