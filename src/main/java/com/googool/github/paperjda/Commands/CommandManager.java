package com.googool.github.paperjda.Commands;

import com.googool.github.paperjda.Commands.Discord.Ping;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Add new EventListeners inside the CommandManager to prevent clocking up the Main.
 */

public class CommandManager extends ListenerAdapter {

    @Override
    public void onReady(@NotNull ReadyEvent event) {

        // Add your commands here.
        event.getJDA().addEventListener(
                new Ping()
        );

        // Register your commands here.
        List<CommandData> commandData = new ArrayList<>();
        commandData.add(Commands.slash("ping", "Pong! 🏓"));
        event.getJDA().updateCommands().addCommands(commandData).queue();
    }
}