package org.bjzz;

public interface IStack<E> {
    /**
     * Return the number of elements in the stack
     * @return number of elements in the stack
     */
    int size();

    /**
     * Return whether the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Insert an element at the top of the stack
     * @param e the element to be inserted
     */
    void push(E e);

    /**
     * Return the top element in the stack
     * @return top element in the stack
     */
    E top();

    /**
     * Remove and return the top element from the stack
     * @return element removed (or null if empty)
     */
    E pop();


}
