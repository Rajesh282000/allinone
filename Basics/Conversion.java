package Basics;

import java.util.Locale;

public class Conversion {
    public static void main(String[] args) {
        binaryToD(101);
        octalToD(2001);
        hexToD("c9");

    }

    //binary to octal
    static void binaryToD(int binary){
        int s=0,r,n=0;

        while(binary>0) {
            r = binary % 10;
            s = (int) (s+r * Math.pow(2,n));
            binary/=10;
            n++;
        }

        System.out.println(s);
    }

    //octal to decimal
static  void  octalToD(int octal){
        int s=0,r,n=0;
        while(octal>0){
            r=octal%10;
            s+=r*Math.pow(8,n);
            octal/=10;
            n++;
        }
    System.out.println(s);
}
//hexadecimal to decimal
static void hexToD(String hexa){
        String s="0123456789ABCDEF";
        hexa=hexa.toUpperCase();
        int sum=0;
        for (int i=0;i<hexa.length();i++) {
            char ch = hexa.charAt(i);
            int d = s.indexOf(ch);
            sum = 16 * sum + d;
        }
    System.out.println(sum);
}


}
