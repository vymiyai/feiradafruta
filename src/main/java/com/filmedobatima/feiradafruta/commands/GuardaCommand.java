package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class GuardaCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "Ehh... que porre é essa aqui, hein? Vamo vê o que tem lá atrás, vai!",
                "Ihh... vamo lá, vamo lá, vamo lá, vê!",
                "A dupla dinâmica?"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!guarda";
    }

    @Override
    public String getCommandDescription() {
        return "!guarda - Ehh... que porre é essa aqui, hein? Vamo vê o que tem lá atrás, vai!";
    }

}
