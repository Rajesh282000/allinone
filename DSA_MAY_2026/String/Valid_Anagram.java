package DSA_MAY_2026.String;

import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        boolean res =false;
        if (s.length() != t.length())
            System.out.println(res);

        char[] char1 = s.toCharArray();
         Arrays.sort(char1);

        char[] char2 = t.toCharArray();
        Arrays.sort(char2);

        for(int i=0; i< char2.length; i++){
            if (char1[i] != char2[i])
                System.out.println(res);


        }
    }
}
