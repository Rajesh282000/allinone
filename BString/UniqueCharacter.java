package com.BString;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {
    static void uniqueChar(String s){
        char[] arr = s.toCharArray();
        Map<Character,Integer> hMap=new LinkedHashMap();
        for (int i =0; i<arr.length ; i++){
            if(!hMap.containsKey(arr[i])){
                hMap.put(arr[i], 1);

            }else {
                hMap.put(arr[i], hMap.get(arr[i])+1);
            }
        }

        for(Map.Entry<Character,Integer> map : hMap.entrySet()){
            System.out.println(map.getKey());
           /* if(map.getValue()>1)
                System.out.println(map.getKey());*/
        }

    }
    public static void main(String[] args) {
        uniqueChar("SENTIENTGEEK");
    }
}
