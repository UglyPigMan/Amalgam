package me.uglypiglin.amalgam;

import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class EventListener extends ListenerAdapter {

    static HashMap<String, Integer> pingCounts = new HashMap<>();
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        if (event.getAuthor().isBot()) return;
        if (event.getMessage().getMentions().getUsers().contains(Main.jda.getSelfUser())) {
            if (event.getMessage().getReferencedMessage() != null) {
                if (event.getMessage().getReferencedMessage().getAuthor().isBot()) return;
            }

            pingCounts.putIfAbsent(event.getAuthor().getId(), 0);
            String messageContent = null;
            int pingCount = pingCounts.get(event.getAuthor().getId());
            if (pingCount > 5) {
                event.getMessage().addReaction(Emoji.fromUnicode("U+1F595")).queue();
            } else {
                messageContent = "Life is pain.";
            }
            pingCounts.put(event.getAuthor().getId(), pingCount + 1);

            if (messageContent == null) {
                return;
            }
            event.getMessage().reply(messageContent).queue();
        }
    }
}
