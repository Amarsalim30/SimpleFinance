# SimpleFinance

SimpleFinance is an Android-only, offline-first financial control app for informal and medium shops.
It is not a POS system and not a full accounting suite. The goal is daily leakage control through a fast closing habit.

## V1 Product Scope

- Daily Closing Snapshot
- Inventory Delta
- Credit Tracking
- Supplier Reconciliation
- Weekly Summary
- Settings (PIN, backup export/restore)

## Non-Goals (V1)

- Cloud sync
- Multi-user roles
- POS features
- Advanced analytics dashboards
- AI insights

## Tech Stack

- Kotlin
- Jetpack Compose
- Room
- MVVM with clean-ish layering

## Project Structure

- `app/src/main/java/com/zeynbakers/simplefinance/data`
- `app/src/main/java/com/zeynbakers/simplefinance/domain`
- `app/src/main/java/com/zeynbakers/simplefinance/ui`
- `app/src/main/java/com/zeynbakers/simplefinance/core`
- `docs/` for product, architecture, backlog, and release docs

## Quick Start

```powershell
.\gradlew.bat assembleDebug
.\gradlew.bat test
```

## Key Principles

- Keep closing flow under 60 seconds.
- Keep financial calculations in domain layer, never in UI.
- Keep dependencies simple and local-first.
- Test every financial formula.

## Documentation Index

- `docs/product/v1-prd.md`
- `docs/architecture/app-architecture.md`
- `docs/architecture/domain-formulas.md`
- `docs/architecture/data-model.md`
- `docs/security/pin-and-local-data.md`
- `docs/release/playstore-v1-checklist.md`
- `docs/backlog/v1-24-issues.md`

