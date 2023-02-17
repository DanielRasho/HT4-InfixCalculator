package App_main.model.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class StackedVector<E> extends ListStack<E> implements Stack<E> {

    public StackedVector(){
        super.data = new ArrayList<>();
    }

}
