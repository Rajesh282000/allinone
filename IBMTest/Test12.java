package IBMTest;

public class Test12 {
    public static void main(String[] args) {
        int ans = replaceOne(500);
        System.out.println(ans);
        int ans1 = replaceOne(25600);
        System.out.println(ans1);
    }
    static int replaceOne2(int i){
        String s = String.valueOf(i);
        s=s.replace("0","1");
        return Integer.parseInt(s);
    }
    static int replaceOne(int n){
        int sum=0;
        int p=1;
        while(n>0) {
        int rem=n%10;
        if(rem==0){

            rem=1;
        }
        sum+=rem*p;
        p*=10;
        n/=10;

        }
        return sum;

    }
}
