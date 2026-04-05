# Contributing to ByteCraft Plugin Studio

## How We Work

This studio uses a **ticket-driven workflow** managed through Paperclip. Every piece of work — features, fixes, docs — starts as an issue.

### The Lifecycle

1. **Backlog** → issues are groomed and prioritized by the Product Owner
2. **TODO** → assigned to an agent or human contributor
3. **IN_PROGRESS** → work is actively happening
4. **REVIEW** → code submitted for mandatory review
5. **DONE** → merged, released, documented

## Branching Strategy

```
main          ← production-ready code, protected
├── feat/     ← feature branches (feat/add-permission-check)
├── fix/      ← bug fixes (fix/null-pointer-on-join)
└── docs/     ← documentation updates (docs/setup-guide)
```

### Naming Conventions

- Branches: `<type>/<short-description>` — lowercase, hyphens
- Commits: `type: short description` (e.g., `feat: add configurable cooldown`)
- Types: `feat`, `fix`, `docs`, `chore`, `refactor`, `test`

## Pull Request Process

1. Open a PR targeting `main`
2. Include a clear description of what changed and why
3. All PRs require at least one review from the Code Reviewer
4. No direct pushes to `main`

## Code Standards

### Java Conventions

- Java 21+ syntax
- Follow [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- Use meaningful variable names — no single-letter names except loop counters
- Document public API with Javadoc

### Plugin Structure

```
plugin-name/
├── src/main/java/com/bytecraft/plugin/
│   ├── Plugin.java          ← main class, lifecycle
│   ├── command/             ← CommandExecutor implementations
│   ├── config/              ← Configuration management
│   ├── listener/            ← Event listeners
│   └── util/                ← Helpers and utilities
├── src/main/resources/
│   └── plugin.yml           ← Paper plugin descriptor
├── build.gradle             ← build config
└── README.md                ← plugin-specific docs
```

### Gradle Setup

```groovy
plugins {
    id 'java'
    id 'com.github.johnrengelman.shadow' version '8.1.1'
}

group = 'com.bytecraft'
version = '1.0.0'
sourceCompatibility = JavaVersion.VERSION_21

repositories {
    mavenCentral()
    maven { url = 'https://repo.papermc.io/repository/maven-public/' }
}

dependencies {
    compileOnly 'io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT'
}

shadowJar {
    archiveBaseName.set(project.name)
    archiveClassifier.set('')
}
```

## Testing

- Unit tests with JUnit 5
- Integration tests on a live Paper server when possible
- All tests must pass before merging

## Documentation

- Update docs with every PR that changes behavior
- READMEs go in the plugin root
- Detailed docs go in `docs/`
- Keep documentation accurate — outdated docs are worse than no docs

## Releasing

1. Update `version` in `build.gradle`
2. Run `./gradlew shadowJar`
3. Test the JAR on a local Paper server
4. Tag the release: `git tag -a v1.0.0 -m "Release v1.0.0"`
5. Push: `git push origin main --tags`
6. Publish to BuiltByBit

## Questions?

Open an issue or check the project roadmap.
