package Java8Features.LambdaExpressionsAndFuntionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIPrac1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 12, 3, 4, 15, 6, 7, 118, 9, 110, 20, 7);
        List<Integer> filterList = list.stream()
                .filter(i -> i % 2 == 0)
                .sorted((a, b) -> b - a)
                .distinct()
                .limit(7)
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(filterList);
    }
}
