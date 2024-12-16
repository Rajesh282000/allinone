package com.Recursion;
//Leetcode question
public class Leetcode {
    static int count =0;
    static int CountStep(int num){
        count++;
        if(num==0){
            return count-1 ;
        }
        if (num%2==0) {
            return CountStep(num/2);

        }
        else {
            return CountStep(num - 1);
        }

    }

    public static void main(String[] args) {
        int ans = CountStep(8);
        System.out.println(ans);
    }

}
