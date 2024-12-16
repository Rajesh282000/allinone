package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Print2dArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[3][3];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        for (int i=0;i< arr.length;i++){  // 1st way
//            System.out.println(Arrays.toString(arr[i]));
       // }

        for (int[] a:arr) {         //  2nd way
            System.out.println(Arrays.toString(a));

        }
    }

    public static class OrderAgnosticBinarySearch {
        public static void main(String[] args) {
            int[] arr = {-7,-6,-5,1,3,5};
            int  target= -6;
            int ans = orderAgnostic(arr, target);

            System.out.println(ans);

        }
        public static int orderAgnostic(int[] arr,int target){
            int start = 0;
            int end = arr.length - 1;

            boolean isAsc = arr[start] < arr[end];

            while(start<=end){
                int mid = start + (end - start) / 2;

                if (arr[mid] == target){
                    return mid;
                }
                if(isAsc){
                    if(target < arr[mid]) {
                        end = mid - 1;
                    }else {
                        start = mid + 1;
                    }
                }else{
                    if(target > arr[mid]) {
                        end = mid - 1;
                    }else {
                        start = mid + 1;
                    }
                }
            }
            return-1;
        }
    }
}
