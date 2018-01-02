package com.filmedobatima.feiradafruta;

import com.filmedobatima.feiradafruta.commands.IBotCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.ReadyEvent;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;
import sx.blah.discord.util.DiscordException;

import java.util.HashMap;
import java.util.List;

@Component
public class CommandHandler {

    private static final Logger log = LoggerFactory.getLogger(CommandHandler.class);

    private String readyMesssage = "É, O PAU VAI COMER SOLTO AQUI. O CACETE VAI COMER AQUI. VAMO LEVANTAR O PAU NESSA MERDA AQUI HOJE!";
    private String playingText = "!ajuda";
    private String botUserName = "Filme do Bátima";
    private String errorMessage = "ESSA PORCARIA NÃO FUNCIONA! \n";

    private HashMap<String, IBotCommand> basicCommands;

    @Autowired
    public void setBasicCommands(List<IBotCommand> injectedBasicCommands) {
        this.basicCommands = new HashMap<String, IBotCommand>();

        for (IBotCommand command : injectedBasicCommands)
            this.basicCommands.put(command.getCommandName(), command);
    }

    private String[] tokenize(String messageString) {

        return messageString.split(" ");
    }

    private boolean isDefinedCommand(String commandToken) {
        return this.basicCommands.containsKey(commandToken);
    }

    @EventSubscriber
    public void onMessageReceived(MessageReceivedEvent event) {

        String messageString = event.getMessage().getContent();
        String[] tokenizedMessage = this.tokenize(messageString);
        String commandToken = tokenizedMessage[0].toLowerCase();

        if (isDefinedCommand(commandToken)) {
            IBotCommand command = this.basicCommands.get(commandToken);
            command.execute(tokenizedMessage, event);
        }

        // do nothing if there is no command match.
    }

    @EventSubscriber
    public void onSelfJoined(ReadyEvent event) {
        String response = this.readyMesssage;

        event.getClient().getGuilds().forEach((guild) -> {
            try {

                IDiscordClient client = event.getClient();
                client.changeUsername(botUserName);
                client.changePlayingText(playingText);
                guild.getDefaultChannel().sendMessage(response);

            } catch (DiscordException e) {
                log.error(this.errorMessage, e);
            }
        });
    }
}
