package design_patterns.factory_method.create;

import design_patterns.factory_method.product.Product;
import design_patterns.factory_method.product.ProductFile;

import java.io.*;

public class CreatorFile extends Creator {

    private final String filePath;

    public CreatorFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    Product createProduct() {
        try {
            return new ProductFile(new BufferedReader(new FileReader(filePath)), new BufferedWriter(new FileWriter(filePath, true)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
