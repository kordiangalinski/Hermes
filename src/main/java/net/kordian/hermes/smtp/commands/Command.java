package net.kordian.hermes.smtp.commands;

public abstract class Command {
    private final String cmd;

    public Command(String cmd) {
        this.cmd = cmd;
    }

    abstract void handler();
}

/*
    TODO:// Commands to implement:
        - EHLO/HELO
        - MAIL FROM:
        - RCPT TO: // RECIPIENT
        - DATA
        - EXPN
        - VRFY
        - NOOP
        - HELP
        - RSET
        - #UNKN#
 */