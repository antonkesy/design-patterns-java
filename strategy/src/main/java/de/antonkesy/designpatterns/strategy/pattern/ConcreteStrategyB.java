package de.antonkesy.designpatterns.strategy.pattern;

public class ConcreteStrategyB implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("Concrete B");
    }
}
