package com.LeetCode;

public class Leetcode_645 {
    public static void main(String[] args) {
        int[]nums = {1,2,2,4};
        System.out.println(findErrorNums(nums));

    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];

                nums[i] = nums[correct];

                nums[correct] = temp;
            }else {
                i++;
            }
        }

       for(int index =0; index<nums.length; index++)
       {
           if(nums[index]!=index+1) {
               return new int[]{nums[index], index + 1};
           }
       }
       return new int[]{-1,-1};
    }
}
