# Screenshot Specification

## Requirements

- **Format:** PNG (preferred) or JPG
- **Resolution:** 1920x1080 (16:9) — consistent across all screenshots
- **Count:** 6 minimum, 8 maximum per listing
- **Style:** In-game screenshots (not concept art, not mockups)
- **Text overlays:** Minimal — use sparingly for callouts only (e.g., arrows, 2-3 word labels)

## Required Shots (order matters — this is the listing gallery order)

### Slot 1: Hero / First Impression
What the plugin looks like in action. Most impressive feature, clean background, no HUD clutter. This is the thumbnail BuiltByBit shows in search results.

### Slot 2: Core Feature in Use
The #1 selling feature demonstrated. Player actively using the plugin — e.g., GUI open, command output, or visible effect in action.

### Slot 3: Feature Overview
Grid or montage showing 3-4 features at a glance. Good for "look how much you get."

### Slot 4: Configuration & Customization
Show config file, GUI customization, or settings. Tells buyers it's flexible for their server.

### Slot 5: Integration or Compatibility
Show it working with other plugins if applicable (e.g., Vault economy, PlaceholderAPI placeholders in a scoreboard, LuckPerms integration).

### Slot 6: Edge Case / Robustness
Handle something tricky — error messages, help menus, or the plugin gracefully handling edge cases. Communicates polish.

### Slot 7 (optional): Comparison
Before/after, or a side-by-side with a competitor alternative if you can do this tastefully.

### Slot 8 (optional): Community / Social Proof
Discord support screenshot, positive review quote overlay, or update frequency indicator.

## Naming Convention

```
<plugin-name>-screenshot-<number>-<short-desc>.png
```

Examples:
```
farmable-screenshot-01-hero.png
farmable-screenshot-02-plot-gui.png
inventorysafe-screenshot-01-hero.png
```

## Production Checklist

- [ ] Resolution is 1920x1080 on all images
- [ ] No F3 debug screen visible
- [ ] Resource pack is consistent across all screenshots (use a neutral, modern pack)
- [ ] Lighting/time of day are consistent (daytime preferred)
- [ ] Player skin isn't a Steve default (looks unprofessional)
- [ ] No chat spam — clear only the relevant messages
- [ ] Hero image is tested as a thumbnail at small size (BuiltByBit's grid view crops)

## Quick Create Commands

Set up a clean server world for screenshots:

```bash
# Create a flat world for clean presentation
# Run before taking screenshots on your test server
/world new screenshot_world flat
/gamemode creative
/time set 1000
/weather clear
/gamerule doDaylightCycle false
```
