package com.github.googool.paperjda;

import com.github.googool.paperjda.Commands.DiscordCommands;
import com.github.googool.paperjda.Listeners.DiscordListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;

public final class PaperJDA extends JavaPlugin {
    private JDA jda;

    @Override
    public void onEnable() {
        String DISCORD_TOKEN = getConfig().getString("DISCORD_TOKEN");
        String DISCORD_GUILD = getConfig().getString("DISCORD_GUILD");

        if (DISCORD_TOKEN == null) {
            this.getPluginLoader().disablePlugin(this);
            this.getLogger().severe("Please provide a DISCORD_TOKEN in the config.yml file.");
        } else if (DISCORD_GUILD == null) {
            this.getPluginLoader().disablePlugin(this);
            this.getLogger().severe("Please provide a DISCORD_GUILD in the config.yml file.");
        }

        try {
            this.jda = JDABuilder.createDefault(DISCORD_TOKEN)
                    .setStatus(OnlineStatus.ONLINE)
                    .setActivity(Activity.playing("Minecraft"))
                    .addEventListeners(new DiscordCommands(), new DiscordListener())
                    .build()
                    .awaitReady();

            Guild guild = this.jda.getGuildById(DISCORD_GUILD);

            if (guild != null) {
                this.jda.getGuildById(DISCORD_GUILD)
                        .upsertCommand("fart", "Fart really hard").queue();
            }

        } catch (LoginException | InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}