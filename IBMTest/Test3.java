package IBMTest;

import java.util.Locale;

public class Test3 {
    public static void main(String[] args) {

        String s1 = "rajesh Burnwal";
        returnVowel(s1);
    }

    static void returnVowel(String str){
        str= str.toLowerCase();
        String s="";
        char[] ch = str.toCharArray();
        for (int i=0; i< ch.length; i++){

            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                s += ch[i];
            } else if (Character.isWhitespace(ch[i])) {
                s += " "; // Add space after each word
            }

        }
        System.out.println(s);

    }


}
