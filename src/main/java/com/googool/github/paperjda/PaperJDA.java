package com.googool.github.paperjda;

import com.googool.github.paperjda.Commands.CommandManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.bukkit.plugin.java.JavaPlugin;

public class PaperJDA extends JavaPlugin {

    public JDA jda;

    @Override
    public void onEnable() {
        String DISCORD_TOKEN = getConfig().getString("DISCORD_TOKEN"); // Config.yml.
        if (DISCORD_TOKEN == null) {
            this.getPluginLoader().disablePlugin(this);
            this.getLogger().severe("Please provide a DISCORD_TOKEN in the config.yml file.");
            return; // If no token is provided the plugin will disable itself.
        }

        try {
            this.jda = JDABuilder.createDefault(DISCORD_TOKEN)
                    .addEventListeners(new CommandManager()) // Collection of commands.
                    .build().awaitReady();

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
