package com.Recursion;

public class ReverseNumber {
    static  int sum=0;
    static void reverse(int num){
        if(num == 0 ) {
            return;
        }
             else {
                 sum = sum *10 + num%10;
                 reverse(num/10);
        }
    }


    public static void main(String[] args) {

        reverse(1234);
        System.out.println(sum);

    }
}
