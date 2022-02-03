package de.antonkesy.designpatterns.strategy.pattern;

public class ConcreteStrategyA implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("Concrete A");
    }
}
