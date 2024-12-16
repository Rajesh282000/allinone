package com.Javatpoint;

public class Array4 {
    public static void main(String[] args) {
        int arr1[]=new int[]{1, 2, 3, 4, 5};

        System.out.println("Print arr1 element:-");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        System.out.println("Reverse array element:-");
        for (int i = arr1.length-1; i >=0 ; i--) {
            System.out.print(arr1[i]+"\t");
        }
    }
}
