package design_patterns.factory_method;

import design_patterns.factory_method.create.CreatorFile;
import design_patterns.factory_method.create.CreatorStd;
import design_patterns.factory_method.product.Product;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        // this pattern can me made much simpler wich a higher order function
        CreatorFile creatorFile = new CreatorFile("src/design_patterns/factory_method/test.txt");
        Product product = creatorFile.initialize();
        product.writeLine("Hello world!");

        CreatorStd creatorStd = new CreatorStd();
        Product product1 = creatorStd.initialize();
        product1.writeLine("Hello world!");
    }
}
;