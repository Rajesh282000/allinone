package Basics;

public class Basic1 {

    public static void main(String[] args) {
       /* System.out.println( fibo(6));
        fibo1(6);
        permutation(5,9);
        System.out.println( replace(102340));*/
        sumOfTwoPrime(14);


    }


    //Fibo
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static void fibo1(int a){
        int[] arr = new int[a+1];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<=a;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println("\n"+ arr[6]);
    }



    //permutation
    static  void permutation(int people, int seats){
        int pr = fact(people)/fact(people-seats);
        System.out.println(pr);
    }


    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


//replace 0's to 1
    static int replace(int num){
         String str = Integer.toString(num);

          str= str.replaceAll("[0]","1");

            return Integer.parseInt(str);

    }



    //Java program to check whether a number can be expressed as a sum of two prime numbers
      static void sumOfTwoPrime(int n){

        int x=0;
        for (int i=2; i<=n/2; i++){
            if(isPrime(i)==true && isPrime(n-i)==true){
                System.out.println(n+" = "+i+" + "+(n-i));
                x=1;
            }
        }
        if(x==0)
            System.out.println("Can't be expressed as a sum of two prime numbers");
            else{
                System.out.println(" It can be expressed as a sum of two prime numbers ");
            }

    }

    static boolean isPrime(int n){

        if(n<2)
            return false;

        for (int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;

        }
        return true;
    }
    


}
