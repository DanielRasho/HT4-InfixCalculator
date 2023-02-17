package App_main;
import java.util.Stack;
public class Interprete{
public static String infixToPostfix(String expresion) {
    
    Stack<Character> pila = new Stack<>();
    String postfix = "";
    for (int i = 0; i < expresion.length(); i++) {
        char c = expresion.charAt(i);
        if (isOperator(c)) {
            while (!pila.isEmpty() && pila.peek() != '(' && precedence(pila.peek()) >= precedence(c)) {
                postfix += pila.pop();
            }
            pila.push(c);
        } else if (c == '(') {
            pila.push(c);
        } else if (c == ')') {
            while (!pila.isEmpty() && pila.peek() != '(') {
                postfix += pila.pop();
            }
            pila.pop();
            postfix +=" ";
        } else {
            postfix += c;
        }
    }
    while (!pila.isEmpty()) {
        postfix += pila.pop();
    }
    return postfix;
    }

    private static boolean Operator(char c) {

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

