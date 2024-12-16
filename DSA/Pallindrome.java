package com.DSA;

public class Pallindrome {

   static  void printPallindrome(int n){
       int temp = n,r,sum=0;
    while(n>0){
         r=n%10;
         sum=(sum*10)+r;
         n=n/10;
      }
    if(temp == sum) {
        System.out.println("Pallindrome");
    }
        else{
            System.out.println("Not pallindrome");
        }
    }

    public static void main(String[] args) {
        int n=454;
         printPallindrome(n);
    }
}
