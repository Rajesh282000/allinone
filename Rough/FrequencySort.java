package Rough;

import java.util.*;

class FrequencySort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3};
        int[] sortedArr = freqSort(arr);

        System.out.println("Sorted Array based on Frequency:");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    static int[] freqSort(int[] arr) {
        // Wrap the integers in a custom class to store both value and frequency
        class Element {
            int value;
            int frequency;

            Element(int value, int frequency) {
                this.value = value;
                this.frequency = frequency;
            }
        }

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Wrap the array elements in the custom class
        Element[] elements = new Element[arr.length];
        for (int i = 0; i < arr.length; i++) {
            elements[i] = new Element(arr[i], freqMap.get(arr[i]));
        }

        // Sort the elements based on frequency and value using a custom comparator
        Arrays.sort(elements, (a, b) -> {
            if (a.frequency != b.frequency) {
                return Integer.compare(a.frequency, b.frequency);
            } else {
                return Integer.compare(b.value, a.value); // Sort by value in descending order
            }
        });

        // Extract the sorted values from the wrapped elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elements[i].value;
        }

        return arr;
    }
}
