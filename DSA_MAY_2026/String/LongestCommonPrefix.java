package DSA_MAY_2026.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
       String s[] = {"ab", "a"};

       String sum ="";
       String first = s[0];
       int k=0;
       boolean check =true;
       while(k < first.length()) {
           for (int i = 0; i < s.length; i++) {
               String  compare = s[i];
               if (k >= compare.length() || k >= first.length()) {
                   check = false;
                   break;
               }
                   if((compare.charAt(k) != first.charAt(k)) ) {
                       check = false;
                       break;
                   }


           }
           if(check){
               sum+=first.charAt(k);
           k++;}else{break;}
       }
        System.out.println(sum.length());
        System.out.println(sum);
    }
}
