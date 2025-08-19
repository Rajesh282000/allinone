package Pattern.ArrayAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<>();

        for(String s :strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[ c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();



            for (int i : count ){
                sb.append("#");
                sb.append(i);
            }

            String key = sb.toString();

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);

        }

        return new ArrayList(map.values());

    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams obj = new GroupAnagrams();
        System.out.println(obj.groupAnagrams(strs));
    }
}
