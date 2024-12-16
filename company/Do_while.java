package com.company;

import java.util.Scanner;

public class Do_while {

    public static int getData(String name)
    {
        System.out.println("Enter the data for " + name);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    public static void main(String[] args) {
        int op1=0,op2=0;
        int choice;

        do
            {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Exit from application");
            Scanner sc = new Scanner(System.in);
            choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    op1=getData("Operand1");
                    op2=getData("Operand2");
                    System.out.println("Addition "+(op1+op2));
                    break;
                case 2:
                    op1=getData("Operand1");
                    op2=getData("Operand2");
                    System.out.println("Subtraction "+(op1-op2));
                    break;
                case 3:
                    op1=getData("Operand1");
                    op2=getData("Operand2");
                    System.out.println("Multiplication "+(op1*op2));
                    break;
                case 4:
                    op1=getData("Operand1");
                    op2=getData("Operand2");
                    System.out.println("Division "+(op1/op2));
                    break;
                case 5:
                    op1=getData("Operand1");
                    op2=getData("Operand2");
                    System.out.println("Modulus "+(op1%op2));
                    break;
                case 6:

                    System.out.println("You are about to exit");
                    break;
                default:
                    System.out.println("Please enter the valid symbol");

            }
            }while(choice!=6);
        System.out.println("Thank for using my application");
    }
}
