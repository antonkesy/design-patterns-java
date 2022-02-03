package de.antonkesy.designpatterns.factory_method.factory_method.product;

public class ConcreteProduct implements IProduct {

    @Override
    public void useProduct() {
        System.out.println("Concrete Product");
    }
}
