package com.Recursion;

public class SkipGivenElement {
    static  void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(up.charAt(0)=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }

    }

    // If return type is String
    static  String  skip(String up){
        if(up.isEmpty()){

            return "";
        }

        char ch = up.charAt(0);

        if(up.charAt(0)=='a'){
          return   skip(up.substring(1));
        }else{
           return ch+skip(up.substring(1));
        }

    }

    //If we have to skip string
    static String  skipString( String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")) {
            return skipString(up.substring(5));
        }
            else
        {
                return up.charAt(0)+skipString(up.substring(1));
        }
    }


    public static void main(String[] args) {
        skip("", "bccaab");
      String ans =  skip("bccaa");
        System.out.println(ans);
        String ans1 =  skipString("bcapplecaa");
        System.out.println(ans1);

    }


}
