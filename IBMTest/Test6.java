package IBMTest;

public class Test6 {
    public static void main(String[] args) {
Armstrong(153);
    }
    static int digitLen(int num){
        int digit =0 ;
        int temp = num;

        while(temp!=0){
        int rem = temp%10;
        digit++;
        temp/=10;
        }

        return digit;

    }

    static void Armstrong(int num){
        int digit=digitLen(num);
        int s=0;
        int temp = num;
        while (temp!=0){
            int rem = temp%10;
            s+=Math.pow(rem, digit);
            temp/=10;

        }
        if(num == s)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }

}
