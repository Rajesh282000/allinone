package BString;

import java.util.Arrays;

public class BasicsString {
    public static void main(String[] args) {
        afterSpace("r burnwal ajesh");
        anagrams("heis","sieh");
    }

    //after space character of string while be uppercase
    static void afterSpace(String str){

        char[] ch = str.toCharArray();
        int size =ch.length;
        ch[0]=(char)(ch[0]-32);
        int i=1;
        while (i!=size){
            if(ch[i]==' '){
                ch[i+1]=(char)(ch[i+1]-32);
            }
            ++i;
        }

        System.out.println(String.valueOf(ch));
    }

    //Anagrams
    static void anagrams(String str1, String str2){

        if(str1.length()!=str2.length()){
            System.out.println("It is not a anagram");
            System.exit(0);

        }

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] x = str1.toCharArray();
        char[] y = str2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
      if(  Arrays.equals(x,y)==true){
          System.out.println("It is anagram");
      }else System.out.println("it is not an anagram");

    }
}
