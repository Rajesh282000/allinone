package Codevita.Tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestRough {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(5);list.add(7);list.add(9);
        int search = 0;
        int index = Collections.binarySearch(list,search);
        int ub = -(index+1);
        int lb = ub-1;

        System.out.println("Index: "+index);
        System.out.println("lb : "+lb );
        System.out.println("ub : "+ub );

    }
}
