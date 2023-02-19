/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixtopostfix;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 50250
 */
public class InfixtoPostfixTest {
    
    public InfixtoPostfixTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InfixtoPostfix.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInfixToPostfix() {
        System.out.println("infixToPostfix");
        String expresion = "";
        String expResult = "";
        String result = InfixtoPostfix.infixToPostfix(expresion);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsOperator() {
        System.out.println("isOperator");
        char c = ' ';
        boolean expResult = false;
        boolean result = InfixtoPostfix.isOperator(c);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPrecedence() {
        System.out.println("precedence");
        char c = ' ';
        int expResult = 0;
        int result = InfixtoPostfix.precedence(c);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
