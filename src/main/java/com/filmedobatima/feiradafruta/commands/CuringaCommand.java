package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.Random;

@Component
public class CuringaCommand implements IBotCommand {

    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {

        String[] quotes = new String[]{
                "A cana? Filho dumas putas! Como é que me decobriram aqui? E o Batima, porra? Agora que vai fudê com o Batima! E agora, que que eu faço?",
                "Chegando mais perto... Vamo dá o fora daqui que nós tamo fudido! Vamo dá o fora daqui! Vamo dá o fora daqui!",
                "Uhhh... hoje eu vô comê o Batima! Vô fudê ele direitinho! Vô tirá o pinto dele fora!!!",
                "Hein?... Ah... dexa ela prá lá! Essa minina aí num é de nada! Eu num gosto de mulé, eu gosto mesmo é do Bat...",
                "Hein?... Minha filha, vem cá!... Sabe o que é isso aqui, minha filha?... Isso aqui é pá amolecê pintu, isso aqui cai pintu! É um lico que cê passa na cabeça do pau...",
                "É... mas cê vai passa isso aqui na cabeça do pau do Batiman...",
                "Não! Num abre, num abre, num abre, num abre!... Se não vai caí o meu pinto!!! Agora cê vai fazê o seguinte: cê vai pegá o Batima e vai pass...",
                "Ahh... gracinha!",
                "Opa, opa! Que negócio é esse de você me chamá de viado, hein? Hã?... Ah... o Batima tá chegando, hein! Vamo acertá ele direitinho agora, hein!",
                "Ah... o Batima chego, agora eu vô tirá o pintu dele! O Batima tá fudido na minha, agora, ha!... Ah... agora, agora, agora...",
                "Ah... Jávai, jávai, javai...",
                "Ah... prá mim, prá mim, prá mim... Alô? Quem tá falando? Ah... tia do Batima? que você qué, sua velha puta?... Qué que eu te coma? Ma como?... Eu comê você?",
                "Ah, tá bom, tá bom! Vamo fazê o seguinte... comê a senhora aí na mansão Wayne? Ah, eu vô, eu vô, eu vô!... Ahh... eu vô agora mesmo, agora mesmo, eu vô, eu vô, eu vô!... A senhora dá o cu prá mim! Eu vô!... Uhhh... vô comê a tia do Batima!... Uhuhuhu... agora memo eu vô lá, eu vô lá! hahaha...",
                "Que foi?",
                "Ahhh... eu posso fazê mai nada. Tô ficando véio, tô acabado, meu pinto num sobe mais... e eu preciso fazê alguma coisa prá me alegrá. Eu sô um palhaço, eu sô o Curinga, o palhaço... o Joker, o Palhaço!... Cê qué um charuto meu filho? É havano!",
                "Hahahahahahaha... Enganei o bobo, na casca do ovo! Eu sô um bobo! Eu sô um palhaço!... Falá em palhaço, que horas são, hein?",
                "Ah... tá na hora de comê a tia do Batima. Eu vô comê a tia do Bati. Eu sô o primero, eu sô o primero, eu sô o primero! Vamo lá, vamo lá!",
                "Uhuhuhuhuhuuuu... Seus bichasss! Ah, vô contá pro Batima, hein... vô contá pro Batima que eu vi vocês pegando isso, viu! Seus cornosss mansosss!... Viadinhusss!",
                "Ah, cê num sabe quem eu sô, é?",
                "Cês que sabem! Se cês querem pegá de pau, pega, porra! Mas depois aguenta as conseqüênciassss! Viu seus viadusss! Bichasss!",
                "Ahh... Ahhahaaa... Cês querem que o Batima venha aqui, né? Pega vocês, salvá vocês!",
                "Ah, mas o Batima morreu, viu, seus viadosss! Ele morreu às 4 hora da tarde! Tirei o pinto dele fora! Ahhh.... falá em tirá o pinto dele fora, vô tirá o pinto de vocês também! Que cês acham, hein?... Ãh?",
                "Uhhh.... Ahhh... O pau... o pau vai comê solto aqui!... ai meu pinto!... ai... ai... ai meu saco... ai meu saco, ai meu saco, ai!",
                "Ah... agora... agora pega essa aqui, Batima! Pega essa! Pega essa... pega essa!",
                "Peidorrento!... Eu te pego, filho da puta!... Uhhhh...",
                "Hahahahahaha... Vô usa esse spray prá tirá seu pinto fora, Batima! Seu corno!",
                "Ãhhh... ahhhhh...",
                "Uhuhuhuhuuuu... isso é um assalto, seu filho da puta! Vira a bundinha prá mim, vira, Batima!... Viado! Bicha! Seus doi bichass!",
                "*E na mansão Wayne*"
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        event.getChannel().sendMessage(quotes[index]);
    }

    @Override
    public String getCommandName() {
        return "!curinga";
    }

    @Override
    public String getCommandDescription() {
        return "!curinga - Não! Num abre, num abre, num abre, num abre!... Se não vai caí o meu pinto!!!";
    }

}
