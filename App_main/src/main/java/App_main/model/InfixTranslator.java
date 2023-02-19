package App_main.model;

import java.util.Stack;

public class InfixTranslator {
    // Método que convierte una expresión en notación infija a notación postfija
    public static String infixToPostFix(String expression) {

        Stack<Character> pila = new Stack<>();
        String postfix = "";
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            // Si es un dígito, lo agregamos directamente al resultado
            if (isOperator(c)) {
                // Si es un operador, lo vamos agregando a la pila hasta encontrar uno con menor precedencia
                while (!pila.isEmpty() && pila.peek() != '(' && precedence(pila.peek()) >= precedence(c)) {
                    postfix += pila.pop();
                }
                pila.push(c);
            } else if (c == '(') {
                // Si es un paréntesis abierto, lo agregamos a la pila
                pila.push(c);
            } else if (c == ')') {
                // Si es un paréntesis cerrado, vamos sacando operadores de la pila hasta encontrar el paréntesis abierto correspondiente
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfix +=" ";
                    postfix += pila.pop();
                }
                pila.pop();
            } else {
                postfix += c;
            }
        }
        // Sacamos los operadores restantes de la pila y los agregamos al resultado
        while (!pila.isEmpty()) {
            postfix +=" ";
            postfix += pila.pop();
        }
        
        return postfix.replaceAll(" +", " ");
    }
    // Método que verifica si un carácter es un operador matemático
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
     //Devuelve la precedencia de un operador matemático. Si el carácter no es un operador, devuelve 0.
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
