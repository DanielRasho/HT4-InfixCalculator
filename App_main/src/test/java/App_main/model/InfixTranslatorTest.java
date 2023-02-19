package App_main.model;

import junit.framework.TestCase;
import org.junit.Test;

public class InfixTranslatorTest extends TestCase {

    @Test
    public void testInfixToPostfix() {
        System.out.println("infixToPostfix");
        String expression = "3 + 2";
        String expResult = "3 2 +";
        String result = InfixTranslator.infixToPostFix(expression);
        assertEquals(expResult, result);
    }

    @Test
    public void testInfixToPostfixCompoundOperation() {
        System.out.println("infixToPostfix");
        String expression = "(3 + 6) / 3";
        String expResult = "3 6 + 3 /";
        String result = InfixTranslator.infixToPostFix(expression);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsOperator() {
        System.out.println("isOperator");
        char c = '5';
        boolean expResult = false;
        boolean result = InfixTranslator.isOperator(c);
        assertEquals(expResult, result);
    }

    @Test
    public void testPrecedence() {
        System.out.println("precedence");
        char c = '+';
        int expResult = 1;
        int result = InfixTranslator.precedence(c);
        assertEquals(expResult, result);
    }

}