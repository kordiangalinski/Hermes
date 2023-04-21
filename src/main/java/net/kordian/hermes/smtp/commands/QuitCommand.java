package net.kordian.hermes.smtp.commands;

public class QuitCommand extends Command {
    public QuitCommand() {
        super("QUIT");
    }

    @Override
    void handler() {

    }
}
