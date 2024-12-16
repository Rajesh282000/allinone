package IBMTest;

import java.util.HashSet;
import java.util.Set;

public class test13 {
    public static void main(String[] args) {
        primeFact(90);
    }
    static void primeFact(int num)
    {
        Set<Integer> s = new HashSet<>();
        for(int i = 2;i<=num; i++){
            if(isprime(i)&& num%i==0){
                s.add(i);
            }
        }
        for (int i :
             s) {
            System.out.println(i);

        }
    }

    static boolean isprime(int n){
        if(n<2){
            return false;

        }

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
