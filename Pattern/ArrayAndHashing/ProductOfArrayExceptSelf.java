package Pattern.ArrayAndHashing;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // int[] res = new int[nums.length];
        // int k=0;
        // for(int i =0; i< nums.length; i++){
        //     int product =1;
        //     for(int j=0; j< nums.length; j++){
        //         if(i == j)
        //         continue;

        //         product *= nums[j];


        //     }
        //     res[k++]= product;
        // }

        // return res;

        int product = 1;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        int[] res = new int[nums.length];
        int k = 0;

        for (int j = 0; j < nums.length; j++) {
            if (zeroCount > 1) {
                res[k++] = 0; // More than one zero — all products will be zero
            } else if (zeroCount == 1) {
                res[k++] = (nums[j] == 0) ? product : 0;
            } else {
                res[k++] = product / nums[j];
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] res = new ProductOfArrayExceptSelf().productExceptSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
