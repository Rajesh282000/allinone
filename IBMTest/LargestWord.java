package com.IBMTest;

public class LargestWord {
    public static void main(String[] args) {
        String st = "My name a is rajesh burnwal";
        /*String[] str = st.split("\\s+");
        for (String word : str)
            System.out.print(word+" ");*/


        largestWord(st);
smallestWord(st);
    }

    static int findSize(String str){
        return str.length();
    }

    static void largestWord(String s){
       String lw= " ";
        String[] str = s.split("\\s+");
        for (String str1 : str){

           if(str1.length() >  lw.length() ){
               lw = str1;

           }

        }
        System.out.println(lw);

    }
    static void smallestWord(String s){
        String sw= "dkfhskdhf";
        String[] str = s.split("\\s+");
        for (String str1 : str){

            if(str1.length() < sw.length() ){
                sw = str1;

            }

        }
        System.out.println(sw);

    }
}
