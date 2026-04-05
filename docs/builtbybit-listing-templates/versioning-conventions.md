# Versioning Conventions

## Semantic Versioning 2.0.0

All ByteCraft plugins follow `MAJOR.MINOR.PATCH` format.

### Version Bump Rules

| Change Type | Version Part | Example |
|---|---|---|
| Breaking API change, config migration, removed feature | MAJOR | 1.0.0 -> 2.0.0 |
| New feature, backwards-compatible addition | MINOR | 1.0.0 -> 1.1.0 |
| Bug fix, minor improvement, docs update | PATCH | 1.0.0 -> 1.0.1 |

### Where Version Lives

1. **`build.gradle`** — `version = '1.0.0'`
2. **`plugin.yml`** — `version: 1.0.0`
3. **Changelog** — `### v1.0.0 — YYYY-MM-DD`
4. **BuiltByBit listing** — listed version tag matches plugin.yml
5. **Git tag** — `git tag -a v1.0.0 -m "Release v1.0.0"`

All five MUST match.

### Pre-Release Tags

For MVPs and beta testing:

```
v0.1.0 — Initial prototype, not production ready
v0.2.0 — Feature complete but untested
v0.3.0 — Beta, stable enough for testing servers
v1.0.0 — Production release
```

### Branch Naming for Releases

```
release/v1.0.0    ← release branch for staging
```

### Release Process

```bash
# 1. Bump version in build.gradle and plugin.yml
# 2. Update changelog with today's date
# 3. Build and test
./gradlew clean shadowJar

# 4. Test the JAR on a local Paper server
# 5. Commit everything
git add .
git commit -m "chore: release v1.0.0"

# 6. Tag the release
git tag -a v1.0.0 -m "Release v1.0.0"

# 7. Push
git push origin main --tags

# 8. Upload shaded JAR to BuiltByBit listing
# 9. Update listing description with new changelog entry
# 10. Monitor discussion tab for 48 hours
```

### Deprecation Policy

- **Minor version**: mark feature as deprecated with a warning (in-game or in startup logs)
- **Next major version**: remove the deprecated feature
- Always provide a migration path in the changelog

### Maven Coordinates (for API plugins)

```xml
<groupId>com.bytecraft</groupId>
<artifactId>plugin-name</artifactId>
<version>1.0.0</version>
```
