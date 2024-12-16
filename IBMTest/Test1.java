package IBMTest;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
       /* Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the n:-");
        int n =sc.nextInt();
        fibo(n);*/
        int ans =recFibo(5);
        System.out.println(ans);
    }
    static void  fibo(int n) {
      int fibo1 =0, fibo2=1;
      int fibo3=0;

      for (int i=2; i<n;i++){
          fibo3 = fibo1+fibo2;
          fibo1=fibo2;
          fibo2=fibo3;

      }
        System.out.println(fibo3);

    }

    //recursion
    static int recFibo(int n){
        if(n==1)
            return n;
        if (n == 0)
            return 0;
        return recFibo(n-1)+recFibo(n-2);
    }
}
