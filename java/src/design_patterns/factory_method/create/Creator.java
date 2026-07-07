package design_patterns.factory_method.create;

import design_patterns.factory_method.product.Product;

public abstract class Creator {

    public Product initialize() {
        /*
        this pattern is generally used when this method (creating the objects)
        is big

        concrete creators could override initialize method if the initialization
         */

        return createProduct();
    }

    abstract Product createProduct();
}
