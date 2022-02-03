package de.antonkesy.designpatterns.template_method.pattern;

public abstract class AbstractClass {
    public void templateMethode() {
        System.out.println("Template");
        primitiveOperation1();
        primitiveOperation2();
    }

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();
}
