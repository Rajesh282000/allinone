package LeetCode;

//Rotation Binary search

public class Leetcode_33 {
    public static void main(String[] args) {
        int[] arr = {6, 7,8, 0, 1, 2};
        int target = 1;
        System.out.println(search(arr, target));

    }
    public static int search(int[] nums, int target) {


            if (nums[0] == target)
                return 0;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[0] > nums[mid]) {
                    if (target < nums[0] && target > nums[mid])
                        start = mid + 1;
                    else
                        end = mid - 1;
                }
                else {
                    if (target < nums[mid] && target > nums[0] )
                        end = mid - 1;
                    else
                        start = mid + 1;
                }
            }
            return -1;
        }


    }










    /*  { int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }w
        if(pivot == target){
            return pivot;
        }
        if(target >= nums[0]){
            return  binarySearch(nums, target, 0, pivot -1);
        }
        return  binarySearch(nums, target, pivot + 1, nums.length - 1);

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

    public static int findPivot(int[] arr){
        int start = 0 ;
        int end = arr.length -1;
        while(start <= end ){
            int mid = start + (end - start)/2;
            // case :- 1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case :- 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                // case :- 3
                end = mid - 1;
            }else{
                // case :- 4
                start = mid + 1;
            }
        }
         return -1;
    }*/

