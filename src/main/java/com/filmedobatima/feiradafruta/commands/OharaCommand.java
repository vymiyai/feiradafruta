package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class OharaCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "E como é que pode ser verdade um porra dessa, hein, Batima? Me explica essa porra!",
                "Como puta paga, porra?",
                "Ah... dupla dinâmica o caraio. Vocês são dois filhas da puta!"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!ohara";
    }

    @Override
    public String getCommandDescription() {
        return "!ohara - Ah... dupla dinâmica o caraio. Vocês são dois filhas da puta!";
    }

}
