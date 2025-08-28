package Pattern.TwoPointerAndSlidingWindow;

import java.util.HashMap;
import java.util.Map;


//sliding window and hashmap
public class LongestSubstringWithAtMostKDistinctCharacters {
    public static void brutForceApproach(String s, int k){
        HashMap<Character, Integer> map;
        int maxLength = 0;

        for(int i =0; i< s.length(); i++){
          map =  new HashMap<Character, Integer>();
            int count =0;
            for (int j = i; j < s.length(); j++) {

                char c =s.charAt(j);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
                if(map.size() > k) {
                    break;
                }
                count++;

                maxLength = Math.max(maxLength, count);
            }

        }
        System.out.println(maxLength);

    }


        public static void longestSubstringWithAtMostKDistinctCharacters(String s, int k) {
            int l = 0, r = 0, maxlength = 0;
            Map<Character, Integer> map = new HashMap<>();

            while (r < s.length()) {
                char c = s.charAt(r);
                map.put(c, map.getOrDefault(c, 0) + 1);

                while (map.size() > k) {
                    char leftChar = s.charAt(l);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0)
                        map.remove(leftChar);
                    l++;
                }

                if (map.size() == k) {
                    maxlength = Math.max(maxlength, r - l + 1);
                }

                r++;
            }

            System.out.println(maxlength);
        }



    public static void main(String[] args) {
        String s = "aabbaaa";
        int k=2;
        brutForceApproach(s, k);
        longestSubstringWithAtMostKDistinctCharacters(s, k);
    }
}
