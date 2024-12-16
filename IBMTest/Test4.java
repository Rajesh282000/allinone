package IBMTest;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+" "+b);
        hcf(a,b);*/


        int ans = DtoB(33);
        System.out.println(ans);

    }

    //HCF without rec
    static void hcf(int a, int b){
        for(int i =2;i<=a|| i<=b; i++ ){
            if(a%i==0 && b%i==0 ){
                System.out.println(i);
            }
        }
    }

    //Decimal to binary
    static int DtoB(int num) {
        int binary = 0;
        int place = 1;

        while (num > 0) {
            int remainder = num % 2;
            binary += remainder * place;
            place *= 10;
            num /= 2;
        }

        return binary;
    }

}
