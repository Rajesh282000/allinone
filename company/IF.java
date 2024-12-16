package com.company;
import java.util.Scanner;

public class IF
{


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>0 && age<18)
        {
            System.out.println("He/She is eligible for Under 18 vaccine");
        }
        else
            {
                System.out.println("He/She is eligible for Above 18 vaccine");
        }
    }
}
