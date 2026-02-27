# Contributing Guide

## Branch Strategy

- `main`: stable integration branch.
- Feature branches: `feat/<short-name>`.
- Bug fix branches: `fix/<short-name>`.
- Hardening branches: `hardening/<short-name>`.

## Commit Guidance

- Use small, focused commits.
- Keep subject lines imperative and specific.
- Reference issue ID where possible (for example `A3`, `B2`).

## Architecture Rules

- Do not place financial formulas inside UI composables or view models.
- Domain layer should be independent from Android framework types.
- UI reads formatted values from dedicated formatting components in `core/formatting`.
- Repositories should hide DAO and Room details from UI/domain callers.

## Testing Rules

- Every formula change must include unit tests.
- Data-layer changes require DAO/repository tests.
- Validation and error states must be covered for user inputs.

## Definition of Done

- Acceptance criteria in issue are met.
- Tests pass locally.
- No added dangerous permissions.
- Scope remains within V1 boundaries.

