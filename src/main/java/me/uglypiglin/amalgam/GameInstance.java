package me.uglypiglin.amalgam;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

import java.util.List;

public class GameInstance {

    public List<Player> playerList;
    int dayCounter = 0;
    String gameChannelID;


    /**
     * Process the night actions of all roles in the processing queue
     * @return If there were any errors
     */
    public boolean processNightActions() {
        //TODO: this will be painful
    }

    //TODO: Voting (Maybe will just steal from meeting bot)

    public void handleMissingThread() {
        //TODO: This beyond just sending a message
        getGameChannel().sendMessage("A player's private thread has gone missing or been locked. Try unlocking the thread or aborting the game, advanced error handling is not implemented yet.").queue();

    }

    TextChannel getGameChannel() {
        return Main.jda.getTextChannelById(gameChannelID);
    }

}
