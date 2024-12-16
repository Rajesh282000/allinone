package Rough;

import java.util.ArrayList;

import java.util.Collections;

//all zero at last position
public class ArrayPrac {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(4);
        arr.add(0);
        arr.add(1);
        arr.add(6);
        arr.add(0);
       ArrayList<Integer> a1= zeroAtLast(arr);

        System.out.println(a1);
    }

    static ArrayList<Integer> zeroAtLast(ArrayList<Integer> a){
        int i =0;
        int j=a.size()-1;
        while (i <= j) {
            if (a.get(i) == 0) {
                Collections.swap(a, i, j);
                j--;
            } else {
                i++;
            }

        }
        return a;
    }


}
