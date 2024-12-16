package Rough;

public class CaseConversion {
    public static void main(String[] args) {

        String is= next("ABC");
        System.out.println(is);

        String input = "iF Rajesh burnwal";


        String[] words = input.split("(?=[A-Z])");  // Split at uppercase letters

        for (String word : words) {
            //System.out.println(word);
            char[] ch = word.toCharArray();
            for (int i = 0;i  < ch.length; i++) {
                if (Character.isLowerCase(ch[i]))
                    ch[i] = Character.toUpperCase(ch[i]);
                else ch[i] = Character.toLowerCase(ch[i]);
            }
            System.out.print(String.valueOf(ch));
        }
    }

    static  String next(String str){
        char ch[] = str.toCharArray();
        for(int i =0;i <ch.length;i++){
            ch[i]= (char) (ch[i]+1);

        }
        return String.valueOf(ch);
    }
}

