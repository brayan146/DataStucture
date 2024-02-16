package org.example.linkedlists;

public interface ICircularList<T> {
    int size();
    boolean isEmpty();
    public void addFirst(T data);
    public void addLast(T data);
    public void removeFirst();
    public void removeLast();
    public void print();
    CircularNode<T> first();
    CircularNode<T> last();

}
