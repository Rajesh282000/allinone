package Javatpoint;

public class PetersonNumber {
    static int findFact(int n){
        int i,fact =1;
        for ( i = 1; i <= n; i++) {
            fact =fact*i;
        }
        return fact;
    }
    static void printPeterson(int n){
        int num=n,sum=0;
        while(n>0){
            int digit = n%10;
            sum+=findFact(digit);
            n=n/10;
        }
        if (sum==num)
            System.out.println("Peterson");
        else
            System.out.println("Not Peterson");

    }
    public static void main(String[] args) {
        printPeterson(145);
    }

}
