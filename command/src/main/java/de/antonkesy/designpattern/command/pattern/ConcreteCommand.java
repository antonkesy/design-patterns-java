package de.antonkesy.designpattern.command.pattern;

public class ConcreteCommand implements ICommand {
    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Concrete Command - execute");
        receiver.action();
    }
}
