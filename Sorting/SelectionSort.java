package com.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public  static void sort(int[] nums){
        for(int i =0 ; i<nums.length;i++) {
           int last = nums.length-i-1;
           int maxIndex = findLargest(nums,0,last);
           swap(nums,last,maxIndex);

        }
    }

    private static int findLargest(int[] nums, int start, int last) {

        int max =start;
        for (int j = start; j <= last; j++) {
         if (nums[max] < nums[j]){
             max =j;
         }
        }
        return max;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums={0,7, 5, -8, 1, 9, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
