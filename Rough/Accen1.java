package Rough;

public class Accen1 {
    public static void main(String[] args) {
        int a[] = {7,9,5,2,8,7};
        int b[] = {2,8,9,7,4,2};
        int count = 0;
       count =  countSuperior(a,6,count);
        System.out.println(count);
        count = 0;
        count =  countSuperior(b,6,count);
        System.out.println(count);
    }
    public static int countSuperior (int [] arr, int n, int count) {

        int i = 0, j = 0;
        for (i = 0; i<n; i++) {
            for (j = i+1; j < n; j++)
                if (arr[i] <= arr[j])
                    break;
            if (j == n)
                count++;
        }
        return count;
    }
}
