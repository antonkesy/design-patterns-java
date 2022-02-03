package de.antonkesy.designpattern.command.example;

import de.antonkesy.designpattern.command.pattern.ConcreteCommand;
import de.antonkesy.designpattern.command.pattern.Invoker;
import de.antonkesy.designpattern.command.pattern.Receiver;

public class CommandExample {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        ConcreteCommand command = new ConcreteCommand(receiver);
        invoker.setCommand(command);

        invoker.click();
    }
}
