package me.uglypiglin.amalgam;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Targeting Data is a class all about who targeted who. This is passes to night and day actions.
 */

//As far as I am concerned I dont need to add anything more here
public class TargetingData {
    /**The Player doing the action*/
    public final Player actor;
    /**The target of a single target action*/
    @Nullable
    public final Player singleTarget;
    /**The target(s) of a multi target action*/
    @Nullable
    public final List<Player> multiTarget;


    /**
     * Make targeting data for a single target action
     * @param actor The person doing the action
     * @param singleTarget The target of the action
     */
    TargetingData(Player actor, Player singleTarget) {
        this.actor = actor;
        this.singleTarget = singleTarget;
        this.multiTarget = null;
    }

    /**
     * Make targeting data for a action that targets more than one person.
     * @param actor The person doing the targeting
     * @param multiTarget The players selected by the action
     */
    TargetingData(Player actor, List<Player> multiTarget) {
        this.actor = actor;
        this.singleTarget = null;
        this.multiTarget = multiTarget;
    }


}
