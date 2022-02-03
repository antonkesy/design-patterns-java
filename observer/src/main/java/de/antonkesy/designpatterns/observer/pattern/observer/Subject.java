package de.antonkesy.designpatterns.observer.pattern.observer;

import java.util.ArrayList;

public class Subject {
    private final ArrayList<IObserver> observers = new ArrayList<>();

    public void attach(IObserver observer) {
        observers.add(observer);
    }

    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        observers.forEach(IObserver::update);
    }

}
