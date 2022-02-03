package de.antonkesy.designpatterns.factory_method.example;

import de.antonkesy.designpatterns.factory_method.factory_method.creator.ConcreteCreator;

public class FactoryMethodExample {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        concreteCreator.doSomething();
    }
}
