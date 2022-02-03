package de.antonkesy.designpatterns.composite.example;

import de.antonkesy.designpatterns.composite.pattern.Composite;
import de.antonkesy.designpatterns.composite.pattern.ConcreteComponent;

public class CompositeExample {
    public static void main(String[] args) {
        Composite composite = new Composite();

        composite.add(new ConcreteComponent("0_0"));
        composite.add(new ConcreteComponent("0_1"));


        Composite composite1 = new Composite();
        composite1.add(new ConcreteComponent("1_0"));

        composite.add(composite1);

        composite.operation();
    }
}
