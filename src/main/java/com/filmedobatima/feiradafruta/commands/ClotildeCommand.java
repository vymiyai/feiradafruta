package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class ClotildeCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "Hãnnn... Nooossa! O Robin, aquele viadinho! Dick!!!",
                "Que é isso, Robin? Você nunca foi assim! Você é um viadinho! Você é viado!",
                "Hummm...",
                "... tá na hora deu imbora já!",
                "Que é isso, Robin! Você nunca falou assim comigo! Seu filha da puta!... Viadinho!",
                "Ai... eu quero trepá com você, Robin!",
                "Só com ele, só com ele! Ele é um tesudo, cê num acha?",
                "Nossa! Como é que você fala assim com ele, hein?",
                "Viaaado!!!",
                "Ai... eu nem acredito que isso é prá caí pintu!",
                "Não!!! Do Batima??? Nem acredito! Deix...",
                "Tá bom, tá bom, tá bom... eu faço tudo que você quisé! Queridinho da mamãe! Tesudinho! Lindo!",
                "Estou morrendo de cansaço! Vambora, meninas! Vambora!",
                "Ai... dexa eu pega essa... o negócio do Curinga, de amolecê pinto. Ai que tesão!... Tirá essa placa!",
                "Num enche o saco... bixa!",
                "Passa um perfuminho... hummm...",
                "Ahhhhiii...",
                "Adeus, Robin!",
                "Num fala assim que eu fico muim!!!",
                "Eu vô! Num aguento mais você, seu filha da puta!",
                "O camburããão???... Óia, eu queria trepá era com o sinhô, viu! Cê num qué dá prá mim, não?",
                "Ai... mas num faz mal! Assim mesmo serve! Eu faço uma xupetinha!... Cê dexa, não?... Tchau, tesão!... Adeus, viu!",
                "Ai eu quero dá pu sinhô, moço! Cê deve tê um pintão!... Eu quero dá pu sinhô! Vô pegá nu seu pintu!"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!clotilde";
    }

    @Override
    public String getCommandDescription() {
        return "!clotilde - Que é isso, Robin! Você nunca falou assim comigo! Seu filha da puta!... Viadinho!";
    }

}
