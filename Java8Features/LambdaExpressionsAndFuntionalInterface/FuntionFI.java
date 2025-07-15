package Java8Features.LambdaExpressionsAndFuntionalInterface;

import java.util.function.Function;

public class FuntionFI {
    public static void main(String[] args) {
        Function<String, Integer> getLength = (String s) -> s.length();
        System.out.println(getLength.apply("Hello"));
    }
}
