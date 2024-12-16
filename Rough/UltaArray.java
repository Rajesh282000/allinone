package com.Rough;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UltaArray {

    public static void swap (int [] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = r.nextInt();
        int [] a = new int[size];
        System.out.println("Enter Elements : ");
        for (int i = 0; i<a.length;i++) {
            a[i] = r.nextInt();
        }


        System.out.println("Printing the Array(Before the reversing) : ");
        System.out.println(Arrays.toString(a));
        reverseArray(a);// Karmkaand

        System.out.println("Printing the Array(After the reversing) : ");
        System.out.println(Arrays.toString(a));
    }
}
