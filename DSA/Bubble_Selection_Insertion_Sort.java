package com.DSA;

import java.util.Arrays;

public class Bubble_Selection_Insertion_Sort {
    public static void main(String[] args) {
        int[] bsArr = {-3,2,1,4,5};
        int[] ssArr = {-3,2,1,4,5};
        bubble(bsArr);
        System.out.println("Bubble sort");
        System.out.println(Arrays.toString(bsArr));
        selection(ssArr);
        System.out.println("Seletion sort");
        System.out.println(Arrays.toString(ssArr));
        Insertion(ssArr);
        System.out.println("Insertion sort");
        System.out.println(Arrays.toString(ssArr));

    }
    //Bubble sort
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped =true;
                }
            }
            if(swapped == false){
                break;
            }
        }

    }

    // Selection Sort

    static void selection(int[] arr) {

        for (int i = 0 ; i < arr.length; i++) {

// find the max item in the remaining array and swap with correct index

            int last = arr.length - i - 1;

            int maxIndex = getMaxIndex (arr,  0, last);
            swap(arr, maxIndex, last);

        }

    }
    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];

        arr[first] = arr[second];

        arr[second] = temp;
    }

    static int getMaxIndex (int[] arr, int start, int end) {

        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {

                max = i;

            }

        }

        return max;
    }

    // Insertion sort

    static void Insertion(int[] arr){
        for(int i = 0; i< arr.length -1; i++){
            for (int j = 1; j > 0  ; j--) {
                if(arr[j] < arr[j -1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else {
                    break;
                }
            }
        }

    }
}
