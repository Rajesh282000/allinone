package com.GFGCode;

public class BinarySearch1 {


// GFG question came in Amazon coding round.


        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 19, 20, 40, 45, 50, 56,61};
            int target = 20;
            System.out.println(ans(arr, target));

        }
        public static int ans(int[] arr, int target){
            int start = 0;
            int end = 1;
            while (target > arr[end]){
                int newStart = end + 1 ;
                end = end + (end - start + 1) * 2;
                start = newStart;
            }
            return binarySearch(arr, target, start, end);
        }
        public  static  int binarySearch(int[] arr,int  target,int start,int end){
            while(start <= end){
                int mid = start + (end - start)/2;
                if(target < arr[mid]){
                    end = mid - 1;
                }else  if(target > arr[mid]){
                    start = mid + 1;
                }else {
                    return mid;
                }
            }
            return -1;
        }
    }


