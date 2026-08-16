package DSA_MAY_2026.Array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums ={0,1};
//        int n = nums.length;
//        int rangeCal = n*(n+1)/2;
//        int totalSum=0;
//        for (int i : nums)
//            totalSum+=i;

//        System.out.println(rangeCal-totalSum);
        Arrays.sort(nums);
        int count =0;
        boolean rangeEnd=false;
        for (int i = 0; i < nums.length; i++) {
            if(count == nums[i]){
                if(i == nums.length-1) {
                    rangeEnd = true;
                    break;
                }
                count++;
            }
            else {

                break;
            }

        }

        if(rangeEnd)
            System.out.println(count+1);
        else
            System.out.println(count);

    }
}
