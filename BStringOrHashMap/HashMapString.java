package com.BString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapString {
    public static void main(String[] args) {

        uniqueElement("rajesh");
    }

    static void uniqueElement(String str){
        str= str.toUpperCase();
        char[] ch = str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        while (i!=ch.length){
            if(map.containsKey(ch[i])==false){
                map.put(ch[i],1);
            }else{
                int oldval= map.get(ch[i]);
                int newval = oldval+1;
                map.put(ch[i],newval);
            }
            i++;
        }

        Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
        for (Map.Entry<Character,Integer> data :hmap){
            if(data.getValue()>1){
                System.out.println("Doesn't contain all unique char");
                System.exit(0);
            }
        }
        System.out.println("Contains all Unique char");
    }
}