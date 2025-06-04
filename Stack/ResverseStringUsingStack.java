package Stack;

import java.util.Stack;

public class ResverseStringUsingStack {
    static void reverseString(String str){
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            stack.push(c);
        }
        String revResult="";
        while (stack.size()!=0){
            char top = stack.pop();
            revResult+=top;

        }
        System.out.println(revResult);
    }

    public static void main(String[] args) {
        reverseString("rajesh");
    }
}
