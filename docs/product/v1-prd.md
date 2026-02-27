# SimpleFinance V1 PRD

## Product Positioning

SimpleFinance is a daily financial control tool for informal and medium shops.
It helps owners detect leakage, not run full accounting workflows.

## Problem

Many shops can see cash but cannot see financial drift. Leakage appears through:

- unexplained revenue variance
- stock shrinkage
- delayed credit collection
- hidden supplier debt growth

## Primary User

- Shop owner or trusted manager who closes books at end of day.

## Core Questions the App Must Answer Daily

1. Did I make profit today?
2. Is stock missing?
3. Is sales reporting aligned with available balances?
4. Is credit overdue risk increasing?
5. Is supplier outstanding debt under control?

## Core Loop (Habit)

Open app -> enter daily numbers -> review results -> close.

Target completion: less than 60 seconds.

## V1 Features

1. Daily Closing Snapshot
2. Inventory Delta
3. Credit Tracking
4. Supplier Reconciliation
5. Weekly Summary
6. Settings (PIN, backup export/restore)

## V1 Constraints

- Android only
- Offline-first
- Room database
- No cloud sync
- Manual backup export/restore only
- PIN lock for local trust

## Success Metrics

- Daily close completion median under 60 seconds.
- At least 70 percent of test shops close at least 5 days/week.
- Variance value is visible for every close.
- Zero known formula defects in release candidate.

## Out of Scope

- Payroll
- Tax filing
- POS checkout
- Multi-user permissions
- Advanced analytics dashboards
- AI-generated recommendations

