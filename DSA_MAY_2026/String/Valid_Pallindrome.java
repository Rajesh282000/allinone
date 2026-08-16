package DSA_MAY_2026.String;

public class Valid_Pallindrome {
    public static void main(String[] args) {
        String  s = "A man, {}a plan, a canal: Panama";
        String res = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(res);

        int i =0, j=res.length()-1;
        boolean resBool=true;

        while (i <=j){
          if(res.charAt(i)!= res.charAt(j))
              resBool =false;

            i++; j--;

        }

//        public static char tolower(char ch){
//            if(ch>='A'&&ch<='Z'){
//                return (char)(ch+32);
//            }

        System.out.println(resBool);

    }
}
