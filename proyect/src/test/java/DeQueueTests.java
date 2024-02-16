import org.example.Person;
import org.example.queues.DeQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeQueueTests {
    @Test
    public void OnInitSizeIsCero() {
        DeQueue<Person> queue = new DeQueue<>();
        Assertions.assertEquals(0, queue.size());
    }
    @Test
    public void OnInitIsEmpty() {
        DeQueue<Person> queue = new DeQueue<>();
        Assertions.assertTrue(queue.isEmpty());
    }
    @Test
    public void OnAddFirstSizeIsOne() {
        DeQueue<Person> queue = new DeQueue<>();
        queue.addFirst(new Person("John", 2));
        Assertions.assertEquals(1, queue.size());
    }
    @Test
    public void OnAddFirstIsEmptyIsFalse() {
        DeQueue<Person> queue = new DeQueue<>();
        queue.addFirst(new Person("John", 2));
        Assertions.assertFalse(queue.isEmpty());
    }
    @Test
    public void OnAddFirstRemoveFirstIsTheAdded() {
        DeQueue<Person> queue = new DeQueue<>();
        Person person = new Person("John", 2);
        queue.addFirst(person);
        Assertions.assertEquals(person, queue.removeFirst());
    }
    @Test
    public void OnAddFirstRemoveFirstSizeIsCero() {
        DeQueue<Person> queue = new DeQueue<>();
        queue.addFirst(new Person("John", 2));
        queue.removeFirst();
        Assertions.assertEquals(0, queue.size());
    }
    @Test
    public void OnAddFirstRemoveFirstIsEmpty() {
        DeQueue<Person> queue = new DeQueue<>();
        queue.addFirst(new Person("John", 2));
        queue.removeFirst();
        Assertions.assertTrue(queue.isEmpty());
    }
    @Test
    public void OnAddFirstRemoveFirstAddFirstRemoveFirstIsEmpty() {
        DeQueue<Person> queue = new DeQueue<>();
        Person person = new Person("John", 2);
        queue.addFirst(person);
        queue.removeFirst();
        queue.addFirst(person);
        queue.removeFirst();
        Assertions.assertTrue(queue.isEmpty());
    }
    @Test
    public void OnAddLastRemoveLastIsTheAdded() {
        DeQueue<Person> queue = new DeQueue<>();
        Person person = new Person("John", 2);
        queue.addLast(person);
        Assertions.assertEquals(person, queue.removeLast());
    }
    @Test
    public void OnAddLastRemoveLastSizeIsCero() {
        DeQueue<Person> queue = new DeQueue<>();
        queue.addLast(new Person("John", 2));
        queue.removeLast();
        Assertions.assertEquals(0, queue.size());
    }
    @Test
    public void OnAddLastRemoveLastIsEmpty() {
        DeQueue<Person> queue = new DeQueue<>();
        queue.addLast(new Person("John", 2));
        queue.removeLast();
        Assertions.assertTrue(queue.isEmpty());
    }
    @Test
    public void OnAddLastRemoveLastAddLastRemoveLastIsEmpty() {
        DeQueue<Person> queue = new DeQueue<>();
        Person person = new Person("John", 2);
        queue.addLast(person);
        queue.removeLast();
        queue.addLast(person);
        queue.removeLast();
        Assertions.assertTrue(queue.isEmpty());
    }
}
