package design_patterns.factory_method;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        CreatorFile creatorFile = new CreatorFile("src/design_patterns/factory_method/test.txt");
        Product product = creatorFile.createProduct();
        product.writeLine("Hello world!");

        CreatorStd creatorStd = new CreatorStd();
        Product product1 = creatorStd.createProduct();
        product1.writeLine("Hello world!");

    }
}
;