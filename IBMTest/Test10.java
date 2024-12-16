package IBMTest;

import java.util.Arrays;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) {
        int [] arr= {7,2,3,6
                ,9,1,4,8};
     /* int ans=  missingNumber(arr);

        System.out.println(ans);*/
        int ans2=  mis(arr);

        System.out.println(ans2);
    }
   /* static int  missingNumber(int arr[]){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i : arr){
            min= Math.min(min, i );
            max= Math.max(max, i );

        }
        Arrays.sort(arr);

        int j =0;
        for (int i = min; i<=max;i++){
            if(arr[j] != i)
                return i;

                j++;
        }
       return max+1;

    }*/
    static int mis (int[] arr) {
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for (int i : arr) {
            mini = Math.min(mini, i);
        }
        for (int i : arr){
            if (mini != i)
                return mini;
            mini++;
        }
        return mini+1;
    }
}
