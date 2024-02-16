package org.example.linkedlists;

public class CircularNode <T>{
    public T data;
    CircularNode <T> next;

    public CircularNode(T data) {
        this.data = data;
        this.next = null;
    }

}
