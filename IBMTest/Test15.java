package IBMTest;

public class Test15 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3 };
        secLarge(arr);
    }
    static void  secLarge(int[] n){
        int l= n[0];

        for (int i = 0; i < n.length ; i++) {
            if(n[i]> l)
                l=n[i];

        }

        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < n.length ; i++) {
            if(n[i]> sl && n[i] != l)
                sl=n[i];

        }
        System.out.println(sl);

    }
}
