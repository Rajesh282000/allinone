package Jspider;

public class Prime {
    static void findPrime(int n){
        int count=0;

        for (int i = 1; i <=n ; i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count ==2)
            System.out.println("Prime no");
        else
            System.out.println("Not prime");
    }
    public static void main(String[] args) {
        findPrime(7);
    }
}
