package Pattern.ArrayAndHashing;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;


        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anageam";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
