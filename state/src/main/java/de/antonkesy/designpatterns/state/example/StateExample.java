package de.antonkesy.designpatterns.state.example;

import de.antonkesy.designpatterns.state.pattern.ConcreteStateA;
import de.antonkesy.designpatterns.state.pattern.ConcreteStateB;
import de.antonkesy.designpatterns.state.pattern.Context;

public class StateExample {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new ConcreteStateA());
        context.request();

        context.setState(new ConcreteStateB());
        context.request();
    }
}
