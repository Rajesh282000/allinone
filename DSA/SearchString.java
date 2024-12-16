package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String name ="Rajesh";
        char target= 'a';
       // System.out.println(search2(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));/* toCharArray method converts the given
                                                                        string into a sequence of char.*/
    }
    static boolean search(String str, char target)
    {
        if(str.length()==target){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){ // charAt method returns the character at the specified index in a string.
                return true;
            }

        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
        if(ch==target){
            return true;
        }

        }
        return false;
    }
}
