package LeetCode;

import java.util.HashMap;
import java.util.*;

public class LeetCode_1207 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,1,1,3};
        boolean found = uniqueOccurrences1(arr);
        System.out.println(found);

    }

    static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i:map.keySet()){
            if(!set.add(map.get(i))){
                return false;
            }
        }
        return true;
    }
    static boolean uniqueOccurrences1(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set = new  HashSet<>(map.values());
        return set.size() == map.size();
    }
}
