package com.DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
/*
        list.add(11);
        list.add(12);
        list.add(21);
        list.add(13);
        list.add(41);
        list.add(23);
        list.add(15);
        System.out.println(list.contains(41)); // here i check that there is 41 in my array list or not.
        list.set(0,18); // here i change my 0 index value.
        list.remove(2);// here i remove 2 index value.
        System.out.println(list);
*/
        for (int i = 0; i<5;i++)
        {
            list.add(sc.nextInt());
        }
        for (int i = 0; i<5;i++)
        {
            System.out.println(list.get(i));
        }

    }
}
