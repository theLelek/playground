package design_patterns.factory_method;

public class CreatorStd implements Creator {

    @Override
    public Product createProduct() {
        return new ProductStd();
    }
}
