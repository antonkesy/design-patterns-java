package de.antonkesy.designpatterns.factory_method.pattern.creator;

import de.antonkesy.designpatterns.factory_method.pattern.product.IProduct;

public abstract class Creator {
    private IProduct product;

    protected abstract IProduct factoryMethod();

    public Creator() {
        product = factoryMethod();
    }

    public void doSomething() {
        product.useProduct();
    }
}
