package me.uglypiglin.amalgam.frameworks;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import org.jetbrains.annotations.Nullable;

/**
 * A record of all the relevant data about displaying role info to players.
 * @param roleName The name of the role
 * @param roleDescription A short description of the role
 * @param nightActionName The name of the night action
 * @param nightActionDescription What the night action does. Must be non-null if nightActionName is non-null.
 * @param dayActionName The name of the day action
 * @param dayActionDescription What the day action does. Must be non-null if dayActionName is non-null.
 * @param authorName The person who created the role.
 */
public record RoleDescription(String roleName, String roleDescription,
                              @Nullable String nightActionName, @Nullable String nightActionDescription,
                              @Nullable String dayActionName, @Nullable String dayActionDescription,
                              String authorName) {
    MessageEmbed createDataEmbed() {
        EmbedBuilder builder = new EmbedBuilder();
        builder.setTitle(roleName);
        builder.setDescription(roleDescription);
        if (nightActionName != null) {
            builder.addField(nightActionName, nightActionDescription, false);
        }
        if (dayActionName != null) {
            builder.addField(dayActionName, dayActionDescription, false);
        }

        builder.setFooter(authorName);
        return builder.build();
    }


}
