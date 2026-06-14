# Vega Fundamentals

## 1. Project Overview

Vega Fundamentals is an event-sourced fundamentals repository for Indian equities, integrating with Upstox APIs. The platform gathers, analyzes, and stores historical fundamentals for given instruments using append-only logs to maintain an immutable timeline. 

It features a **Priority Queue Management** system that robustly handles rate-limited API fetches while separating transient operational data from permanent business history.

## Documentation

- [Architecture](docs/architecture.md)
- [Storage Engine](docs/storage-engine.md)
- [Scoring Engine](docs/scoring-engine.md)
- [API Reference](docs/api-reference.md)
- [Future Roadmap](docs/future-roadmap.md)
