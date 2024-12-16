package company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = r.nextLine();
        if (true == isPalindrome(str))
        {
            System.out.println("    Yes , It is a Palindrome.");
        }
        else
        {
            System.out.println("    No, It is not a Palindrome.");
        }

        System.out.println("    The Converted String in UpperCase : "+lowerToUpper(str));

    }

   public static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        str =str.toLowerCase();
        for(int i = 0; i<=str.length()/2;i++){
           char start= str.charAt(i);
           char end = str.charAt(str.length()-1-i);
           if(start != end){
               return false;
           }
        }
        return true;
    }
   static String lowerToUpper(String str){
      return  str =str.toUpperCase();

    }
}
