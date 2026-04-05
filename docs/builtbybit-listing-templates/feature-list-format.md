# Feature List Template

## BuiltByBit Feature List Format

Features are the #1 thing buyers scan. Keep them scannable, outcome-focused, and honest.

## Format

Use this markdown structure in your listing:

```md
## Features

- **Feature Name** — One-sentence description of what it does and why it matters.
- **Feature Name** — Another feature, same format.
- **Feature Name** — Include version if relevant (e.g. "1.21.11+ support").
```

## Rules

1. **Max 10 features** in the main list. Anything longer = wall of text.
2. **Lead with value**, not implementation. Say "Auto-backup with one command" not "Scheduler-based file copy system."
3. **Front-load the differentiator.** Your unique feature goes first.
4. **Include technical specs** that matter: version support, performance, compatibility.
5. **No filler.** "Highly configurable" is filler. "25 config options for granular control" is not.
6. **Use bullet points, not paragraphs.** Scannable wins.

## Example (Filled In)

```md
## Features

- **Automated Backups** — Schedule full or incremental world backups with customizable intervals. Never lose server progress again.
- **Discord Notifications** — Get instant alerts on backup success, failure, and server crashes via configurable Discord webhooks.
- **One-Command Restore** — /restore [timestamp] rolls back your world. No file manager needed.
- **Selective Excludes** — Skip plugins, cache, and logs from backups. Only back up what matters.
- **Storage Limits** — Set max disk usage per world. Old backups prune automatically when space runs low.
- **Multi-World Support** — Back up individual worlds or all worlds on one schedule.
- **1.21.11+ Compatible** — Tested on Paper 1.21.11 with zero API deprecation warnings.
- **Lightweight** — 0.1% TPS impact. Runs off-main-thread during scheduled windows.
```

## Category Headers (Optional for Larger Plugins)

If your plugin has distinct feature areas, group them:

```md
### Core Gameplay
- **Feature** — Description

### Administration
- **Feature** — Description

### Developer API
- **Feature** — Description
```
