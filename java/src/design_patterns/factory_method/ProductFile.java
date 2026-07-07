package design_patterns.factory_method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class ProductFile implements Product {

    private final BufferedReader bufferedReader;
    private final BufferedWriter bufferedWriter;

    public ProductFile(BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        this.bufferedReader = bufferedReader;
        this.bufferedWriter = bufferedWriter;
    }

    @Override
    public String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public void writeLine(String s) {
        try {
            bufferedWriter.write("\n" + s);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
