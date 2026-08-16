package DSA_MAY_2026.Array;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int target = 7; int[]nums = {1,2,3,2,4,3};

//        int minSub=Integer.MAX_VALUE;
//
//        for (int i = 0; i < nums.length; i++) {
//            int sum =0, count=0;
//            for (int j = i; j < nums.length; j++) {
//                sum+=nums[j];
//
//                    count++;
//
//                if(sum >= target) {
//                    minSub = Math.min(minSub, count);
//                    break;
//                }
//
//
//            }
//
//        }
//        if(minSub == 2147483647)
//            minSub =0;


        int minSub=999,j =0, sum=0;
        for (int k = 0; k < nums.length; k++) {

            sum+=nums[k];
            while (sum>=target){
                minSub = Math.min(minSub, k-j+1);
                   sum -= nums[j++];

            }

        }

        if(minSub == 999)
          minSub =0;
        System.out.println(minSub);
    }
}
