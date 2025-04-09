package Stack;

import java.util.Stack;

public class BalancedParentheses {
    static boolean isBalancedParenthese(String str){
        Stack<Character> st =new Stack<>();
        for(char c: str.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);

            }else{
                if(c==')'||c==']'||c=='}'){
                    if(st.isEmpty()){
                        return false;
                    }else{
                        char top =st.pop();
                        if(
                                c==')'  && top != '('||c==']' && top != '[' ||c=='}' && top != '{'
                        )
                            return false;
                    }
                }
            }
        }
return st.isEmpty();
    }

    public static void main(String[] args) {
        String test = "{[))]}";  // Try with different strings

        if (isBalancedParenthese(test)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
