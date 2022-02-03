package de.antonkesy.designpattern.command.pattern;

public class Invoker {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
