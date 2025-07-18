package CodeForce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class July172025 {

   public static void findNumber(int n) {
        //int[] arr = new int[4];
        Set<Integer> set = new HashSet<>();
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            set.add(rem);
            temp = temp / 10;

        }

        for (int y = 0; y <= 9; y++) {
            if (set.contains(y)) {
                System.out.println(y);
                break;
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int x = sc.nextInt();
            findNumber(x);

        }

        sc.close();
    }
}
