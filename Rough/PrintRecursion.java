package com.Rough;

public class PrintRecursion {
    public static void main(String[] args) {
        recPrint(5 );
        System.out.println("Print");
        recPrint1(5);


    }
    static void recPrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        recPrint(n-1);
      //  recPrint(n-1);
      //  System.out.println(n);

    }
    static void recPrint1(int n){
        if(n==0){
            return;
        }
        recPrint1(n-1);
        System.out.println(n);

    }

}
