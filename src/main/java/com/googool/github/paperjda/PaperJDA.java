package com.googool.github.paperjda;

import com.googool.github.paperjda.Commands.CommandManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.bukkit.plugin.java.JavaPlugin;

public final class PaperJDA extends JavaPlugin {

    public JDA jda;

    @Override
    public void onEnable() {
        String DISCORD_TOKEN = getConfig().getString("DISCORD_TOKEN");
        if (DISCORD_TOKEN == null) {
            this.getPluginLoader().disablePlugin(this);
            this.getLogger().severe("Please provide a DISCORD_TOKEN in the config.yml file.");
            return;
        }

        try {
            this.jda = JDABuilder.createDefault(DISCORD_TOKEN)
                    .addEventListeners(new CommandManager())
                    .build().awaitReady();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}