package com.Rough;

import java.util.Scanner;

public class Digit1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
           int n =100;

        while(n>0)  {
     int   s=n%10;
            n=n/10;

            System.out.println(s);
        }

    }
}
