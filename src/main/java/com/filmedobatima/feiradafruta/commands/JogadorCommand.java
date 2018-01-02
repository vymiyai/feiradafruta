package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class JogadorCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "Aí moçada, pegaí, pegaêê...",
                "Vamo jogá, vamo jogá, vamo jogá, vamo jogá!",
                "Vavavavai... arremessaí logo!",
                "Vamo jogá, vamo jogá, vamo jogá!... Moçada, vamo para com isso aqui, vai... encheu o saco desse jogo já, vai.",
                "Pô... vamo fazê uma suruba então! Vamo fazê uma suruba!",
                "Suruba onde, porra!",
                "Ah... em qualquer lugar, porra!",
                "Vambora, vambora!",
                "Ssss... Alguém tem uma moeda aí? Vê se essa porra tá funcionando.",
                "Vamo vê se essa merda tá funcionando, vamo vê!",
                "Xô ve se tem uma mo... ah... achei, achei, achei uma moeda. Vamo vê!... Xô vê... Uéé!... Ué, que porra é essa aqui? Num tô entendendo!",
                "Lelelele... lê isso logo... Lê essa porra logo!",
                "Olha meu, é um documento! Tá escrito que o Batima é viado!",
                "Ãh? Viado?",
                "Viado!",
                "Quem é esse cara, hein?",
                "Viado é a puta que pariu, hein! Vamo pegá esses cara de pau, vai!",
                "Aehhh... pegá esse cara de pau, porra!",
                "Viado é a puta que pariu! Vamo dá um cacete nesse viado!",
                "Num quero nada, porra! Vamo pegá esses cara de pau ou não?",
                "Jogadores: Ué? Que que tá acontecendo?",
                "Vamo vê, vamo vê, vamo vê! Quem é esse palhaço aí, hein?",
                "Esse viado aí, hein?",
                "Ihh...",
                "Tá fudido, hein?",
                "Que cê fez com ele, hein, Batima?"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!jogador";
    }

    @Override
    public String getCommandDescription() {
        return "!jogador - Olha meu, é um documento! Tá escrito que o Batima é viado!";
    }

}
