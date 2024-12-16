package com.Rough;

import java.util.Scanner;

public class Switch_Varible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name ="Rajesh Burnwal";
        String gender = "Male";
        System.out.println("Enter 1, 2 and 3 : Daal Bc");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Name : " + name);
                break;
            case 2:
                System.out.println("Gender : " + gender);
                break;
            default:
                System.out.println("Exit");
                break;


        }
    }
}
