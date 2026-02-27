# Play Store V1 Checklist

## Compliance Basics

- Target SDK current Play requirement.
- Min SDK and supported devices documented.
- No unnecessary dangerous permissions.

## Privacy and Data Safety

- Publish privacy policy URL.
- Explain that data is stored locally by default.
- Document manual export behavior in policy text.
- Complete Play Console data safety form consistently.

## Release Preparation

- App icon and feature graphic prepared.
- `versionCode` and `versionName` incremented for release.
- Signed release build configured.
- Release notes drafted.

## Quality Gates

- Unit tests pass (formula correctness priority).
- No crash in core close flow during manual smoke testing.
- Input validation covers empty, malformed, and negative values.
- Backup export/import roundtrip tested.

## Rollout

- Upload first to internal testing track.
- Validate install, open, daily close, and restore on tester devices.
- Fix blockers before moving to closed/open testing.

