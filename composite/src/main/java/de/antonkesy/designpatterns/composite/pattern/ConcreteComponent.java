package de.antonkesy.designpatterns.composite.pattern;

public class ConcreteComponent implements IComponent {
    private final String id;

    public ConcreteComponent(String id) {
        this.id = id;
    }

    @Override
    public void operation() {
        System.out.println("Concrete Component " + id);
    }
}
