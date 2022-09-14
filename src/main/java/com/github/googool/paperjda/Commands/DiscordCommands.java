package com.github.googool.paperjda.Commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class DiscordCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

        if (event.getName().equals("fart")) {
            String User = event.getUser().getAsMention();

            event.deferReply().queue();

            event.getHook().sendMessage(User + "farted really hard").setEphemeral(true).queue();
        }
    }
}