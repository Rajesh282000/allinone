package Rough;

import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter no. of digits: ");
        int size= r.nextInt();
        System.out.println("Enter no.: ");
        int num = r.nextInt();
        int arr[] = new int [size];
        digit(num,arr);
    }

    static void digit (int n,int arr[]) {

        while (n>0) {
            for(int i = 0;i<arr.length;i++){
                arr[i] = n % 10;
                n = n/10;
            }
        }
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
