package de.antonkesy.designpatterns.adapter.pattern;

public class Adapter implements ITarget {
    private final Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
