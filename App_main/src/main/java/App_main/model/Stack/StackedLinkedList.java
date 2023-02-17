package App_main.model.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StackedLinkedList<E> extends ListStack<E> implements Stack<E> {

    public StackedLinkedList(){
        super.data = new LinkedList<>();
    }
}
