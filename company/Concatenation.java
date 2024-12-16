package com.company;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String Firstname =   sc.nextLine();

        System.out.println("Enter your last name");
        String Lastname = sc.nextLine();

        System.out.println("Full name :- " + "  " + Firstname + " " + Lastname);
    }
}
