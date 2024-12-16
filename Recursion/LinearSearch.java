package com.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    static boolean linearsearch(int[] arr, int index, int target ) {
        if(index == arr.length){
            return false;
        }
        if (arr[index] == target)
            return true;
        else
            return linearsearch(arr,index+1,target);
    }
    // find index
    static int findIndex(int[] arr, int index, int target ) {
        if(index == arr.length){
            return -1; //target element not found
        }
        if (arr[index] == target)
            return index;
        else
            return findIndex(arr,index+1,target);
    }

    //Find all index
   static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int index, int target ) {
        if (index == arr.length) {
            return; //target element not found
        }
        if (arr[index] == target){
            list.add(index);

        }

            findAllIndex(arr, index + 1, target);
    }



    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 7, 8, 5, 6};
        System.out.println("Finding target element is present or not :- "+linearsearch(arr,0,8));
        System.out.println("Finding target element index no. :- "+findIndex(arr,0,8) );

        // Find all index of given target no. even there number is same

        int[] arr1 ={1, 2, 3, 7, 8, 8, 6, 8};
        findAllIndex(arr1,0,8);
        System.out.println(list);


    }
}
