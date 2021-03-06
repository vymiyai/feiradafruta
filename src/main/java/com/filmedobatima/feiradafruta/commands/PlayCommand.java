package com.filmedobatima.feiradafruta.commands;

import org.springframework.stereotype.Component;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IVoiceChannel;
import sx.blah.discord.util.audio.AudioPlayer;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.net.URL;

@Component
public class PlayCommand implements IBotCommand {

    public static Hashtable<String,URL> audios = new Hashtable<String,URL>() {
        {
            put("seumadruganao", getClass().getClassLoader().getResource("audios/seumadruganao.mp3"));
            put("fracassado", getClass().getClassLoader().getResource("audios/fracassado.mp3"));
            put("olhabem", getClass().getClassLoader().getResource("audios/veditaolhabem.mp3"));
            put("numintendi", getClass().getClassLoader().getResource("audios/numIntendioqueelefalou.mp3"));
        }
    };



    @Override
    public void execute(String[] tokenizedMessage, MessageReceivedEvent event) {
        if (tokenizedMessage.length < 2) {
            event.getChannel().sendMessage("Você não sabe mexer em porra nenhuma! !play <audio>");
            return;
        }

        String arg1 = tokenizedMessage[1];
        if (audios.containsKey(arg1)) {
            URL audioPath = audios.get(arg1);

            // Enter the voice channel of the user executing the command
            IVoiceChannel userVoiceChannel = event.getAuthor().getVoiceStateForGuild(event.getGuild()).getChannel();
            if(userVoiceChannel == null) {
                event.getChannel().sendMessage("Você não sabe mexer em porra nenhuma! Entra em um canal de voz primeiro.");
                return;
            }

            userVoiceChannel.join();

            // Get the AudioPlayer object for the guild
            AudioPlayer audioP = AudioPlayer.getAudioPlayerForGuild(event.getGuild());

            try {
                audioP.queue(audioPath);
            } catch (IOException | UnsupportedAudioFileException e) {
                event.getChannel().sendMessage("Essa merda não funciona.");
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getCommandName() {
        return "!play";
    }

    @Override
    public String getCommandDescription() {
        return "!play <" + String.join("|",audios.keySet()) +"> - Veditaaaa! Olhaa beeeem! WOOOOOOOOH!";
    }
}
