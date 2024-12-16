package com.Javatpoint;

public class FindLargestNumber {
    static int SecondLargest(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];

    }

    static int ThirdLargest(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 3];

    }


    public static void main(String[] args) {
            int a[]=new int[]{66, 21, 22, 14, 56, 76, 35};
        System.out.println("Second largest number :-"+SecondLargest(a));
        System.out.println("Third largest number :-"+ThirdLargest(a));

    }
}
