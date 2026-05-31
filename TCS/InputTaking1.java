package TCS;

import java.util.*;
public class InputTaking1 {

    public static void main(String[] args) {
//
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        int arr[] = new int [n];
//        int sum =0;
//        for(int i =0; i< n; i++){
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//        System.out.println(sum);

        //     1
        //      22
        //     333
        //   4444
        int count = 1;
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j > i; j--) {
                if (count <=i) {

                    System.out.print(" ");
                } else {
                    System.out.print(count);
                }

            }
            count++;
        }
    }
}