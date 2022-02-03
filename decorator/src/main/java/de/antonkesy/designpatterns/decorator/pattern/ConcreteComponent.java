package de.antonkesy.designpatterns.decorator.pattern;

public class ConcreteComponent implements IComponent {
    @Override
    public void operation() {
        System.out.println("Concrete Component");
    }
}
