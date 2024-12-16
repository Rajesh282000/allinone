package com.company;
import java.util.Scanner;

public class Scanner_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* sc is a object  */
        /* String st = sc.nextLine();    nextLine is read a string type.*/


        System.out.println("enter the first no. ");
        int a = sc.nextInt();

        System.out.println("enter the second no. ");
        int b = sc.nextInt();
        int c =a+b;
        System.out.println("Result =" + c);
    }
}

