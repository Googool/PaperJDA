package com.github.googool.paperjda;

import org.bukkit.plugin.java.JavaPlugin;

public final class PaperJDA extends JavaPlugin {
    @Override
    public void onEnable() {
        String DISCORD_TOKEN = getConfig().getString("DISCORD_TOKEN");
        if (DISCORD_TOKEN == null) {
            getServer().getPluginManager().disablePlugin(this);
            getLogger().severe("Please provide a DISCORD_TOKEN in the config.yml file.");
            return;
        };
    };

    public static void main(String[] args) {

    };

    @Override
    public void onDisable() {
        getLogger().info("Plugin has been disabled.");
    };
};