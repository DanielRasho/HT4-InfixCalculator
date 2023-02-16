package App_main.model;

import App_main.model.ICalculator;
import App_main.model.StackedArray;

public class Calculadora implements ICalculator {

    private double lastCalculation = 0;

    /**
     * Evalua una expresion postfix VALIDA dada.
     * @param expression La expresion a calcular.
     * @return Resultado de la expresion Postfix
     * @throws ArithmeticException
     */
    @Override
    public double evaluate(String expression) throws ArithmeticException {
        System.out.println("bandera 1, como que no anda jalando esto xd");
        StackedArray<Double> stackedArray  = new StackedArray<>();
        double operatorA = 0;
        double operatorB = 0;
        double result = 0;
        char  character;

        for(int n=0; n < expression.length(); n++){
            character = expression.charAt(n);
            if('0' < character && character < '9')
                stackedArray.push(Double.parseDouble(String.valueOf(character)));
            else {
                operatorA = stackedArray.pop();
                operatorB = stackedArray.pop();
                switch (character){
                    case '+' -> stackedArray.push(operatorA + operatorB);
                    case '-' -> stackedArray.push(operatorA - operatorB);
                    case '*' -> stackedArray.push(operatorA * operatorB);
                    case '/' -> {
                        if(operatorB == 0)
                            throw new ArithmeticException("No se permite division por 0");
                        else
                            stackedArray.push(operatorA / operatorB);}
                }
            }
        }
        result = stackedArray.pop();
        this.lastCalculation = result;
        return result;
    }

    /**
     *
     * @return El resultado de la ultima expresion hecha.
     */
    @Override
    public double getPrevious() {
        return lastCalculation;
    }
}
