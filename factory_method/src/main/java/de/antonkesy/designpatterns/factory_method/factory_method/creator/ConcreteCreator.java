package de.antonkesy.designpatterns.factory_method.factory_method.creator;

import de.antonkesy.designpatterns.factory_method.factory_method.product.ConcreteProduct;
import de.antonkesy.designpatterns.factory_method.factory_method.product.IProduct;

public class ConcreteCreator extends Creator {
    @Override
    protected IProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
