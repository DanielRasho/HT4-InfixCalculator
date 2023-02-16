package App_main.model;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackedArray<E> implements Stack<E> {

    private ArrayList<E> data = new ArrayList<>();

    /**
     * Add an item in the top of the stack
     * Will be popped next if no intervening push.
     * @param item item to push to the stack.
     */
    @Override
    public void push(E item) {
        this.data.add(item);
    }

    /**
     * Takes out the last element pushed to the stack and
     * return it.
     * @return The element in the top of the stack.
     * @throws EmptyStackException If the stack is empty
     */
    @Override
    public E pop() throws EmptyStackException {
        if(this.empty())
            throw new EmptyStackException();
        else{
            E item = this.data.get(lastIndex());
            this.data.remove(lastIndex());
            return item;
        }
    }

    /**
     * Return the last element pushed to the stack,
     * without taking it out.
     * @return The element in the top of the stack.
     * @throws EmptyStackException If the stack is empty
     */
    @Override
    public E peek() throws EmptyStackException {
        if(this.empty())
            throw new EmptyStackException();
        else
            return this.data.get(this.lastIndex());
    }

    /**
     * Returns true if and only if the stack has no elements.
     * @return True if empty, false otherwise.
     */
    @Override
    public boolean empty() {
        return data.size() == 0;
    }

    /**
     * Returns the number of elements in the stack
     * @return The number of elements in the stack.
     */
    @Override
    public int size() {
        return this.data.size();
    }

    /**
     * Returns the index of the last element pushed to the stack.
     * @return Returns the index of the last element pushed to the stack.
     */
    private int lastIndex(){
        return this.data.size() - 1;
    }
}
