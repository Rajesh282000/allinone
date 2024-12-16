package IBMTest;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {

        duplicates("Hello World!");
    }

    static void duplicates(String input){
        int count =0 ;
         Map<Character, Integer> map= new HashMap<>();
         for(char c: input.toCharArray()){
             if(!map.containsKey(c)) {
                 map.put(c, 1);
             }
                 else{
                     map.put(c, map.get(c)+1);
             }
         }
        for (int i: map.values()       ) {
            if(i>1){
                count+=i -1;
            }


        }
        System.out.println(count);
    }
}
