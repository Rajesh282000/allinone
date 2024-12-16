package com.BString;

import java.util.Arrays;

public class StringPlay {
    public static void main(String[] args) {
        sortstring("rajesh");
       String s = "raj burnwal true love";
        char ch[] = s.toCharArray();

        System.out.println(ch[1]-65);
        palli("ili");

        s= s.replaceAll("[' ']", "");
        System.out.println(s);

    }
    static  void sortstring(String str){
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));

    }

    static void palli(String s){
        String reverse ="";
        char[] ch= s.toCharArray();

        for (int i = ch.length-1; i >=0 ; i--) {
            reverse+=ch[i];

        }
        if(reverse.equals(s))
            System.out.println("pallidrome");
        else System.out.println("not palli");
    }

}
