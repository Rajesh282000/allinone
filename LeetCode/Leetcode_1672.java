package LeetCode;
//Array

public class Leetcode_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }



}
