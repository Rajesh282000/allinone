package Array;

public class Array1 {
    public static void main(String[] args) {
        int ans = sum13(new int[]{13, 1, 2, 13, 2, 1, 13});
        System.out.println(ans);

        boolean b  = either24(new int[]{4, 4, 1, 2, 2});
        System.out.println(b);
    }
    static int sum13(int[] nums) {
        int sum = 0;
        boolean skipNext = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                skipNext = true;
            } else if (!skipNext) {
                sum += nums[i];
            } else {
                skipNext = false; // Reset the flag if we skipped a 13
            }
        }

        return sum;
    }

    static boolean either24(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has22 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                has44 = true;
            }
        }

        return (has22 || has44) && !(has22 && has44);
    }



    /* Q)Given an array of ints, return true if the value 3 appears
    in the array exactly 3 times, and no 3's are next to each other.

    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false*/


    static boolean haveThree(int[] nums) {
        int count = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false; // Two consecutive 3's found
                }
            }
        }

        return count == 3; // Check if the count is exactly 3
    }


}
