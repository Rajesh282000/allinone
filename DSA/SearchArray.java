package com.DSA;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-7, 3, 5, 8, 9, 10, 22};
        System.out.println("Enter your target no.:");
        int target=sc.nextInt();
        int ans=  linearSearch(arr,target);
        System.out.println("Index no. of the " + target+ " is "+ ans);


    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0 ) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;
    }
}
