package org.example.linkedlists;

public class DoubleEdgeNode<T>  {
    DoubleEdgeNode<T> prev;
    DoubleEdgeNode<T> next;
    public T data;

    public DoubleEdgeNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}
