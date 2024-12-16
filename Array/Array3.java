package com.Array;

public class Array3 {
    public static void main(String[] args) {

    }

   /* Return an array that contains the exact same numbers as the given array, but
   rearranged so that all the zeros are grouped at the start of the array. The order
   of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
   You may modify and return the given array or make a new array.


    zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    zeroFront([1, 0]) → [0, 1]
*/


    public int[] zeroFront(int[] nums) {

        int length = nums.length;
        int[] result = new int[length];
        int index = length - 1; // Start from the end of the result array

        // First pass: Append non-zero numbers to the end of the result array
        for (int num : nums) {
            if (num != 0) {
                result[index] = num;
                index--;
            }
        }

        // Second pass: Append zeros to the beginning of the result array
        for (int i = 0; i <= index; i++) {
            result[i] = 0;
        }

        return result;
    }

   /* Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.


            evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) → [2, 3, 3]
    evenOdd([2, 2, 2]) → [2, 2, 2]*/

    static int[] evenOdd(int[] nums) {
        int evenIndex = 0; // Initialize an evenIndex to track the position of even numbers

        // Iterate through the array to move even numbers to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                // Swap the even number at nums[i] with the number at evenIndex
                int temp = nums[i];
                nums[i] = nums[evenIndex];
                nums[evenIndex] = temp;

                evenIndex++; // Move the evenIndex forward
            }
        }

        return nums;
    }

}
