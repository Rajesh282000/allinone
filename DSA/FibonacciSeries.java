package Jspider;

public class FibonacciSeries {
//static         int n1 = 0, n2 = 1, n3=0;// for recursion
    static void printFibo(int n){
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1+"\n"+n2 );
        for(int i=2; i<n;i++){
            n3 = n2+n1;

            System.out.println(n3 );
            n1=n2;
            n2=n3;
        }
       /* System.out.println(n3);*/
    }

    static void recFibo(int n ) {

        int n1 = 0, n2 = 1, n3=0;

        if(n>0){
            n3 = n2+n1;


            n1=n2;
            n2=n3;
            System.out.println(n3 );
            recFibo(n-1);
        }

    }

    public static void main(String[] args) {
        int n=5;
       // printFibo(n);


        recFibo(n-2);
    }

}

