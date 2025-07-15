package Java8Features.LambdaExpressionsAndFuntionalInterface;

import java.util.function.BiFunction;


public class BiFuntionFI {
    public static void main(String[] args) {
        //BiFunction: takes two arguments and returns a result
        BiFunction<String, String, Integer> getLength = (String s1, String s2) -> s1.length() + s2.length();
        System.out.println(getLength.apply("Hello", "World"));
    }
}
