package com.GFGCode;

import java.util.Arrays;

public class ReverseArrayInGroup {

    static int[] loopArray(int[] arr,int k){
        int i;
        int rem =arr.length % k;//to figure out if any elements will be left at the end
        for ( i = 0; i < arr.length; i=i+k) {
            arr=reverseArray(arr,i,i+k-1);
        }
        if(rem!=0){
            reverseArray(arr,arr.length-rem,arr.length-1);
        }
        return arr;
    }
    static int[] reverseArray(int[] arr, int start, int end){
        int temp,i,j;
        for(i=start, j=end; i<j && j<arr.length; i++, j--){
           temp =arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int k=3;
        //loopArray(arr,k);
        System.out.println(Arrays.toString(loopArray(arr,k)));
    }
}
