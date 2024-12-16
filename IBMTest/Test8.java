package IBMTest;

//import java.util.HashMap;
import java.util.*;

public class Test8 {
    public static void main(String[] args) {
       countDuplicateChar("chaarrccvvnn");

    }

// Count Duplicate Character
    static void countDuplicateChar(String s){
        char[] ch= s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length() ; i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(ch[i], 1);
            }else{
                map.put(ch[i], map.get(ch[i])+1);
            }

        }

        int count =0;

        for (Map.Entry<Character,Integer> data:  map.entrySet()  ) {
            if(data.getValue()>1)
                count++;

        }
        System.out.println(count);

    }
}
