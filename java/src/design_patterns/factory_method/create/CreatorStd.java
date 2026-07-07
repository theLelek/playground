package design_patterns.factory_method.create;

import design_patterns.factory_method.product.Product;
import design_patterns.factory_method.product.ProductStd;

public class CreatorStd extends Creator {

    @Override
    Product createProduct() {
        return new ProductStd();
    }
}
