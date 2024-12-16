package com.Rough;

import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            if(num % 11 ==0){
                System.out.println("Number is even and also multiple of 11");
            }
            System.out.println("Number is even but it not  multiple of 11");

        }
        else{
            System.out.println("Number is not even and also not multiple of 11");

        }
    }
}
