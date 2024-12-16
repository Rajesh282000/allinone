package com.BString;
import java.util.*;

public class HashMapBasics2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 3, 1, 4, 5, 4, 5, 5};

        // Create a map to store the number-count pairs.
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }


        // Print the number-count pairs.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }

    }
}
