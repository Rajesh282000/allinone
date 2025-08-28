package Pattern.TwoPointerAndSlidingWindow;

import java.util.HashMap;

public class NumberOfSubstringContainingAllThreeCharacters {

    public static void brutForceApproach(String s){

        int maxLength = 0;

        int count =0;
        for(int i =0; i< s.length(); i++){
            int[] hash = new int[3];
            for (int j = i; j < s.length(); j++) {
                hash[s.charAt(j)-'a']++;
//                if(hash[0] > 0 && hash[1] > 0 && hash[2] > 0){
//                    break;
//                }
                if(hash[0] >=1 && hash[1] >=1 && hash[2] >=1 ){
                    count +=1;
                }




            }

        }
        System.out.println(count);

    }

    public static void numberOfSubstringContainingAllThreeCharacters(String s){
        int[] hash = {-1, -1, -1};
        int count =0, maxLength = 0;
        for(int i =0; i< s.length(); i++) {
            hash[s.charAt(i) - 'a'] = i;
            if (hash[0] != -1 && hash[1] != -1 && hash[2] != -1) {
                count = count + (1 + Math.min(hash[0], Math.min(hash[1], hash[2])));
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
//        String s = "bbacba";
        String s = "abcabc";
       // brutForceApproach(s);
        numberOfSubstringContainingAllThreeCharacters(s);
    }


}
