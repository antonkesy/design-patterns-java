package de.antonkesy.designpatterns.observer.example;

import de.antonkesy.designpatterns.observer.pattern.context.ConcreteObserver;
import de.antonkesy.designpatterns.observer.pattern.context.Context;
import de.antonkesy.designpatterns.observer.pattern.observer.Subject;

public class ObserverExample {
    public static void main(String[] args) {
        Context context = new Context(new Subject());

        context.attach(new ConcreteObserver(context));
        context.attach(new ConcreteObserver(context));

        context.observerNeedUpdate();
    }
}
