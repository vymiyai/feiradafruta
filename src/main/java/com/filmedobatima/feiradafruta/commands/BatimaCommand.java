package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class BatimaCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "Não, cego guarda! Seu pai e sua mãe vestidos para o baile dos enxutos!",
                "É simples comissário; essa fita mostra tudo.",
                "A sua mãe e sua mulher são duas putas, comissário. Eu não queria falar nisso, mas... a verdade é essa. São duas putas pagas.",
                "É simples, comissário. Eu e Robin estamos no encalço do... no encalço daquele filho da puta que as comeu. É muito simples, comissário...",
                "Comissário, eu e Robin descobrimos ontem. Colocamos essa fita... em seu apartamento para sabermos se o Curinga ia aparecer lá, mas... ela nos traiu. A sua mulher é uma puta mesmo, comissário! Ela estava dando para o açogueiro.",
                "E tem mais, comissário! Eu e Robin descobrimos que sua mãe também é puta.",
                "Não faz nada, comissário. Eu e Robin vamos cuidar de tudo. Quando nós descobrirmos alguma coisa, vamos dizer ao senhor. Não se preocupe! Eu e Robin... somos a dupla dinâmica!",
                "Vambora, Robin, vamo embora!",
                "hummmm... como é que tá indo aí, Robin?",
                "É claro que funciona, Robin!",
                "Porra!",
                "Robin, você é um garoto! Não f... pode ficar falando palavrões! Você é um menino ainda!",
                "Robin...",
                "É claro que funciona, Robin. Você não sabe mexer em porra nenhuma.",
                "Mal agradecido! Vô te colocar num colégio interno!",
                "Robin, você me mandou tomar no cu! Eu não acredito no que eu ouvi. Não acredito no que eu ouvi! Não pode ser verdade isso que eu escutei agora. Você é um menino ainda! Eu te criei!",
                "Mas... precisamos bolar um plano prá pegar o Curinga, Robin. Eu sei de um plano!",
                "Chega de brincadeiras... Vamusss atá casa do Curinga! Eu e você!",
                "Eu sei... eu sei de um plano, Robin. Você vai entrar no quarto dele... vai... não! Correção!",
                "Você vai se fantasiar... como mulher do Curinga. Você vai se fazer passar como mulher do Curinga. Você vai dormir uma noite com o Curinga! Você vai se fantasiar de viado!",
                "Vamo pará com esse xingamento, hein!",
                "Dexa eu vê essa porra aqui!... Uai!... Robin, me dê sua \"luecoalização\", por favor! Eu não tô entendendo nada do que tá escrito aqui!",
                "Putero, não, Robin! Modere o seu linguajar!",
                "Então vamo fazê um coisa: vamo busca umas putas prá trazê prá cá, vai!",
                "Eu sei vê hora, porra!... Bom... o negócio é o seguinte: o pau vai comê solto aqui agora e... moçada, todo mundo prá trás!",
                "Robin, modere o linguajar, por favor!... Muito bem!... Você trouxe a moeda que eu pedi?",
                "Então vai naquela máquina... e liga esta porra!",
                "Rápido, Robin, para trás do batescudo!",
                "Dessa vez eu acerto esse filho da puta!",
                "Você tá muito engraçadinho, hein, Robin! Lógico que foi do cu! Podia ser mais da onde?",
                "Engraçadinho! Você tá muito metido, hein, Robin! Ha... Eu te acerto hoje lá na... na Batcaverna, viu! Você...",
                "Você me chamou de novo de filho da puta? Não acredito!... Viadinho! Filho da puta!... Viado!",
                "Robin, desculpa, nós somos a dupla dinâmica! Temo ques lutar em prol da justiça!",
                "Outra vez? Não acredito que você está me xingando outra vez, Robin! Eu vô te fudêagal, agora, hein! Sai daqui, filha da puta!",
                "Filha da puta?",
                "Não acredito!",
                "Robin, se você não saí daqui já, eu vô te comê a bunda aqui mesmo! Viado! Corno Man...",
                "Ah... perapera... esqueci uma coisa, esqueci uma coisa... meu filho, você vende camisinha aqui? Eu quero uma camisinha... é que eu... preciso comê o Robin hoje à noite!",
                "Ahaaaa!!!",
                "Minha filha, me dá esse frasco aqui!",
                "Me dá esse frasco aqui, minha filha! A senhora...",
                "Ahh... Ih, fudeu, Robin!",
                "Hã... perfume...",
                "Ãh... vamo, Robin, vamo levá ela prá Batcaverna.",
                "Não se preocupem rapazes! Eu mesmo coloquei esse documento aí! Esse documento não prova nada! Prova só que o Curinga é um filho da puta!... por falar em filho da puta, o Robin vai dar o cu pá todo mundo hoje, hein! O Robin é um viado!",
                "Vamo, vamo, vamo!",
                "Viado!",
                "Ha! Não adianta Curinga! Antes de sair da Batcaverna eu tirei meu pinto fora... eu não tenho pinto! Não sei se você sabe disso. Eu sou eunuco! Você tá fudido agora comigo!",
                "Eu não fiz nada, eu não fiz nada! Ele que começou a brincadeira! Ele que começou e agora se fudeu!... bom, moçada, eu vô embora porque eu tenho mais o que fazê.",
                "Clotilde... o camburão está esperando!",
                "Não, minha filha, eu num sô disso! Eu sô viado! Num sei se você sabe.",
                "Cala boca, viado!",
                "Essa juventude de hoje está muito mudada!"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!batima";
    }

    @Override
    public String getCommandDescription() {
        return "!batima - Você tá muito engraçadinho, hein, Robin! Lógico que foi do cu! Podia ser mais da onde?";
    }

}
