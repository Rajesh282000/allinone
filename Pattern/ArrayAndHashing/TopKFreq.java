package Pattern.ArrayAndHashing;

import java.util.*;

public class TopKFreq {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0 ; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);

            }
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());

        }


        Collections.sort(list, Collections.reverseOrder());


        int[] arr = new int[k];


        int j =0;

        for (int freq : list) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == freq) {
                    arr[j++] = entry.getKey();
                    map.remove(entry.getKey());
                    break;
                }
            }
            if (j == k) break;
        }

        return arr;

    }
    public static void main(String[] args) {

    }

}
