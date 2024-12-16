package com.BString;

public class FirstAndLast {
    public static void main(String[] args) {
        String str = "rajesh burnwal";
        String n = "";
        String[] words = str.split(" ");
        for (String s : words) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (i == 0 || i == ch.length-1) {
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }
            n+=String.valueOf(ch)+" ";
        }
        System.out.print(" "+n);
    }
}
