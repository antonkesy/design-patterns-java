package de.antonkesy.designpatterns.strategy.example;

import de.antonkesy.designpatterns.strategy.pattern.ConcreteStrategyA;
import de.antonkesy.designpatterns.strategy.pattern.ConcreteStrategyB;
import de.antonkesy.designpatterns.strategy.pattern.IStrategy;

public class StrategyExample {

    static class Context {
        public IStrategy strategy;

        public void doSomething() {
            strategy.doSomething();
        }
    }

    public static void main(String[] args) {
        Context context = new Context();

        context.strategy = new ConcreteStrategyA();
        context.doSomething();

        context.strategy = new ConcreteStrategyB();
        context.doSomething();
    }
}
