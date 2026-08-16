package DSA_MAY_2026.String;

public class Reverse_String {
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
//        Output: ["o","l","l","e","h"]
        int i =0, j=s.length-1;

        while (i <=j){
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++; j--;

        }

        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k]+" ");
        }
    }
}
