package de.antonkesy.designpatterns.observer.pattern.context;

import de.antonkesy.designpatterns.observer.pattern.observer.IObserver;
import de.antonkesy.designpatterns.observer.pattern.observer.Subject;

public class Context {
    private Subject subject;

    public Context(Subject subject) {
        this.subject = subject;
    }

    public void attach(IObserver observer) {
        subject.attach(observer);
    }

    public void detach(IObserver observer) {
        subject.detach(observer);
    }

    public void onObserverUpdate() {
        System.out.println("Context - on observer update");
    }

    public void observerNeedUpdate() {
        subject.notifyObserver();
    }
}
