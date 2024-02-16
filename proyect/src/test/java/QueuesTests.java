import org.example.Person;
import org.example.queues.ArrayQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueuesTests {
    @Test
    public void OnInitSizeIsCero() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        Assertions.assertEquals(0, queue.size());
    }

    @Test
    public void OnInitIsEmpty() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        Assertions.assertTrue(queue.isEmpty());
    }
    @Test
    public void OnEnqueueSizeIsOne() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        queue.enQueue(new Person("John", 2));
        Assertions.assertEquals(1, queue.size());
    }
    @Test
    public void OnEnqueueIsEmptyIsFalse() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        queue.enQueue(new Person("John", 2));
        Assertions.assertFalse(queue.isEmpty());
    }
    @Test
    public void OnEnqueueDequeueIsTheAdded() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        Person person = new Person("John", 2);
        queue.enQueue(person);
        Assertions.assertEquals(person, queue.deQueue());
    }
    @Test
    public void OnEnqueueDequeueSizeIsCero() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        queue.enQueue(new Person("John", 2));
        queue.deQueue();
        Assertions.assertEquals(0, queue.size());
    }
    @Test
    public void OnEnqueueDequeueIsEmpty() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        queue.enQueue(new Person("John", 2));
        queue.deQueue();
        Assertions.assertTrue(queue.isEmpty());
    }
    @Test
    public void OnEnqueueDequeueEnqueueDequeueIsEmpty() {
        ArrayQueue<Person> queue = new ArrayQueue<>();
        Person person = new Person("John", 2);
        queue.enQueue(person);
        queue.deQueue();
        queue.enQueue(person);
        queue.deQueue();
        Assertions.assertTrue(queue.isEmpty());
    }


}
