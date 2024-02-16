package org.example.linkedlists;

public class CircularLinkedList<T> implements ICircularList<T> {
    CircularNode<T> trailer;
    CircularNode<T> head;

    public CircularLinkedList() {
        trailer = head;
    }
    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 0;
        CircularNode<T> current = trailer.next;
        while (current != trailer) {
            size++;
            current = current.next;
        }
        return size + 1;
    }

    @Override
    public boolean isEmpty() {
        return trailer == null;
    }

    @Override
    public void addFirst(T data) {
        CircularNode<T> newNode = new CircularNode<T>(data);
        if (isEmpty()) {
            trailer = newNode;
            trailer.next = trailer;
            return;
        }
        newNode.next = trailer.next;
        trailer.next = newNode;
    }

    @Override
    public void addLast(T data) {
        CircularNode<T> newNode = new CircularNode<T>(data);
        if (isEmpty()) {
            trailer = newNode;
            trailer.next = trailer;
            return;
        }
        newNode.next = trailer.next;
        trailer.next = newNode;
        trailer = newNode;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        if (trailer.next == trailer) {
            trailer = null;
            return;
        }
        trailer.next = trailer.next.next;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        if (trailer.next == trailer) {
            trailer = null;
            return;
        }
        CircularNode<T> current = trailer.next;
        while (current.next != trailer) {
            current = current.next;
        }
        current.next = trailer.next;
        trailer = current;
    }

    @Override
    public void print() {
        if (isEmpty()) {
            return;
        }
        CircularNode<T> current = trailer.next;
        while (current != trailer) {
            System.out.print(current.data +" ");
            current = current.next;
        }
        System.out.print(trailer.data+" ");
    }

    @Override
    public CircularNode<T> first() {
        CircularNode<T> current = trailer.next;
        return current;
    }

    @Override
    public CircularNode<T> last() {
        return trailer;
    }
}
