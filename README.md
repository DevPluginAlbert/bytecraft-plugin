# ByteCraft Plugin

Minecraft plugin for Paper/Spigot servers targeting the BuiltByBit marketplace.

## Quick Start

1. Clone the repository
2. Build: `./gradlew build`
3. Find the JAR in `build/libs/`
4. Drop into your server's `plugins/` folder
5. Restart or reload the server

## Requirements

- **Paper/Spigot** 1.21 or later
- **Java** 21+

## Development

```bash
# Build
./gradlew build

# Clean build
./gradlew clean build

# Run tests
./gradlew test
```

## Project Structure

```
src/
  main/
    java/          # Plugin source code
    resources/     # plugin.yml, configs, messages
```

## License

See [LICENSE](LICENSE) file for details.
