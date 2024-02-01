package org.example.stacks;

public class ArrayStack <T> implements IStack<T> {

    private T[] array;

    private static final int CAPACITY = 10000;
    private  int s = -1;
    public ArrayStack() {
        array = (T[]) new Object[CAPACITY];
    }

    public ArrayStack(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return s+1;
    }

    @Override
    public boolean isEmpty() {
        return s == -1;
    }

    @Override
    public void push(T t) {
        if (size() == array.length) {
            //throw new IllegalStateException("Stack is full");
            System.out.println("Stack is full");
            return;
        }
        array[++s] = t;

    }

    @Override
    public T top() {
        if (isEmpty()) {
            return null;
        }
        return array[s];
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T t = array[s];
        array[s] = null;
        s--;
        return t;
    }

    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = size()-1; i>= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
