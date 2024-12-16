package LeetCode;

import java.util.Arrays;

public class LeetCodeEasy1 {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        plusOne(arr);

        System.out.println(Arrays.toString(arr));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1; i>=0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i]=0;
        }

        int[] res = new int[n+1];
        res[0] = 1 ;
        return res;
    }
}
