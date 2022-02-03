package de.antonkesy.designpatterns.composite.pattern;

import java.util.ArrayList;

public class Composite implements IComponent {
    private final ArrayList<IComponent> children = new ArrayList<>();

    public void add(IComponent component) {
        children.add(component);
    }

    public void remove(IComponent component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        children.forEach(IComponent::operation);
    }
}
