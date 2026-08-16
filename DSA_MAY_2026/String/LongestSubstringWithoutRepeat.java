package DSA_MAY_2026.String;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() ==1)
            return 1;
        if (s.isEmpty())
            return 0;
        int count =0, i =0 , j =0, max =count;
        HashMap<Character, Integer> hmap = new HashMap<>();
        while(i< s.length()) {
            while (hmap.containsKey(s.charAt(i))) {
                hmap.remove(s.charAt(j));
                j++;
                count--;
            }

            hmap.put(s.charAt(i), 1);
            count++;

            max = Math.max(count, max);
            i++;

        }

        return max;
    }

    public static void main(String[] args) {
//        #	Input s	Expected Output	Longest substring example
//        1	"abcabcbb"	3	"abc"
//        2	"bbbbb"   	1	"b"
//        3	"pwwkew"	3	"wke"
//        4	""	        0	""
//        5	"a"	        1	"a"
//        6	"abcdef"	6	"abcdef"
//        7	"abba"	    2	"ab" / "ba"
//        8	"dvdf"	    3	"vdf"
//        9	"aab"	    2	"ab"
//       10 "tmmzuxt"	5	"mzuxt"

        System.out.println(lengthOfLongestSubstring("dvdf"));

    }
}
