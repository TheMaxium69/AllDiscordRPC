package fr.tyrolium.maxime.discord;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;

public class main {

    public static void main(String[] args)	{
        System.out.println("start");
        main.startdiscord();
    }

    public static void startdiscord () {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "861668225402404886";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "ditfxx";
        status.largeImageText = "Darling in the franxx";
        status.smallImageKey = "voiranime";
        status.smallImageText = "voiranime.com";
        status.details = "Regarde Darling in the franxx";
        status.state = " Regarde depuis depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
        System.out.println("fin fuction");
    }
}
