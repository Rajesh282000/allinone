package DSA_MAY_2026.Array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1, -1 , 0}; int k =0;

//         int count =0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length ; j++) {
//                sum+= nums[j];
//                if(sum == k){
//                    count ++;
//
//                } else  {
//                    continue;
//
//                }
//            }
//
//        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1); 

        int sum = 0;
        int count = 0;

        for(int num : nums){
            sum += num;

            if(map.containsKey(sum - k))
                count += map.get(sum - k);

//            map.put(sum, map.getOrDefault(sum, 0) + 1);
            if(map.containsKey(sum))
                map.put(sum, map.get(sum) + 1);
            else
                map.put(sum, 1);
        }

        System.out.println(count);
    }
}
