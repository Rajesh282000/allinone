package com.LeetCode;
//Linear Search

public class Leetcode_1295 {
    public static void main(String[] args) {
     int[] nums ={12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }


         static int findNumbers(int[] nums) {
                int count =0;
                for(int num : nums){
                    if(even(num)){
                        count++;
                    }
                }
                return count;
            }

          static  boolean even(int num)
            {
//                int numberOfDigits = digit2(num);
                int numberOfDigits = digits(num);

                return numberOfDigits % 2 == 0;


            }
            // For optimal result.
           /* static int digit2(int num){
              return (int)(Math.log10(num) + 1);
            }*/

          static int digits(int num){

                if(num < 0){
                    num = num * -1;
                }

                if(num == 0){
                    return 1;
                }

                int count = 0;

                while (num > 0)
                {
                    count++;
                    num =num /10;
                }
                return count;
            }
        }

