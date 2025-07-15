package Java8Features.LambdaExpressionsAndFuntionalInterface;

import java.util.function.Supplier;

public class SupplierFI {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
}
