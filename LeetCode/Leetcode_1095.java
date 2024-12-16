package com.LeetCode;
//Mountain Search - Hard lv

public class Leetcode_1095 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,5,3,1};
        int target = 4;
        System.out.println(search(arr, target));

    }
    public static int search(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second try
        return orderAgnostic(arr, target, peak+1, arr.length - 1);
    }

    public  static  int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]  ){
                // if you are in decending part of array
                // this may be the ans, but look at left
                end = mid;
            }else {
                // if you are in ascending part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest no.
        //start and end are always trying to find max element

        return start; // or return end
    }
    public static int orderAgnostic(int[] arr,int target, int start, int end){


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


