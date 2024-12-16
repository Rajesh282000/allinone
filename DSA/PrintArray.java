package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

//Here i print the array in different way
public class PrintArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array element");
        for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();
        }
          // System.out.println(Arrays.toString(arr));//First way

        //2nd way
        for(int num: arr){
            System.out.print(num+" ");// here num represents the array elements
        }

        }

}
