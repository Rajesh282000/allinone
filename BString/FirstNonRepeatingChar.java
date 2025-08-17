package BString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    static char firstNonRepeatingChar(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }


        // Print the number-count pairs.
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " times.");
            if(entry.getValue()==1)
                return entry.getKey();
        }
//        System.out.println(map);;
        return '0';
    }

    public static void main(String[] args) {
        System.out.println(  firstNonRepeatingChar("aaaaaaaaaaaaab"));
    }
}
