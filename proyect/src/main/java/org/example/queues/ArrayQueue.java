package org.example.queues;

public class ArrayQueue<T> implements IQueues<T>{

    private final T[] array;

    private static final int CAPACITY = 10000;
    private int s = -1;

    public ArrayQueue() {
        array = (T[]) new Object[CAPACITY];
    }

    public ArrayQueue(int capacity) {
        array = (T[]) new Object[capacity];
    }



    @Override
    public void enQueue(T t) {
        if (size() == array.length) {
            System.out.println("Queue is full");
            return;
        }
        array[++s] = t;

    }

    @Override
    public T deQueue() {
        if (isEmpty()) {
            return null;
        }
        T t = array[0];
        for (int i = 0; i < s; i++) {
            array[i] = array[i+1];
        }
        array[s] = null;
        s--;
        return t;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            return null;
        }
        return array[0];
    }

    @Override
    public boolean isEmpty() {
        return s == -1;
    }

    @Override
    public int size() {
        return s+1;
    }
}
