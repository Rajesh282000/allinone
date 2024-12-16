package Array;

public class Array2 {
    public static void main(String[] args) {

    }

   /* Given an array of ints, return true if every 2 that
      appears in the array is next to another 2.


    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false*/
    static boolean twoTwo(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 2) {
                // If the current element is 2, check the adjacent elements.
                if ((i > 0 && nums[i - 1] == 2) || (i < n - 1 && nums[i + 1] == 2)) {
                    // If either the previous or the next element is also 2, continue to the next element.
                    continue;
                } else {
                    // If neither the previous nor the next element is 2, return false.
                    return false;
                }
            }
        }

        return true;
    }


    /*For each multiple of 10 in the given array, change all the values
    following it to be that multiple of 10, until encountering another
    multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]*/


    static int[] tenRun(int[] nums) {
        int currentMultiple = -1; // Initialize with a value that is not a multiple of 10

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                currentMultiple = nums[i]; // Update the current multiple of 10
            } else if (currentMultiple != -1) {
                nums[i] = currentMultiple; // Replace with the current multiple of 10
            }
        }

        return nums;
    }

    /*We'll say that an element in an array is "alone" if there are values
     before and after it, and those values are different from it. Return a version
     of the given array where every instance of the given value which is alone is
     replaced by whichever value to its left or right is larger.


    notAlone([1, 2, 3], 2) → [1, 3, 3]
    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    notAlone([3, 4], 3) → [3, 4]*/



    static int[] notAlone(int[] nums, int val) {
        int length = nums.length;

        for (int i = 1; i < length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                // If the current element is alone, replace it with the larger neighbor
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }

        return nums;
    }
}
