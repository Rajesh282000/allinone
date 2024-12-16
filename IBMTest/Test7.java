package IBMTest;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
    public static void main(String[] args) {
        System.out.println( nonRepeating("raja esh"));
    }

    static String nonRepeating(String s){
        char[] ch=s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0; i< ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i], 1);
            }else{
                map.put(ch[i], map.get(ch[i])+1);
            }
        }

        String result="";

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i))==1){
                result+=s.charAt(i);

            }else if(Character.isWhitespace(s.charAt(i))){
                result+=" ";
            }

        }
        return result;
    }

}
