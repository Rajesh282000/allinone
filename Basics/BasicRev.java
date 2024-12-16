package Basics;

public class BasicRev {
    public static void main(String[] args) {
       // arrRev(526);
       /* int ans = gcd(36, 60);
        System.out.println(ans);*/
        findPair(2, 14);
    }

    static void arrRev(int num ){
        String st = Integer.toString(num);
        char[] arr = st.toCharArray();
        for(int i= arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    // GCD

    static int gcd(int num, int num1){
        if(num1==0)
            return num;
        return gcd(num1, num%num1);
    }
    //gcd pair
    static void findPair(int x, int l){
        for(int i=1; i<=l-1 ; i++){
            for (int j =i+1; j<=l; j++){
                int result = gcd(i, j);
                if (result == x) {
                    System.out.println("(" + i + "," + (j) + ")");
                }
            }
        }
    }
}
