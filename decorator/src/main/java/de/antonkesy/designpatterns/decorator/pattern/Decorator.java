package de.antonkesy.designpatterns.decorator.pattern;

public class Decorator implements IComponent {
    private IComponent decoratee;

    public Decorator(IComponent decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public void operation() {
        System.out.println("Decorator");
        decoratee.operation();
    }
}
