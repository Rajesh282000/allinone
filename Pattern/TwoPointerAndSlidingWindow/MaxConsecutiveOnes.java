package Pattern.TwoPointerAndSlidingWindow;


//Longest subarray with at most K zeros(Sliding window)
public class MaxConsecutiveOnes {
    public static void brutForceApproach(int[] nums, int k){
        int maxlength = 0;
        for(int i =0; i < nums.length; i++){
            int zero =0, count =0;
            for(int j =i; j < nums.length; j++){
                if(nums[j]==0)
                    zero++;

                if(zero > k)
                    break;

                count++;
                maxlength = Math.max(maxlength, count);


            }
        }
        System.out.println(maxlength);
    }

    public static void maxConsecutiveOnes(int[] nums, int k){
        int l = 0, r=0, maxlength=0, len=0, zeros =0;


        while(r < nums.length){
            if(nums[r] == 0)
                zeros++;


            while(zeros>k){
                if(nums[l] ==0)
                    zeros--;

                l++;
            }
            if(zeros <= k){
                len= r - l +1;
                maxlength = Math.max(len, maxlength);
            }
            r++;
        }
        System.out.println(maxlength);

    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=2;
        brutForceApproach(arr, k);
        maxConsecutiveOnes(arr, k);
    }
}
