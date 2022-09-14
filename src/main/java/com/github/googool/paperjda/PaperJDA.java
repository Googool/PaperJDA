package com.github.googool.paperjda;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public final class PaperJDA extends JavaPlugin {

    @Override
    public void onEnable() {
        String DISCORD_TOKEN = getConfig().getString("DISCORD_TOKEN");
        if (DISCORD_TOKEN == null) {
            this.getPluginLoader().disablePlugin(this);
            this.getLogger().severe("Please provide a DISCORD_TOKEN in the config.yml file.");
        }
    }

    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA bot = JDABuilder.createDefault("MTAxODg0NjUxMTE0NjIyMTYwOA.GwHbwC.c8ol2qUG5QQm1_dvZ14mqZDjA8aeC65fXyK2rg")
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing("with your mom."))
                .addEventListeners(new DiscordListener(), new DiscordCommands())
                .build()
                .awaitReady();

        Guild guild = bot.getGuildById("1015360569399844946");

        if (guild != null) {
            bot.upsertCommand("fart", "Fart really hard");
        }
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Closing" + this.getDescription().getFullName());
        this.getPluginLoader().disablePlugin(this);
    }
}
