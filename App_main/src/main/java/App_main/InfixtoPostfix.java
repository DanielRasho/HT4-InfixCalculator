package App_main;
import java.util.Stack;
public class Interprete{
public static String infixToPostfix(String expresion) {
    Stack<Character> pila = new Stack<>();
    String postfix = "";
    for (int i = 0; i < expresion.length(); i++) {
        char c = expresion.charAt(i);
        if (Operator(c)) {
            while (!pila.isEmpty() && pila.peek() != '(' && precedente(pila.peek()) >= precedente(c)) {
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
        } else {
            postfix += c;
        }
    }
    while (!pila.isEmpty()) {
        postfix += pila.pop();
    }
    return postfix;
    }
}