// Leetcode 136 no.

package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeHashMap {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        int  i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                i =  entry.getKey();
            }
        }
        return i;
    }
}
