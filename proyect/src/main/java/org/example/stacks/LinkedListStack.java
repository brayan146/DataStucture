package org.example.stacks;

import org.example.linkedlists.LinkedList;

public class LinkedListStack<T> implements IStack<T>{

    private LinkedList<T> list = new LinkedList<T>();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T t) {
        list.addFirst(t);
    }

    @Override
    public T top() {
        return list.first().data;
    }

    @Override
    public T pop() {
        T data = list.first().data;
        list.removeFirst();
        return data;
    }

    @Override
    public void printStack() {
        list.print();
    }
}
