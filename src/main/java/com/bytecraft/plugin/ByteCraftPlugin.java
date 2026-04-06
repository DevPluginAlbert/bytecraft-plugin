package com.bytecraft.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class ByteCraftPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ByteCraft v" + getDescription().getVersion() + " enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ByteCraft v" + getDescription().getVersion() + " disabled.");
    }
}
