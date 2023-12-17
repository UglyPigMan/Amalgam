package me.uglypiglin.amalgam;

import me.uglypiglin.amalgam.enums.AttackSource;
import me.uglypiglin.amalgam.frameworks.AbstractRole;
import net.dv8tion.jda.api.entities.channel.concrete.ThreadChannel;
import net.dv8tion.jda.api.utils.messages.MessageCreateBuilder;
import net.dv8tion.jda.api.utils.messages.MessageCreateData;

import java.util.ArrayList;
import java.util.List;

/**
 * A class with all the data you need about a player.
 *
 */

public class Player {


    public final String userID;
    public final String privateThreadID;
    public final GameInstance owningGame;
    public final List<ProtectionData> activeProtectionData = new ArrayList<>();
    private AbstractRole role;



    public AbstractRole getRole() {
        return role;
    }

    public void sendPrivateMessage(String message) {
        //Try block here because I dont want a memory leak. Auto closable interface made my IDE yell.
        try (MessageCreateData data = new MessageCreateBuilder().setContent(message).build()) {
            sendPrivateMessage(data);
        }
    }

    public void sendPrivateMessage(MessageCreateData data) {
        try {
            Main.jda.getThreadChannelById(privateThreadID).sendMessage(data).queue();
        } catch (NullPointerException exception) {
            owningGame.handleMissingThread();
        }
    }

    //This should not be used lightly.
    public void setRole(AbstractRole role) {
        this.role = role;
    }

    /**
     * A Record of data about a basic protection.
     * @param blockedAttacks What kind of attacks this blocks
     * @param expiresOnDay What day the protection expires on (more specifically, the protection expires when the day counter is at or equal to this)
     */
    public record ProtectionData(AttackSource[] blockedAttacks, int expiresOnDay) {

    }
}
