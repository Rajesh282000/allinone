package com.BString;

public class Strring2 {
    public static void main(String[] args) {
        stringplay("a2b3c3");
    }
    static  void  stringplay(String str){
        char[] ch = str.toCharArray();
        for(int i=0 ; i<ch.length; i++){
            if(Character.isLetter(ch[i])){
                int a = (int)ch[i+1]-'0';
                while(a-->0){
                    System.out.print(ch[i]);
                }
            }
        }
    }
}
