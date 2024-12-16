package GFGCode;

// Find the Rotation Count in Rotated Sorted Array

public class RotationCountArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr1 = {1,2,3,4};
        System.out.println(countRotations(arr));
       // System.out.println(findPivotWithDuplicates(arr));

    }

    public static int countRotations(int[] arr ){
    int pivot = findPivot(arr);
    return pivot + 1;

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
        return 0;
    }
/*public static int findPivotWithDuplicates(int[] arr){
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

    // if elements at middle, start, end are equal then just skip the duplicate

        if(arr[mid] == arr[start] && arr[mid] == arr[end]){

         // skip the duplicates
        // NOTE: what if these elements at start and end were the pivot ??

       // check if start is pivot
       if(arr[start] > arr[start + 1]){
           return  start;
       }
       start ++;

            // check if end is pivot
            if(arr[end] > arr[ + 1]){
             return end -1;

            }
            end --;
        }
        // left side is sorted,so pivot should be in right
        else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
            start = mid + 1;
        }else {
            end = mid -1;
        }
      }
    return 0;
    }*/
}
