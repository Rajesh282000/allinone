package Pattern.ArrayAndHashing;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length ; i++){
            int c =target  -  nums[i] ;
            if(map.containsKey(c)){
                return new int[]{map.get(c), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = new TwoSum().twoSum(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
