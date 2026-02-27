# PIN and Local Data Security

## Security Model (V1)

- Data stays local on device.
- No cloud sync or external transmission.
- Access protection uses local PIN lock.

## PIN Requirements

- 4 to 6 digits.
- Store hash only, never raw PIN.
- Require PIN on app open after lock timeout.
- Lock timeout configurable (default 5 minutes).

## PIN Failure Handling

- Increment failed-attempt counter.
- Temporary lockout after repeated failures.
- Clear lockout timer on successful PIN entry.

## Backup and Restore Constraints

- Export as CSV/JSON via explicit user action.
- Import requires validation and user confirmation.
- Reject malformed or incompatible payloads with clear errors.

## Privacy Statement Inputs

- Data collected: financial entries typed by user.
- Data sharing: none by default.
- Data storage: local device only, unless user manually exports.

