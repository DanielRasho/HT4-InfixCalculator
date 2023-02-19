package App_main.model;

import App_main.model.Stack.Stack;

public class Calculator implements ICalculator {

    private double lastCalculation = 0;
    private final Stack<Double> stack;

    public Calculator(Stack<Double> stack){
        this.stack = stack;
    }

    /**
     * Evalua una expresion postfix VALIDA dada.
     * @param expression La expresion a calcular.
     * @return Resultado de la expresion Postfix
     * @throws ArithmeticException
     */
    @Override
    public double evaluate(String expression) throws ArithmeticException {
        String[] items = operatorsAsArray(expression);
        double operatorA = 0;
        double operatorB = 0;
        double result = 0;

        for (String item : items) {
            try {
                stack.push(Double.parseDouble(item));   // If is Number add it to the Stack
            } catch (NumberFormatException e) {         // Else Operate
                operatorB = stack.pop();
                operatorA = stack.pop();
                switch (item) {
                    case "+" -> stack.push(operatorA + operatorB);
                    case "-" -> stack.push(operatorA - operatorB);
                    case "*" -> stack.push(operatorA * operatorB);
                    case "/" -> {
                        if (operatorB == 0)
                            throw new ArithmeticException("No se permite division por 0");
                        else
                            stack.push(operatorA / operatorB);
                    }
                }
            }
        }
        this.lastCalculation = stack.pop(); // Returning Final Result
        stack.clear();
        return lastCalculation;
    }

    /**
     *
     * @return El resultado de la ultima expresion hecha.
     */
    @Override
    public double getPrevious() {
        return lastCalculation;
    }

    /**
     * Divides an expresion in a list, where spaces are the separators.
     * @param expression Pstfix expresion
     * @return List of operators and operations.
     */
    private String[] operatorsAsArray(String expression){
        return expression.trim().split(" ");
    }
}
