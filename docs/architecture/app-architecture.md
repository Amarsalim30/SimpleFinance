# App Architecture

## Architecture Style

- MVVM + clean-ish layering.
- Keep boundaries practical, not academic.

## Layer Map

### `data/`

- `entities/`: Room entities
- `dao/`: DAO contracts
- `db/`: Room database setup and migrations
- `repository/`: repository implementations and interfaces

### `domain/`

- `model/`: pure Kotlin domain types
- `usecase/`: business actions and orchestration
- `engine/`: formula and variance logic

### `ui/`

- `screen/`: feature screens
- `viewmodel/`: state holders and intent handlers
- `component/`: reusable Compose components
- `navigation/`: destination wiring

### `core/`

- `backup/`: CSV/JSON import-export
- `security/`: PIN lock and local session rules
- `formatting/`: currency/date/percent rendering rules
- `validation/`: reusable input validation

## Dependency Direction

- `ui -> domain -> data`
- `ui -> core`
- `domain` must not depend on `ui`.
- Calculation engine must not depend on Android framework.

## Architectural Guardrails

- Financial formulas live only in `domain/engine`.
- UI never recomputes finance metrics from raw fields.
- Repository interfaces are stable contracts for view models and use cases.
- Error handling is explicit using typed result models.

## Performance and UX Guardrail

- Daily close path should require minimal taps and no unnecessary navigation.
- Form validation should fail fast with clear messages.

