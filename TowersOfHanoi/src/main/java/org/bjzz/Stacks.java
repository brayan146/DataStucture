package org.bjzz;

public class Stacks<T> implements IStack<T> {
    private T[] array;

    private static final int CAPACITY = 10000;
    private  int s = -1;
    public Stacks() {
        array = (T[]) new Object[CAPACITY];
    }

    public Stacks(int capacity) {
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
    public T get(int index) {
        if (index < 0 || index > s) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return array[index];
    }

}
