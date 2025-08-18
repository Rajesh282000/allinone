package Pattern.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : nums) {
            set.add(num);
        }
        // System.out.println(set);
        List<Integer> myList = new ArrayList<>(set);
        int count = 1;
        int max = 1;
        for (int i = 0 ; i < set.size()-1; i++) {
            if (myList.get(i + 1) - myList.get(i) == 1) {
                count++;
                max = Math.max(max, count);
            }else{
                count=1;
            }

        }
        //  System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
//        int[] nums ={2,20,4,10,3,4,5};
        int[] nums = {0,3,2,5,4,6,1,1};
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        System.out.println(obj.longestConsecutive(nums));
    }
}
