package org.example.commands;

import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import java.util.Objects;
import static org.example.Discord4Shell.Discord4Shell.bot;
import static org.example.Discord4Shell.Discord4Shell.user;

public class ReadyMessage extends ListenerAdapter {
    @Override
    public void onReady(@NotNull ReadyEvent event) {
        String guildId = "GuildID";
        String channelId = "ChannelID";
        if (bot.getGuildById(guildId) != null) {
            Objects.requireNonNull(Objects.requireNonNull(bot.getGuildById(guildId)).getTextChannelById(channelId)).sendMessage("<@Your id> " + user + " Has Logged In").queue();
        }
    }
}
