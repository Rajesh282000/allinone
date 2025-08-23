package Pattern.TwoPointerAndSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void brutForceApproach(String s){
        char[]  charArray  = s.toCharArray();
        System.out.println(charArray[0]-0);
        int max = Integer.MIN_VALUE;
        int len ;
        for(int i = 0; i < charArray.length; i++){

            //hashing technique with array
            int[] hash = new int[256];
            for(int j = i; j < charArray.length; j++){
                if(hash[charArray[j]-0] == 1)
                    break;

                len = j - i + 1;
                max = Math.max(max, len);
                hash[charArray[j]-0]+=1;

            }

        }

        System.out.println(max);

    }


    public static int twoPointerPlusHashMapApproach(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (map.containsKey(c) && map.get(c) >= l) {
                // Move left pointer to avoid duplicate
                l = map.get(c) + 1;
            }

            map.put(c, r);
            max = Math.max(max, r - l + 1);
        }

        return max;
    }


    public static void main(String[] args) {

      //  brutForceApproach("cadbzabcd");
      int max=  twoPointerPlusHashMapApproach("pwwkew");
        System.out.println(max);

    }
}
