package com.googool.github.paperjda.Commands.Discord;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Ping extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

        if (event.getName().equals("ping")) {
            long time = System.currentTimeMillis();
            event.reply("⌛ Calculating...").setEphemeral(true) // Reply or acknowledge.
                    .flatMap(v ->
                            event.getHook().editOriginalFormat("🏓 %d ms", System.currentTimeMillis() - time) // Edit original.
                    ).queue(); // Queue both reply and edit.
        }
    }
}
