package org.example.linkedlists;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T> {
    private DoubleEdgeNode<T> head;
    private DoubleEdgeNode<T> tail;

    public DoubleLinkedList() {
        DoubleEdgeNode<T> head = new DoubleEdgeNode<T>(null);
        DoubleEdgeNode<T> tail = new DoubleEdgeNode<T>(null);
        head.next = tail;
        tail.prev = head;
        this.head = head;
        this.tail = tail;
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
        if (isEmpty()) {
            return null;
        }
        return head.next;
    }

    @Override
    public DoubleEdgeNode last() {
        if (isEmpty()) {
            return null;
        }
        return tail.prev;
    }

    @Override
    public void addFirst(T data) {
        DoubleEdgeNode<T> newNode = new DoubleEdgeNode<T>(data);
        if (isEmpty()) {
            head.next = newNode;
            tail.prev = newNode;
            newNode.prev = head;
            newNode.next = tail;
            return;
        }
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        newNode.prev = head;
    }

    @Override
    public void addLast(T data) {
        DoubleEdgeNode<T> newNode = new DoubleEdgeNode<T>(data);
        if (isEmpty()) {
            head.next = newNode;
            tail.prev = newNode;
            newNode.prev = head;
            newNode.next = tail;
            return;
        }
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        tail.prev = newNode;
        newNode.next = tail;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        head.next = head.next.next;
        head.next.prev = head;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
    }

    @Override
    public void print() {
        DoubleEdgeNode<T> current = head.next;
        while (current != tail) {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

}
