package IBMTest;

public class Test14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3 };
        System.out.println( secSmallest(arr));
    }
    static int secSmallest(int[] n){
        int s= n[0];
        for(int i=0; i< n.length;i++){
            if(n[i]<s){
                s= n[i];
            }
        }
        int ss =Integer.MAX_VALUE;
        for (int i = 0; i < n.length ; i++) {
            if(n[i]<ss && n[i]!=s){
                ss=n[i];
            }

        }
        return ss;
    }
}
