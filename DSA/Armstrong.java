package com.DSA;
import java.lang.Math;
public class Armstrong {
    static Boolean printArmstrong(int n){
        int temp=n,r=0,sum=0,digit=0;
        while(temp>0){
            n=n/10;
            digit++;
        }
         temp = n;
        while(n>0){
           r=n%10;
           n=n/10;
           sum+=(Math.pow(r,digit));
        }
//        System.out.println(sum);
        if(temp==sum)
            return true;
        else
           return false;

    }

    public static void main(String[] args) {
      if(printArmstrong(2))
          System.out.println("Armstrong");
          else
          System.out.println("Not Armstrong");
    }
}
