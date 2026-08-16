package DSA_MAY_2026.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {
    public static void main(String[] args) {
        int[] nums={3,3,4};

//        Arrays.sort(nums);
//        int num =Integer.MIN_VALUE, maxtotal =0, trackI = 0;
//
//        for (int i  = 0; i  < nums.length-1 ; i ++) {
//            int count =1;
//            for (int j = i+1; j <= nums.length-1 ; j++) {
//                if(nums[j] == nums[i])
//                {
//
//                    count++;
//
//                }
//                else {
//                    trackI = j - 1;
//                    break;
//                }
//            }
//            if(count > maxtotal){
//                maxtotal =count;
//
//                num = nums[i];
//                i=trackI;
//
//            }
//
//        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i,1);
        }
        int num =0, maxNum =0;
        for(Map.Entry<Integer,Integer> hmap : map.entrySet()){
           if(hmap.getValue()>maxNum) {
               maxNum = hmap.getValue();
               num = hmap.getKey();
           }
        }
        System.out.println(num);
    }
}
