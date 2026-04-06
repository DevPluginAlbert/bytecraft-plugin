# Farmable — Setup Guide

> **Version:** 0.1.0-MVP | **Platform:** Paper 1.21+ | **Java:** 21+

---

## 1. Installation

1. Download `Farmable-MVP.jar` from your BuiltByBit purchase.
2. Drop the JAR into your server's `plugins/` folder.
3. Start or restart your server.
4. Verify the plugin loaded — you should see `[Farmable]` messages in the console with no errors.

### Optional Dependencies

| Plugin | Purpose | Required? |
|--------|---------|-----------|
| **Citizens** | Physical NPC entities for the tutorial and shop NPCs | Recommended |
| **Typewriter** | Typewriter-style chat messages for NPC dialogue | Optional |

Farmable runs without Citizens, but NPC interactions will fall back to command-based menus instead of in-world NPCs.

---

## 2. First-Run Configuration

On first startup, Farmable generates its configuration in `plugins/Farmable/`. You will find:

- `config.yml` — General plugin settings
- `messages.yml` — All player-facing text (fully customizable)

No manual config changes are required for a working setup — the defaults are ready to play.

---

## 3. Setting Up the Spawn / Hub

Farmable uses an in-world spawn area where new players begin. You need to set this up:

### Step 1: Set the Hub Spawn Point

1. Stand at the location where you want players to spawn.
2. Run: `/sethub`
3. Players who join the server for the first time will now teleport here.

### Step 2: Place NPCs (if using Citizens)

Use the admin map command to set up NPCs:

```
/farmadmin citizens    — Link Citizens NPCs to Farmable
/farmadmin setnpc      — Assign an NPC to a specific role (Guide, Market, Broker)
/farmadmin setloc      — Set interaction locations
/farmadmin setradius   — Configure trigger radius around NPCs/locations
/farmadmin where       — Show your current position relative to Farmable zones
```

### Recommended NPC Setup

| NPC Role | Purpose |
|----------|---------|
| **Farm Guide** | Welcomes new players, walks them through harvesting training wheat and selling it |
| **Market NPC** | Lets players sell crops for coins |
| **Plot Broker** | Sells players their first personal farm plot |

### Step 3: Set Up the Training Field

The training field is a small area where new players practice harvesting before buying a plot. You need to prepare it in-world:

1. Build a small wheat farming area near spawn.
2. Use `/farmadmin wand` to select the training zone boundaries.
3. Make sure some wheat is already placed and mature for new players to harvest.

---

## 4. Player Journey (What Your Players Will Experience)

This is the default new-player flow:

1. **Join server** → Teleported to hub spawn
2. **Farm Guide NPC** → Directs player to training wheat
3. **Harvest wheat** → Learn basic farming
4. **Sell at Market NPC** → Earn first coins
5. **Reach 100 coins** → Unlocks plot purchase
6. **Plot Broker NPC** → Buy first personal farm plot
7. **Own a plot** → Water, plant, harvest, sell, upgrade cycle begins

Players start with **nothing** — no farm, no plot. They unlock everything through gameplay.

---

## 5. Commands Reference

### Player Commands

| Command | Description |
|---------|-------------|
| `/farm status` | View your farm stats, coins, level, and plot info |
| `/farm objectives` | See your current gameplay objectives |
| `/farm buyplot` | Purchase your first farm plot (costs 100 coins) |
| `/farm plot` | Teleport to your personal farm plot |
| `/farm sell` | Sell all crops in your inventory for coins |
| `/farm upgrade` | Open the upgrade menu for farm improvements |
| `/farm barn` | View and manage barn upgrades |
| `/spawn` | Teleport back to the hub spawn |

### Admin Commands

| Command | Permission | Description |
|---------|-----------|-------------|
| `/sethub` | `farmable.admin` | Set the hub spawn point |
| `/farmadmin setloc` | `farmable.admin` | Set zone locations |
| `/farmadmin setnpc` | `farmable.admin` | Link NPCs to roles |
| `/farmadmin setradius` | `farmable.admin` | Set interaction radii |
| `/farmadmin wand` | `farmable.admin` | Get a selection wand for zones |
| `/farmadmin citizens` | `farmable.admin` | Citizens integration setup |
| `/farmadmin where` | `farmable.admin` | Show current zone position |

---

## 6. Permissions

| Permission | Default | Description |
|------------|---------|-------------|
| `farmable.admin` | OP | Access to all admin commands |
| *(none required)* | Everyone | All player commands are available by default |

---

## 7. Gameplay Systems Overview

### Watering Can

- Players start with a watering can that holds up to **5 bars** of water.
- Each use sprays a **3x1 area** in front of the player, using 1 bar.
- Refill at a **well** on their plot (+1 bar per refill).
- Watered soil allows crops to grow — dry soil does not.

### Plots

- Each player gets **one personal farm plot** they unlock after earning 100 coins.
- Plots are real in-world areas — not GUI menus.
- Players manually plant, water, and harvest on their own plot.

### Upgrades

- Players can spend coins to upgrade their farm level, tools, and barn.
- Upgrades are accessed through NPCs or `/farm upgrade`.

### Scoreboard (HUD)

A clean sidebar HUD shows:

- Farm level + XP progress
- Coin balance + shards
- Barn level + size
- Current objective
- `farmable.gg` branding

---

## 8. Troubleshooting

### Plugin doesn't load on startup

- Ensure you're running **Paper 1.21+** (Spigot may not work reliably).
- Ensure **Java 21+** is installed.
- Check the server console for error stack traces.

### Players can't interact with NPCs

- Make sure Citizens is installed for physical NPC entities.
- Without Citizens, players can use commands directly (`/farm buyplot`, `/farm sell`, etc.).
- Use `/farmadmin where` to check if NPC zones are configured correctly.

### Training wheat doesn't work

- Make sure the training zone is set with `/farmadmin wand`.
- Ensure mature wheat is physically placed in that area.
- Players must right-click or interact with the wheat to harvest.

### Players can't buy a plot

- They need **at least 100 coins** earned from selling crops.
- Check the Plot Broker NPC is configured with `/farmadmin setnpc`.
- Players can also use `/farm buyplot` as a fallback.

### Watering can not working

- Players must be near their own plot to use it.
- The can needs water — check the actionbar for remaining bars.
- Players must refill at a well on their plot.

### Console errors on startup

- Check for conflicts with other plot/farming plugins.
- Farmable soft-depends on Citizens and Typewriter — missing these will cause warnings, not errors.
- If you see "dependency not found" errors, you may need to install missing soft dependencies.

---

## 9. Customization

### Editing Messages

All player-facing text can be customized in `plugins/Farmable/messages.yml`. This includes:

- NPC dialogue lines
- Command responses
- Objective text
- Scoreboard labels
- Error messages

Edit this file, then run `/reload` or restart the server to apply changes.

### Economy Integration

Farmable uses its own internal coin economy by default. If you want to integrate with Vault or another economy plugin, contact support for available integration options.

---

## 10. Support

- **BuiltByBit:** Message the author through your BuiltByBit purchase
- **GitHub:** https://github.com/DevPluginAlbert
- **Website:** farmable.gg

Report bugs with: server version, plugin version, console error logs, and steps to reproduce.

---

*Farmable — Farm. Grow. Earn.*
