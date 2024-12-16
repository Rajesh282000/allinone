package Rough;

//given word have all small letter except first and last position

import java.util.Locale;

public class pracString1 {
    public static void main(String[] args) {

        /*String str = "Rajesh Burnwal";
        String str1[]= str.split("\\s");
        System.out.println(str1[0]);*/


        System.out.println(returnFirstLast("rajesh burnwal"));
        System.out.println(replaceWord("rajesh modi","modi","burnwal"));

    }

    static String returnFirstLast(String str){
        String newStr ="";
        String str1[]= str.split("\\s");

        for(String string : str1){
            int length = string.length();
            String fl= string.substring(0,1);
            String reset= string.substring(1,length-1);
            String ll = Character.toString(string.charAt(length-1));

            newStr=newStr+" "+fl.toUpperCase()+reset+ll.toUpperCase();
        }




        return newStr;
    }


    static String replaceWord(String str, String r, String w){
        String replaceString = str.replaceAll(r,w);
        return replaceString;
    }
}
