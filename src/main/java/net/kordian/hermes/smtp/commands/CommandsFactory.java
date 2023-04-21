package net.kordian.hermes.smtp.commands;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandsFactory {
    public static Map<String, Command> createCommands() {
        Map<String, Command> commands = new HashMap<>();
        commands.put("QUIT", new QuitCommand());
        return commands;
    }
}