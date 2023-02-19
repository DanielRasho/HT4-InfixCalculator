package App_main.model;

import java.util.Stack;

public class InfixTranslator {

    public static String infixToPostFix(String expression) {

        Stack<Character> pila = new Stack<>();
        String postfix = "";
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (isOperator(c)) {
                while (!pila.isEmpty() && pila.peek() != '(' && precedence(pila.peek()) >= precedence(c)) {
                    postfix += pila.pop();
                }
                pila.push(c);
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfix +=" ";
                    postfix += pila.pop();
                }
                pila.pop();
            } else {
                postfix += c;
            }
        }
        while (!pila.isEmpty()) {
            postfix +=" ";
            postfix += pila.pop();
        }
        // Cleaning extra whitespaces and returning.
        return postfix.replaceAll(" +", " ");
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '^') {
            return 3;
        } else {
            return 0;
        }
    }
}
