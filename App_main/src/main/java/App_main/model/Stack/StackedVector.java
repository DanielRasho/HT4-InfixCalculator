package App_main.model.Stack;

import java.util.Vector;

public class StackedVector<E> extends ListStack<E> implements Stack<E> {

    public StackedVector(){
        super.data = new Vector<>();
    }

}
