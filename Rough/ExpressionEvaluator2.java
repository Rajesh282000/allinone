
package Rough;
import java.util.Stack;

public class ExpressionEvaluator2 {
    public static void main(String[] args) {
        String expression = "10+20-8";
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expression.length()) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                numbers.push(num);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && hasPrecedence(operators.peek(), ch))
                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
                operators.push(ch);
                i++;
            } else {
                i++;
            }
        }

        while (!operators.isEmpty())
            numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));

        return numbers.pop();
    }

    private static boolean hasPrecedence(char op1, char op2) {
        return (op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-');
    }

    private static int applyOperator(char operator, int b, int a) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        throw new IllegalArgumentException("Invalid operator");
    }
}

