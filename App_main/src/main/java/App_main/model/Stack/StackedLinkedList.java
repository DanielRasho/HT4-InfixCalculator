package App_main.model.Stack;

import java.util.LinkedList;

public class StackedLinkedList<E> extends ListStack<E> implements Stack<E> {

    public StackedLinkedList(){
        super.data = new LinkedList<>();
    }
}
