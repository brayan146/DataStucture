package org.example.queues;

public interface IDeQueue<E> {
    /**
     * Return the number of elements in the queue
     * @return number of elements in the queue
     */
    int size();

    /**
     * Return whether the queue is empty
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the first element of the queue
     * @return first element of the queue (or null if empty)
     */
    E first();

    /**
     * Returns the last element of the queue
     * @return last element of the queue (or null if empty)
     */
    E last();

    /**
     * Insert an element at the front of the queue
     * @param e the element to be inserted
     */
    void addFirst(E e);

    /**
     * Insert an element at the end of the queue
     * @param e the element to be inserted
     */
    void addLast(E e);

    /**
     * Remove and return the first element from the queue
     * @return element removed (or null if empty)
     */
    E  removeFirst();

    /**
     * Remove and return the last element from the queue
     * @return element removed (or null if empty)
     */
    E removeLast();

}
