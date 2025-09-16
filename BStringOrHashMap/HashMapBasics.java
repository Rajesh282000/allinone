package BStringOrHashMap;

import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();



//        // Inserting pairs in above Map
//        // using put() method
//        hm.put("a", 100);
//        hm.put("b", 200);
//        hm.put("c", 300);
//        hm.put("d", 400);
//
//        // Traversing through Map using for-each loop
//        //using entry set
//        for (Map.Entry<String, Integer> me : hm.entrySet()) {
//
//            // Printing keys
//            System.out.print(me.getKey() + ":");
//            System.out.println(me.getValue());
//
//        }




                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 3; j++) {
                        if (i == j) continue;
                        System.out.print(i + "" + j + " ");
                    }
                }



    }

}
