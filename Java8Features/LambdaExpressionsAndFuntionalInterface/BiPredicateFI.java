package Java8Features.LambdaExpressionsAndFuntionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateFI {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (String s1, String s2) -> s1.equals(s2);
        System.out.println(biPredicate.test("Hello", "Hello"));
    }
}
