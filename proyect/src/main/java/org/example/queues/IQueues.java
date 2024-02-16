package org.example.queues;

public interface IQueues<E> {
    /**
     * Return the number of elements in the queue
     * @param e the element to be inserted
     */
    void enQueue(E e);

    /**
     * Return the first element of the queue
     * @return first element of the queue(or null if empty)
     */
    E deQueue();

    /**
     * Returns the first element of the queue
     * @return first element of the queue (or null if empty)
     */
     E first();
    /**
     * Return whether the queue is empty
     * @return true if the queue is empty, false otherwise
     */

    boolean isEmpty();
    /**
     * Return the number of elements in the queue
     * @return number of elements in the queue
     */
    int size();
}
