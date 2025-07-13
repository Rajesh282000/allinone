package Java8Features.LambdaExpressionsAndFuntionalInterface;

import java.util.function.Predicate;

public class PredicateFI {
    public static void main(String[] args) {

        Predicate<String> predicate = (String s) -> s.length() > 5;
        Predicate<Integer>  isEven = (n) -> n%2 == 0;
        System.out.println(predicate.test("Hello"));
        System.out.println(isEven.test(10));
    }
}
