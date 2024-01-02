package br.com.alura;

import br.com.alura.command.Command;

public class CommandExecutor {
    public void executeCommand(Command command) {
        command.execute();
    }
}
