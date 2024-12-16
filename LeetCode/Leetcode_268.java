package LeetCode;

//Amazon coding round question
//Solving with cyclic sort

import java.util.Arrays;

public class Leetcode_268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println("The missing no. in the array :-" + sort(nums));

    }
    static  int  sort(int[] nums){
        int i =0;
        while(i < nums.length){
            int correct = nums[i] ;

            if(nums[i] < nums.length && nums[i]!= nums[correct]){

                int temp = nums[i];

                nums[i] = nums[correct];

                nums[correct] = temp;
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length ; index++) {
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
}
