package DSA_MAY_2026.Array;

import java.util.ArrayList;

public class Merge_sorted_arrays {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0},nums2 = {2,5,6};
       int m = 3,n = 3, i=0, j=0;
        ArrayList<Integer> a= new ArrayList<>();

       while(i< m && j< n){
           if(nums1[i] < nums2[j]) {
               a.add(nums1[i]);
               i++;
           }
           else {
               a.add(nums2[j]);
               j++;
           }


       }

        for (int k = j; k < nums2.length; k++) {
            a.add(nums2[k]);
        }

        for (int k : a){
            System.out.print(k+",");
        }

    }
}
