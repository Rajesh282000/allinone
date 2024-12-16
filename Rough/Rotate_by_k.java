package Rough;


//incomplete solution coding nijas

import java.math.BigInteger;

public class Rotate_by_k {


    public static String decimalToBinary(int decimal) {
        // Convert the decimal number to a BigInteger
        BigInteger bigInteger = BigInteger.valueOf(decimal);

        // Get the binary representation as a string
        String binaryRepresentation = bigInteger.toString(2);

        return binaryRepresentation;
    }


    public static int rightRotateBinary(int binaryNumber, int k) {
        k %= Integer.SIZE; // Ensure k is within the valid range of 0 to 31 (number of bits in an int)
        return (binaryNumber >>> k) | (binaryNumber << (Integer.SIZE - k));
    }


    public static int rotateByKBits(int n, int k){
        if(k<0){
            k=-k;
            n = n>>k;
        }else if(k>0){
            n=n>>k;
        }
        return n;
    }



    public static void main(String[] args) {

      int ans = rotateByKBits(10, 2);
        System.out.println(ans);
    }


}
