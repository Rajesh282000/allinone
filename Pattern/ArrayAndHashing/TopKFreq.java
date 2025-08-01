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

    public int[] topKFrequentPriotityQueue(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Use a max heap (priority queue) sorted by frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );

        // Add all entries to the max heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        // Extract the top k elements
        int[] arr = new int[k];
        int j = 0;
        while (j < k && !maxHeap.isEmpty()) {
            arr[j++] = maxHeap.poll().getKey();
        }

        return arr;
    }

    public static void main(String[] args) {

    }

}
