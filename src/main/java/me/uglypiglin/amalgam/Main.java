package me.uglypiglin.amalgam;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static JDA jda;

    public static void main(String[] args) throws InterruptedException {
        jda = JDABuilder.createDefault("[nope lol]").addEventListeners(new EventListener()).build().awaitReady();

    }
}
