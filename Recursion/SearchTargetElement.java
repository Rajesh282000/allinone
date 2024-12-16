package com.Recursion;

public class SearchTargetElement {
    static int search(int[] arr,int target, int s,int e){
        int m=s+(e-s/2);
        if(target == arr[m]){
            return m;
        }
        if(arr[s]<=arr[e]){
            if(target>=arr[s]&& target<=arr[m]){
                return search(arr,target,s,m-1);
            }else{
                return search(arr,target,m+1,e);
            }
        }
        else{
            if(target>=arr[m]&& target<=arr[e])
                return search(arr,target,m-1,e);
        }
        return search(arr,target,s,m-1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3,};
        int ans = search(arr,4,0,arr.length-1);
        System.out.println(ans);
    }
}