package me.uglypiglin.amalgam;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static JDA jda;

    public static void main(String[] args) throws InterruptedException {
        jda = JDABuilder.createDefault("TOKEN GO HERE DONT GIT IT").addEventListeners(null).build().awaitReady();

    }
}
