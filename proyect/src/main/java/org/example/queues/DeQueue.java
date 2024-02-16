package org.example.queues;


import org.example.linkedlists.CircularLinkedList;

public class DeQueue<T> implements IDeQueue<T>{
   CircularLinkedList list = new CircularLinkedList();
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public T first() {
        return (T) list.first().data;
    }

    @Override
    public T last() {
        return (T) list.last().data;
    }

    @Override
    public void addFirst(T t) {
        list.addFirst(t);
    }

    @Override
    public void addLast(T t) {
        list.addLast(t);
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T result = (T) list.first().data;
        list.removeFirst();
        return result;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        T result = (T) list.last().data;
        list.removeLast();
        return result;
    }
}
