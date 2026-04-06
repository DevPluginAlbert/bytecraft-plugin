# ByteCraft Plugin Studio

Professional Minecraft plugin development studio targeting the **BuiltByBit** marketplace.

## About

ByteCraft develops Paper/Spigot plugins that solve real server owner problems — admin tools, automation features, and monetization solutions. Each plugin is built with quality, documentation, and market validation in mind.

## Plugins

| Plugin | Status | Category |
|--------|--------|----------|
| ByteCraft Core | 🚧 Development | Admin Tools |

## Tech Stack

- **Java 21+**
- **Paper/Spigot API** (1.21.x)
- **Gradle** for build automation

## Quick Start

```bash
# Clone and build
git clone https://github.com/DevPluginAlbert/bytecraft-plugin.git
cd MinecraftPluginDevelopment
./gradlew build

# The JAR is in build/libs/ — drop it into your server's plugins/ folder
```

## Development

```bash
# Watch mode (auto-rebuild)
./gradlew build --continuous

# Run tests
./gradlew test

# Generate Javadoc
./gradlew javadoc
```

## Contributing

All development is managed through tickets. See [ROADMAP.md](ROADMAP.md) for planned work.

## License

See [LICENSE](LICENSE) file for details.
