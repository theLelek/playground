package design_patterns.factory_method.product;

import java.util.Scanner;

public class ProductStd implements Product {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

    @Override
    public void writeLine(String s) {
        System.out.println(s);
    }
}
