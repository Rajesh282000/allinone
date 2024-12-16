package LeetCode;

// Cyclic sort

public class Leetcode_287 {
    public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }
    public static int findDuplicate(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correct = nums[i] - 1 ;

            if( nums[i]!= nums[correct]){

                int temp = nums[i];

                nums[i] = nums[correct];

                nums[correct] = temp;
            }else {
                i++;
            }
        }
        for (int index = 0; index < nums.length ; index++) {
            if(nums[index]!=index +1){
                return nums[index];
            }
        }
        return nums.length;

       }
    }
