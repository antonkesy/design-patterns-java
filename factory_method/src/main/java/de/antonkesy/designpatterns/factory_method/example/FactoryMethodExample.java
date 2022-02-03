package de.antonkesy.designpatterns.factory_method.example;

import de.antonkesy.designpatterns.factory_method.pattern.creator.ConcreteCreator;

public class FactoryMethodExample {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        concreteCreator.doSomething();
    }
}
