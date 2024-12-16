package com.BString;

public class BasicsString1 {
    public static void main(String[] args) {
        pangram("abcdefghijklmnopqrstuvwxyz");
        pangram("The quick brown fox jumps over a lazy dog");

    }

    //To check whether string is pangram or not
    static void pangram(String str1){
        str1=str1.toUpperCase();
        str1=str1.replace(" ", "");
        char[] ch= str1.toCharArray();
        int size= ch.length;
        char[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i=0;
        while(i!=size){
            int index = ch[i]-65;
            a[index]=1;
            ++i;
        }

        i=0;
        while(i!=26){
            if(a[i]==1){
                ++i;
            }else {
                System.out.println("It is not a panagram");
                System.exit(0);
            }
        }
        System.out.println("it is panagram");
    }
}
