package de.antonkesy.designpatterns.decorator.example;

import de.antonkesy.designpatterns.decorator.pattern.ConcreteComponent;
import de.antonkesy.designpatterns.decorator.pattern.Decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        component.operation();

        Decorator decorator = new Decorator(component);
        decorator.operation();

        Decorator decorator1 = new Decorator(decorator);
        decorator1.operation();
    }
}
