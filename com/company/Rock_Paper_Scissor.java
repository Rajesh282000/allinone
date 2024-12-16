package com.com.company;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {

    public static void main(String[] args) {
        int game;
        int game1;
        do {

            System.out.println("Choose any one 0. Rock 1. Paper 2. Scissor 3.Exit");
            Scanner sc = new Scanner(System.in);
            game = sc.nextInt();
            if(game>3){
                System.out.print("Thank you for playing this game");
                break;
            }
            switch (game) {
                case 0: System.out.println("you choose :- Rock");
                case 1 : System.out.println("you choose :- Paper");
                case 2 :System.out.println("you choose :- Scissor");
                default : {
                    System.out.print("Thank you for playing this game");
                    break;
                }
            }

            Random rn = new Random();
            System.out.println("Computer choose");
            game1 = rn.nextInt(2);
            System.out.println(game1);
            switch (game1) {
                case 0 :System.out.println("Computer choose :- Rock\n");
                case 1 : System.out.println("Computer choose :- Paper\n");
                case 2 : System.out.println("Computer choose :- Scissor\n");
                default : {
                    System.out.print("Thank you for playing this game");
                    break;
                }
            }
            if (game == game1)
            {
                System.out.println("Draw");
            }
           else if(game==0&&game1==1||game==1&&game1==2||game==2&&game1==0)
           {
               System.out.println("Computer win ");
            }
           else if(game==0&&game1==2||game==1&&game1==0||game==2&&game1==1)
           {
               System.out.println("User win");
            }

        }while(game!=3||game1!=2);

    }

}