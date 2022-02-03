package de.antonkesy.designpatterns.factory_method.pattern.product;

public class ConcreteProduct implements IProduct {

    @Override
    public void useProduct() {
        System.out.println("Concrete Product");
    }
}
