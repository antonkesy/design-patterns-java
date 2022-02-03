package de.antonkesy.designpatterns.observer.pattern.context;

import de.antonkesy.designpatterns.observer.pattern.observer.IObserver;

public class ConcreteObserver implements IObserver {
    private Context context;

    public ConcreteObserver(Context context) {
        this.context = context;
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserver - update from" + this);
        context.onObserverUpdate();
    }
}
