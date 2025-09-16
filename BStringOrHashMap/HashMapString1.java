package BStringOrHashMap;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapString1 {
    public static void main(String[] args) {
        System.out.println("Nonreapted element");
        Nonrepeated("striish");
        System.out.println("First nonreapted element");
        firstNonrepeated("sship");
    }
    static void Nonrepeated(String str){
        char ch[] = str.toCharArray();
        Map<Character,Integer> map= new LinkedHashMap<>();
        int i=0;
        while (i!= ch.length){
            if(map.containsKey(ch[i])==false){
                map.put(ch[i],1);
            }else {
                int oldval=map.get(ch[i]);
                int newval= oldval+1;
                map.put(ch[i],newval);
            }

            i++;
        }
        Set<Map.Entry<Character, Integer>> hmap= map.entrySet();
        for (Map.Entry<Character,Integer> data: hmap){
            if(data.getValue()==1){
                System.out.println(data.getKey());
            }

        }
    }


    static void firstNonrepeated(String str){
        char ch[] = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        int i=0;
        while(i!=ch.length){
            if(map.containsKey(ch[i])==false){
                map.put(ch[i],1);
            }else{
                int oldval=map.get(ch[i]);
                int newval = oldval+1;
                map.put(ch[i], newval);

            }
            i++;
        }


        Set<Map.Entry<Character,Integer>> lmap = map.entrySet();
        for (Map.Entry<Character,Integer> data : lmap){
            if(data.getValue()==1){
                System.out.println(data.getKey());
                System.exit(0);
            }
        }

    }

}
