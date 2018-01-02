package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class CapangaCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "Ih, chefe! A cana! A cana tá chegando! A cana!",
                "Eles tão chegando mais perto!",
                "Robin? Viadinho? Quem é esse cara, porra? Ãh?",
                "Ó aqui meu, maconheiro não... haha... engraçadinho você, hein? Muito engraçadinho pro meu gosto! Viado!",
                "Ãh?",
                "Olha aqui, ô... muleque! Cê qué um cigarro?",
                "Aehh...",
                "Ah é? Qué trepá com ele, é?",
                "Calabocassuaputa!!!",
                "Ah... você nun é aquele viadinho, não, é?",
                "E daí que você v... vai... vai trepá cum teu pai... vai batê uma punhetinha pro Batima, tá!",
                "Ah... acertar lá fora é o caralho, pô... cê... é... vai tomá no meio do seu cu, tá!",
                "É... engraçadinho! Ah...",
                "Vai tomá no cu!",
                "Você num viu que esse cara é viado? Porra... Ele tá aqui prá... é espião esse cara aí, porra! Esse cara tá a mando do Batima aqui, pô!... Até minha vó sabe que esse cara é bicha! Pá... é um viado, corno manso! Tá escrito na cara dele que é um corno, qué fudê cum todo mundo, qué fudê com você!... Ah... vai tomá no cu! Vô embora também daqui, vá! Vaca!",
                "Ahahh... E aquela biscate ali? Cê num vai comê ela hoje, não?",
                "Esse cara prá mim é viado, hein!",
                "Esse cara é viado, hein? Viado, hein!!!",
                "Alô!... É sim! Tudo bem? É da casa do caraio! É o chefe? Ele já vai!... Cheefe!!!",
                "Ô, chefe! Anda, porra!",
                "Porra!",
                "Chefe...",
                "Eu tô cansado pagaraio! Só trabalho nessa porra. Merda! Dô o cu aqui todo dia!",
                "Hu... ãh... ãh... eu quero! Brigado!",
                "5 e meia!",
                "Vamo lá, vamo lá!",
                "Cala boca, seu maconhero filha da puta, senão vai tomá porrada, hein, seu filha da puta! Maconhero!",
                "Eu vô te rachá, hein, viado!"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!capanga";
    }

    @Override
    public String getCommandDescription() {
        return "!capanga - Eu tô cansado pagaraio! Só trabalho nessa porra. Merda! Dô o cu aqui todo dia!";
    }

}
