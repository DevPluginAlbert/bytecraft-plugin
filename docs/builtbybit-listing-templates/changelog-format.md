# Changelog Format

## Versioning Conventions

Follow [Semantic Versioning 2.0.0](https://semver.org/):

```
MAJOR.MINOR.PATCH
```

- **MAJOR** — Breaking changes (API changes, config migration required, removal of features)
- **MINOR** — New features, backwards compatible additions
- **PATCH** — Bug fixes, minor improvements, no breaking changes

## BuiltByBit Changelog Format

```md
## Changelog

### v1.0.0 — YYYY-MM-DD (Latest)

**Features:**
- Added first feature description
- Added second feature description

**Fixes:**
- Fixed bug description
- Resolved issue description

**Changes:**
- Improved performance for X
- Updated config defaults for Y
- Changed permission node name
```

## Rules

1. **List the CURRENT version first** under the "Latest" marker.
2. **Past versions below** in reverse chronological order (newest first).
3. **Categorize entries** under "Features", "Fixes", "Changes", and "Deprecated/Removed" (if applicable).
4. **Reference issue/ticket IDs** when available, e.g., "Fixed NPE on player join (Fix #14)".
5. **Breaking changes MUST be clearly called out** in a separate subsection or with a ⚠️ prefix.
6. **Match version to `plugin.yml`** — the version number in the changelog must equal the version in the plugin's `plugin.yml` file.

## Template (Copy and Fill)

```md
### vX.Y.Z — YYYY-MM-DD

**New:**
- [Feature 1]
- [Feature 2]

**Fixed:**
- [Bug fix 1]
- [Bug fix 2]

**Improved:**
- [Improvement 1]

⚠️ **Breaking:**
- [Breaking change 1 — explain migration path if needed]
```

## Example

```md
### v1.2.0 — 2026-04-15

**New:**
- Added support for multi-world backup schedules
- New /backup list command to view all available backups
- Discord webhook now includes server TPS in notifications

**Fixed:**
- Fixed zip corruption on Windows servers when paths contain spaces (Fix #23)
- Fixed incorrect timestamp format in backup metadata
- Fixed plugin not loading on Paper 1.21.7

**Improved:**
- Reduced backup compression time by ~30% for large worlds
- Updated config comments for clarity

⚠️ **Breaking:**
- Config key `world-backup.enabled` renamed to `world-backup.enable` (automatic migration on first load)
```

## Version Release Checklist

- [ ] Version in `build.gradle` updated
- [ ] Version in `plugin.yml` matches
- [ ] Changelog entry created with today's date
- [ ] Breaking changes called out clearly
- [ ] All closed issues referenced where applicable
- [ ] `git tag -a vX.Y.Z` created and pushed
