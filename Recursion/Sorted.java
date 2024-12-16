package com.Recursion;
//Array is sorted or not
public class Sorted {
    static boolean sort(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]> arr[index+1]){
            return false;
        }
        return arr[index] < arr[index+1] && sort(arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 5};
      //  System.out.println(sort(arr,0));
        if(sort(arr,0)==true)
            System.out.println("It is sorted array");
        else
            System.out.println("It is not a sorted array");

    }
}
