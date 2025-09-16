package Java8Features.LambdaExpressionsAndFuntionalInterface.StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumberList {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 12, 3, 4, 15, 6, 7, 118, 9, 110, 20, 7);
//       list.stream().filter(n-> n%2==0).forEach(System.out::println);
//
//       List<String> names = Arrays.asList("Amit", "Ankit", "Sachin", "Rahul", "Rahul", "Rahul", "Rahul", "Rahul");
//       names.stream().map(String::toUpperCase).distinct().forEach(System.out::println);

//        List<Integer> list = Arrays.asList(1, 12, 3, 4, 15, 6, 7, 118, 9, 110, 20, 7);
//       int sum = list.stream().reduce(0, Integer::sum);
//        System.out.println(sum);

//        List<Integer> list = Arrays.asList(1, 12, 3, 4, 15, 6, 7, 118, 9, 110, 20, 7);
//        int max = list.stream().max(Integer::compare).get();
//        System.out.println(max);
//
//        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry");
//        long count = words.stream().filter(w -> w.startsWith("a")).count();
//        System.out.println(count);

        List<Integer> nums = Arrays.asList(1, 12, 3, 4, 2, 4, 7, 18, 18, 110, 20, 7);

        Set<Integer> set = new HashSet<>();
        nums.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    }
}
