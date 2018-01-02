package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class RobeCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "Vamo logo essa porra, seu filha da puta! Tira a gente daqui, viado!",
                "A sua mãe trepando, fia da puta!",
                "Ela é uma puta mesmo! O açogueiro comeu ela!",
                "Ela tava trepando com aquele açogueiro que tá cheio de gonorréia.",
                "Tá ruim! Essa porcaria... essa porcaria não funciona, porra! Merda!",
                "Funciona nada, porra! Esse pau véio tá podre!",
                "Caraio, essa merda não funciona!",
                "Não enche o saco, porra! Merda!",
                "Ãh? Eu não acredito! essa merda não funciona!",
                "Saco! Eu não aguento mais essa merda de Batcaverna. Porra! Só eu que faço tudo nessa merda! Saco! Vô embora, vô embora daqui!... Merda! Saco!",
                "Ah... vai tomar no cu!",
                "Tá bom, tá bom. É verdade, sim, mas não enche o saco!",
                "Eu também sei, seu corno...",
                "Até a casa do Curinga? Fazê o que lá? Porra... fazê o que naquela merda?",
                "Ãh?",
                "Urghhhhh... mierda!",
                "Batiman, tá me escutando? Seu bicha! Seu puto!",
                "Liga o radinho, então, dessa merda!",
                "Hummmm... hummmm... tá bom...",
                "Olá, putinha! Tudo bem? Vamo transá hoje? Vamo comê uma bucetinha, hoje?",
                "Viado é a puta que pariu!... Sai dessa! Vamu... quero come seu cu hoje! Sua gostosa!... Quem é o maconheiro aí, hein?",
                "Ah... esse cara é babaca!",
                "Cê num vai saí daí, não, sua biscate, enquanto você num dé prá mim! Entendeu? Sua filha da puta!",
                "Ah... cala boca sua biscate, senão cê vai tomá um cacete aqui, já já...",
                "Daí vai! Dá essa porra aí! Só se for maconha!... acende essa merda logo!... uhu uhu arg...",
                "Porra! Essa merda num é maconha! Essa porra aí! Eu quero maconha!",
                "Ó como é que cê fala com ela, hein, rapaiz!",
                "Sô sim, e daí?",
                "Ó... cala boca seu filha da puta, senão vô te acertá lá fora, hein.",
                "Vai se fudê, hein, viadinho! Porra! Ah... vai tomá no cu!",
                "Engraçadinho é o caralho, seu filha da puta! Te acerto lá fora, hein, maconheiro!... Tchau, sua putinha relaxada! Te como ainda!... Viaado!!!",
                "Batima, num aguento mais lá em cima! Tá um puta putero do caraio!",
                "É mesmo! A tia tá... a tia tá dando a buceta lá, ih... tá dando, fudendo...",
                "Isso aí! Vamo lá, vamo lá, vamo pegá umas puta!",
                "3 hora!... Porra! 3 horas já? Caramba!",
                "É! O pau vai comê solto aqui! O cacete vai comê aqui! Vamo levantá o pau nessa merda, aqui, hoje!",
                "Ta aqui! Tá aqui na minha mão! Olha ela aqui, aqui na minha mão!",
                "Hummm... xô vê... enfia essa porra aqui... agora... xô vê... aqui... esseaquiesseaquiesseaqui...",
                "Batiman, da onde cê tirô esse batescudo, hein? Porra, da onde cê tirô essa merda?",
                "Vô sabê onde você guarda essa porra?",
                "Ah... dexa prá lá seu filha da puta!",
                "Seu maconheiro do caralho, cala boca!",
                "Hummm... vá se fudê, seu filha da puta!",
                "Não enche o saco, seu bicha. Cê não faz nada comigo, não, seu filha da puta!",
                "Seu... cala boca!",
                "Seu viado do carai! Fia da puta! Vem pegá!",
                "Vai nada, seu filha da... vem pegá...",
                "Sua putinha relaxada!",
                "Humm... Só que um de cada vez, né? Não precisa espalhá, né!... Vamo pegá esse filha da puta agora!",
                "Filha da puta!",
                "Aiaiai... me enrolô todo, batima! Me salva desse fia da puta... me enrolô! Eu tô fudido agora! Ele vai comê meu cu! Me solta, me solta dessa merda!",
                "Vambora daqui! Vambora dessa merda... tá fedendo!",
                "Querida, onde você vai?",
                "Onde cê vai, minha filha? Onde cê vai, porra? Num vai dá mais prá mim, hoje?... Você é um tesão, hein! Num vai embora, não!",
                "Ah, que é isso, minha filha! Num fala assim de mim, não! Pelo amor de Deus! Eu tenho o pinto grande, cê num acha?... Ah, meu pau é grande pá caraio! Cê num acha? Porra!",
                "É... ele é viado. Cê num sabia dessa? Eu num te falei, não?",
                "Tesuda! Num vai embora, não!",
                "Ela pega mesmo, hein, cuidado, hein!",
                "Ahaaaa!!!"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!robe";
    }

    @Override
    public String getCommandDescription() {
        return "!robe - Batima, num aguento mais lá em cima! Tá um puta putero do caraio!";
    }

}
