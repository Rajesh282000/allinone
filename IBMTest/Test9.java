package IBMTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) {

        int[] a = {2,1,1,2,4,5,7,7,9,9,0,0};
        System.out.println(Arrays.toString(removeDuplicate(a)));
    }

    //Remove duplicate from an arrray
    static int[] removeDuplicate(int[] arr){
        Set<Integer> s = new HashSet<>();

        for (int value: arr   ) {
            s.add(value);
        }

        int[] a = new int[s.size()];
        int j=0;
        for (int val: s ) {
            a[j]=val;
            j++;
        }
        return a;
    }

}
