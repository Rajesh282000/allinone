package DSA_MAY_2026.Array;

public class MaxiumSubarray {
    public static void main(String[] args) {
        int[] nums ={-1,9};
        //int sum =0;
//        for (int i = 0; i < arr.length; i++) {
//            int innerSum =0;
//            for (int j = i; j < arr.length; j++) {
//                innerSum+=arr[j];
//
//             sum =   Math.max(sum, innerSum);
//
//            }
//
//        }

        int sum =Integer.MIN_VALUE;
        int innerSum = 0;
        for (int j : nums) {
            innerSum += j;

            if (innerSum < 0) {
                sum = Math.max(innerSum, sum);
                innerSum = 0;

            } else {
                sum = Math.max(innerSum, sum);

            }
        }

        System.out.println(sum);
    }
}
