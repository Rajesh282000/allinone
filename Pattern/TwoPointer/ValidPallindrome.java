package Pattern.TwoPointer;

public class ValidPallindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPallindrome(s));
    }
    public static boolean isPallindrome(String s) {
        int i = 0, j = s.length() - 1;
       // char[] c = s.toCharArray();
        while(i<j){

            if(!(Character.isLetterOrDigit(s.charAt(i)))){
                i++;
                continue;
            }

            if(!(Character.isLetterOrDigit(s.charAt(j)))){
                j--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++; j--;

        }
        return true;
    }
}
