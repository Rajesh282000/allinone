package Basics;

public class Basic2 {
    public static void main(String[] args) {
        String str="rajesh";
        revString(str);
       /* char[] ch = str.toCharArray();
        System.out.println(ch[0]-'0');
        xDivisor(7, 2);*/
    }

    static  void xDivisor(int n, int x){

        int count = 0;

        for(int i=1; i<=n; i++){

            //variable to count the factors of i-th number
            int count_factors = 0;
            for(int j = 1; j<= i; j++){
                if(i%j==0){
                    count_factors++;
                }
            }

            if(count_factors == x)
                count++;
        }
        System.out.println(count);

    }

    //reverse string
    static void revString(String str){
        char ch[] = str.toCharArray();

        int v=0;
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
            v++;
        }
        System.out.println("\n"+v);
    }
}
