package com.company;

import java.util.Scanner;

    public class SCAN{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the first subject:");
            int s1 = sc.nextInt();
            System.out.println("enter the second subject");
            int s2 = sc.nextInt();
            System.out.println("enter the third subject");
            int s3 = sc.nextInt();
            System.out.println("enter the fourth subject");
            int s4 = sc.nextInt();

            float percentage = ((s1+s2+s3+s4)/400.0f)*100;

            System.out.println("percentage : ");
            System.out.println(percentage);

        }
    } //Scanner
