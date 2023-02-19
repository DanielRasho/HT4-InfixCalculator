package App_main.model.Stack;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class StackedDoubleLinkedListTest {
    //ctrl shif t
    @Test
    public void size() {
        StackedDoubleLinkedList<Integer> stack = new StackedDoubleLinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        assertEquals(stack.size(), 2);
    }

    @Test
    public void add() {
        StackedDoubleLinkedList<String> stack = new StackedDoubleLinkedList<String>();
        stack.add("4");
        stack.add("5");
        stack.add("1");
        assertEquals(stack.pop(1), "5");


    }

    @Test
    public void pop() {
        StackedDoubleLinkedList<String> stack = new StackedDoubleLinkedList<String>();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        assertEquals(stack.pop(1), "2");
    }

    @Test
    public void Clear() {
        StackedDoubleLinkedList<String> stack = new StackedDoubleLinkedList<String>();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.clear();
        assertEquals( stack.size, 0);
    }

}