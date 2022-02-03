package de.antonkesy.designpatterns.template_method.pattern;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("Primitive 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("Primitive 2");
    }
}
