package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class ComissarioCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "Puta que o pariu, Batima! Eu não acredito em nenhuma palavra disso! Puta que o pariu, Chefe O'Hara...",
                "Mostra o quê? Caraio!",
                "Puta paga? Caraiii... e agora? Como é que eu faço?",
                "Puta que... Como?",
                "Puta que o pariu! Então eu sô um viado! Tô fudido! Eu preciso ir embora prá casa. Chefe O'Hara, como é que eu faço?",
                "Eles são dois viado, né?"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!comissario";
    }

    @Override
    public String getCommandDescription() {
        return "!comissario - Puta que o pariu, Batima! Eu não acredito em nenhuma palavra disso! Puta que o pariu, Chefe O'Hara...";
    }

}
