package com.LeetCode;
//Binary Search
// Mountain array

public class Leetcode_852 {
    public static void main(String[] args) {
        int[] arr = {0,1, 0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
   public static int peakIndexInMountainArray(int[] arr) {
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

}
