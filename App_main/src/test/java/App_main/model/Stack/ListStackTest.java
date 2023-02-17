package App_main.model.Stack;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ListStackTest {

    @Test
    public void sizeOfStackMustBeTwo() {
        ListStack<String> stack = new ListStack<>();
        stack.push("1");
        stack.push("2");
        assertEquals(stack.size(), 2);
    }

    @Test
    public void popTwoAsLastElementAndSizeDecreasedToOne() {
        ListStack<String> stack = new ListStack<>();
        stack.push("1");
        stack.push("2");
        assertEquals(stack.pop(), "2");
        assertEquals(stack.size(), 1);
    }

    @Test
    public void peekMustReturnSameAsPop() {
        ListStack<String> stack = new ListStack<>();
        stack.push("1");
        stack.push("2");
        assertEquals(stack.peek(), stack.pop());
    }

    @Test
    public void newStackMustBeEmpty() {
        ListStack<String> stack = new ListStack<>();
        assertEquals(stack.empty(), true);
    }

    @Test
    public void emptyStackMustThrowExceptionWhenPopEmpty(){
        ListStack<String> stack = new ListStack<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }

}