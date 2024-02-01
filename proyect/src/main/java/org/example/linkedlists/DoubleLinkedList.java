package org.example.linkedlists;

public class DoubleLinkedList<T> implements IDoubleLinkedList {
    private DoubleEdgeNode<T> head;
    private DoubleEdgeNode<T> tail;

    public DoubleLinkedList() {
        DoubleEdgeNode<T> head = new DoubleEdgeNode<>(null);
        DoubleEdgeNode<T> tail = new DoubleEdgeNode<>(null);
        head.next = tail;
        tail.prev = head;
        this.head = null;
        this.tail = null;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 0;
        DoubleEdgeNode<T> current = head.next;
        while (current != tail) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.next == tail;
    }

    @Override
    public DoubleEdgeNode first() {
        return null;
    }

    @Override
    public DoubleEdgeNode last() {
        return null;
    }

    @Override
    public void addFirst(Object data) {

    }

    @Override
    public void addLast(Object data) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void print() {

    }
}
