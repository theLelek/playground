package design_patterns.factory_method;

import java.io.*;

public class CreatorFile implements Creator {

    private final String filePath;

    public CreatorFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Product createProduct() {
        try {
            return new ProductFile(new BufferedReader(new FileReader(filePath)), new BufferedWriter(new FileWriter(filePath, true)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
