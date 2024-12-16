package com.Rough;

import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
    /*    int num=1;
     int    count = 0;
     while(num<=240 ){
            if(num%2!=0){
            count+=num;

            }
            num++; //25,75
        }
        System.out.println(count);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;


        for(int i=1; i<=n;i++) {
            if (i % 2 != 0) {
                count++;
                if (count % 2 != 0)
                    sum +=i;


            }

        }
        System.out.println(sum);
    }
}
