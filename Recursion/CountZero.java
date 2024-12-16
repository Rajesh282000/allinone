package com.Recursion;

public class CountZero {
    static int count(int num){
        return helper(num,0);
    }
    static int helper(int n, int c){
        if(n == 0)
            return c;

            int rem = n%10;
            if(rem == 0){
                return helper(n/10,c+1);
            }
        return helper(n/10,c);
    }

    public static void main(String[] args) {
        int ans =count(324000);
        System.out.println(ans);
    }
}
