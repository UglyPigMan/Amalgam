package me.uglypiglin.amalgam.frameworks;

import me.uglypiglin.amalgam.Player;
import me.uglypiglin.amalgam.TargetingData;
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu;
import net.dv8tion.jda.api.utils.messages.MessageCreateData;

/**
 * The framework for a role. Most public methods here should be overridden
 */

public abstract class AbstractRole {

    public final RoleDescription description;
    public Player owningPlayer;

    public AbstractRole(RoleDescription description) {
        this.description = description;
    }

    //TODO: Add support for more than one night action as an option? (Not really sure if we need this)
    public abstract void executeNightAction(TargetingData data);

    public abstract void executeDayAction(TargetingData data);

    /**
     * Creates and returns a message with a targeting interface attached(selection menu). By default this will return nothing.
     * @return The message with a targeting interface or a message explaining the lack of one.
     */
    public MessageCreateData getNightTargetingInterface() {
        //TODO: Replace with a dummy method that returns: "You have no night action"
    }

    /**
     * Creates and returns a message with a targeting interface attached(selection menu). By default this will return nothing.
     * @return The message with a targeting interface or a message explaining the lack of one.
     */
    public MessageCreateData getDayTargetingInterface() {
        //TODO: Replace with a dummy method that returns: "You have no day action"
    }

    //TODO: Static methods that return sort of baisc targeting menus (Such as everyplayer but yourself, every player but you fellow mafia mates, etc etc

}
