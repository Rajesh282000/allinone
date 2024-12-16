package Rough;

import java.util.Arrays;
import java.util.HashMap;

public class FineNumber {
    public static void main(String[] args) {
        int result = findNumber(new int[] {1,2,3,4,5}, new int[]{10,12,34,2,4,89}, 5, 6);
        System.out.println("The Max Difference : "+result);
        System.out.println();
        int[] A = rankArr(new int[] {20,15,26,2,98,6});
        for (int i : A)
            System.out.print(i+ " ");
    }
    static int[] rankArr (int [] arr) {
        int[] A = Arrays.copyOf(arr,arr.length);
        Arrays.sort(A);
        HashMap < Integer, Integer > rank = new HashMap<>();
        for (int x : A) {
            //rank.putIfAbsent(x, rank.size() + 1);
            if (rank.containsKey(x))
               rank.putIfAbsent(x,rank.size()+1);
            else
                rank.put(x, 1);
        }
//
//        }
        for (int i = 0; i < A.length; i++) {
            A[i] = rank.get(arr[i]);
        }
        return A;
    }
    static int findNumber (int[] a, int[] b, int m, int n) {
        int diff= 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int max1 =   Math.max (a[0], b[n-1]) - Math.min (a[0], b[n-1]);
        int max2 =   Math.max (a[m-1], b[0]) - Math.min (a[m-1], b[0]);
        //int max2 =  (a[m-1]- b[n-1]);
        diff = Math.max(max1, max2);
        return diff;
    }

}
