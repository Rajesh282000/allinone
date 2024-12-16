package Jspider;

public class RecursionFactorial {
    static int recFact(int n){
        if(n==0)

            return 1;
        else
        return (n*(recFact(n-1)));
    }

    public static void main(String[] args) {
        System.out.println( recFact(5));
    }
}
