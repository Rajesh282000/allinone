package com.BStringOrHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapString2 {
    public static void main(String[] args) {
        maximumOccurenceCharacter("barnwal");

    }

    static void maximumOccurenceCharacter(String str){
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        int i=0;
        while (i!= ch.length) {
            if (map.containsKey(ch[i]) == false) {
                map.put(ch[i], 1);
            } else {
                int oldval = map.get(ch[i]);
                int newval = oldval + 1;
                map.put(ch[i], newval);

            }
            i++;
        }



      //  Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
            char maxkey= ' ';
            int maxvalue = 0;


            for (Map.Entry<Character,Integer> data : map.entrySet()){
            if (data.getValue() > maxvalue){
                maxvalue=data.getValue();
            maxkey=data.getKey();

            }


        }
        System.out.println(maxkey+":"+maxvalue);


    }
}
