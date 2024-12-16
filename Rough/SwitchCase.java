package com.Rough;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Male or Female");
        String choice = Sc.nextLine();

        switch (choice){
            case "Male":
                System.out.println("Hello Mr.....");
                break;
            case "Female":
                System.out.println("Hello Ms......");
                break;
            default:
                System.out.println("backchodi maath mar thik se daal or\n" +"haan kahi or maath daal dena ");
                break;
        }

    }
}
