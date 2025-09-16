package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public  static void sort(int[] nums){
        for(int i =0 ; i<nums.length-1;i++){
            for(int j = i+1; j>0 ; j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j, j-1);
                }
            }
        }

    }
    private static void swap(int[] nums, int i, int j) {
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums={7, 2, 0, -8, 1, 9, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
