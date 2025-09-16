package Sorting;

import java.util.Arrays;

public class MergeSortSecondMethod {
    static void mergeSort(int[] arr, int start, int end) {
        if(start < end){
            int mid = start +(end-start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while(i<=mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= end){
            temp[k++] = arr[j++];
        }
        int t = 0;
        for (int l = start; l <= end; l++) {
            arr[l] = temp[t++];
        }

    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 1, -2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
