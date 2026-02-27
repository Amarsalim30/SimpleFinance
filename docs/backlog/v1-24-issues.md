# V1 Backlog (24 Issues, 4 Groups)

## Group A: Data Layer (6)

### A1 Room entities for V1

- Define entities from `docs/architecture/data-model.md`.
- Acceptance: entities compile and include audit fields.

### A2 DAO interfaces and queries

- Create DAOs for closing, inventory, credit, suppliers, settings.
- Acceptance: DAO methods support CRUD needed by V1 screens.

### A3 Room database wiring

- Create database class and registration for all entities/DAOs.
- Acceptance: DB instance can be created in instrumentation test.

### A4 Migration policy scaffolding

- Add migration structure for future versions and baseline migration test harness.
- Acceptance: migration test framework is present and executable.

### A5 Repository contracts and implementations

- Implement repository interfaces with DAO-backed classes.
- Acceptance: repositories expose domain-safe models and errors.

### A6 Data layer tests

- Add DAO/repository tests for core workflows.
- Acceptance: tests verify persistence, updates, and retrieval order.

## Group B: Calculation Engine (6)

### B1 Daily closing formula engine

- Implement expected, actual, variance, and profit calculations.
- Acceptance: deterministic outputs in minor units.

### B2 Inventory delta and shrinkage engine

- Implement book stock, shrinkage, and shrinkage percent.
- Acceptance: zero and boundary input cases covered.

### B3 Supplier outstanding logic

- Implement outstanding calculation and validation behavior.
- Acceptance: overpay/negative pathways handled per rules.

### B4 Credit aging logic

- Implement due-day based aging buckets.
- Acceptance: entries grouped correctly at bucket boundaries.

### B5 Validation result modeling

- Define typed errors for invalid inputs and computation failures.
- Acceptance: all engines return typed result states.

### B6 Unit test suite for finance logic

- Cover normal, edge, and extreme values for every formula.
- Acceptance: high-confidence formula tests pass locally.

## Group C: UI (6)

### C1 Daily closing input screen

- Compose screen for key closing inputs with validation.
- Acceptance: required fields enforced and actionable errors shown.

### C2 Daily closing result summary

- Show expected vs actual, variance, and estimated profit.
- Acceptance: clearly formatted values and variance state emphasis.

### C3 History and weekly summary screens

- List past closings and summarize weekly performance.
- Acceptance: user can inspect daily records and week aggregate.

### C4 Credit list and form screens

- Add/create/update/delete customer credit entries.
- Acceptance: due date and amount validation included.

### C5 Supplier ledger screens

- Add/create/update/delete supplier transactions with outstanding totals.
- Acceptance: outstanding is visible per supplier and total.

### C6 Settings shell screen

- Add currency, PIN toggle entry point, and backup actions.
- Acceptance: settings route connects to core modules.

## Group D: Hardening (6)

### D1 CSV and JSON export

- Export core entities to both formats from settings.
- Acceptance: files generated with schema version and metadata.

### D2 Restore import and validation

- Implement import with payload integrity checks.
- Acceptance: invalid payloads rejected safely with clear errors.

### D3 PIN lock flow

- Implement setup, verify, timeout lock, and failed-attempt handling.
- Acceptance: protected routes require unlock after timeout.

### D4 Crash-safe input and state handling

- Preserve in-progress form data across process death where practical.
- Acceptance: primary closing inputs recover after restart.

### D5 Edge-case and empty-state UX

- Add clear states for no data, invalid inputs, and failed operations.
- Acceptance: no dead-end screens in V1 flows.

### D6 Release hardening checklist execution

- Validate Play Store readiness checklist items.
- Acceptance: internal-track-ready build with documented checks.

## Execution Order

1. Run A and B in parallel.
2. Start C after A/B contracts stabilize.
3. Run D after core flows are integrated.
4. Finish with full smoke pass on closing flow speed target (< 60 seconds).

