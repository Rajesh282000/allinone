package com.Recursion;

public class Sumofdigit {
   // static int sum =0;
    static int sumofdigit(int num){
        if (num == 0) //Base Condition
            return 0;
        else

            return (num%10) + sumofdigit(num/10);

    }

    public static void main(String[] args) {
        int ans = sumofdigit(1234);
        System.out.println(ans);
    }
}
