package com.googool.github.paperjda.Events;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Presence extends ListenerAdapter {

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        event.getJDA().getPresence().setStatus(OnlineStatus.ONLINE); // `ONLINE`, `IDLE`, `DO_NOT_DISTURB`, `INVISIBLE` and `OFFLINE`.
        event.getJDA().getPresence().setActivity(Activity.playing( // `playing`, `watching`, `competing`, `listening` and `streaming`
                "version " + getClass().getPackage().getImplementationVersion()
        ));
    }
}