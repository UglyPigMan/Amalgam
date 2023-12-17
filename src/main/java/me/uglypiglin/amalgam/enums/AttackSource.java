package me.uglypiglin.amalgam.enums;


/**
 * An enum declaring who the attack came from in terms of which faction, allowing roles to be immune to specific other factions (EG a neutral being immune to mafia attacks).
 */
public enum AttackSource {
    TOWN,
    EVIL_FACTION_PLACEHOLDER, //TODO: That
    NEUTRAL
}
