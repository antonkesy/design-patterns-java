package de.antonkesy.designpatterns.factory_method.pattern.creator;

import de.antonkesy.designpatterns.factory_method.pattern.product.ConcreteProduct;
import de.antonkesy.designpatterns.factory_method.pattern.product.IProduct;

public class ConcreteCreator extends Creator {
    @Override
    protected IProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
