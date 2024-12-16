package com.Javatpoint;

public class AutomorphicNumber {
    static boolean findAutomorphic(int n){
        int square = n*n;
        int  temp=n;
        while(temp>0){
            if (temp%10 != square%10)
                return false;
                temp =temp/10;
                square = square/10;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( findAutomorphic(5)?"Automorphic":"Not Automorphic");
    }
}
