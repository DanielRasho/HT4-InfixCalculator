package App_main.model;

import App_main.model.Stack.StackedArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testEvaluate() {
        Calculator calc = new Calculator(new StackedArrayList<Double>());
        double resultado = calc.evaluate("2 1 3 + *");
        assertEquals(resultado, 8.0d, 0.2d);
    }
}