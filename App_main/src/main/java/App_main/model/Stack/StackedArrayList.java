package App_main.model.Stack;

import java.util.ArrayList;

public class StackedArrayList<E> extends ListStack<E> implements Stack<E> {

    public StackedArrayList(){
        this.data = new ArrayList<>();
    }
}
