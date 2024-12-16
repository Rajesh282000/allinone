package com.Rough;

public class Divisible6 {
    public static void main(String[] args) {

        int count=0,num = 100;
       while (num <1000) {
           if (num % 6 == 0) {
               count++;
           }
           num++;
       }
        System.out.println(count);
    }
}
