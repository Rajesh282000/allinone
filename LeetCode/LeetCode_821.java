package LeetCode;

import java.util.Arrays;

public class LeetCode_821 {

    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';
        shortestToChar(s,c);
    }

    static void shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        int track = n;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c){
                track = 0;
                arr[i] = track;
            }else{
                arr[i] = ++track;
            }
        }

        track = n;

        for(int i = n - 1; i >= 0; i--){
            if(s.charAt(i) == c){
                track = 0;
                arr[i] = track;
            }else{
                arr[i] = Math.min(arr[i],++track);
            }
        }

        for(int num : arr){
            System.out.print(""+num+" ");
        }
    }
}
