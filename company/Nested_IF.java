package com.company;
import java.util.Scanner;

public class Nested_IF {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if (marks >= 0 && marks <= 25)
        {
            System.out.println("Grade is D");
        }
        else
        {
            if(marks >= 25 && marks <= 50)
            {
                System.out.println("Grade is C");
            }
            else
            {
                if(marks >= 50 && marks <= 75)
                {
                    System.out.println("Grade is B");
                }
                else
                {
                 if(marks >= 75 && marks <= 100)
                 {
                     System.out.println("Grade is A");
                 }
                 else
                 {
                     System.out.println("Put the valid no.");
                 }
                }
            }
        }




        }
    }
