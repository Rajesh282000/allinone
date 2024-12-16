package Rough;

import java.util.Stack;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        String expression = "1+2-8";
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch))
                numbers.push(ch - '0');
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && hasPrecedence(operators.peek(), ch))
                    numbers.push(applyOperator(operators.pop(), numbers.pop(), numbers.pop()));
                operators.push(ch);
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