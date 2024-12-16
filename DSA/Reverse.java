package com.DSA;

public class Reverse {
    static void printReverse(int n){
        int r,sum=0;
        while(n>0){
          r=n%10;
          sum=sum*10+r;
          n=n/10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
       printReverse(2000);
    }
}
