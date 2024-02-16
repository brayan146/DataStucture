import org.example.Person;
import org.example.linkedlists.DoubleLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleLinkedListTests {
    @Test
    public void OnInitSizeIsCero() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        Assertions.assertEquals(0, list.size());
    }
    @Test
    public void OnInitIsEmpty() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        Assertions.assertTrue(list.isEmpty());

    }
    @Test
    public void OnAddFirstSizeIsOne() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addFirst(new Person("John", 2));
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void OnAddFirstIsEmptyIsFalse() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addFirst(new Person("John", 2));
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    public void OnAddFirstFirstIsTheAdded() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        Person person = new Person("John", 2);
        list.addFirst(person);
        Assertions.assertEquals(person, list.first().data);
    }
    @Test
    public void OnAddFirstLastIsTheAdded() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        Person person = new Person("John", 3);
        list.addFirst(person);
        Assertions.assertEquals(person, list.last().data);
    }
    @Test
    public void OnAddLastSizeIsOne() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addLast(new Person("John", 2));
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void OnAddLastIsEmptyIsFalse() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addLast(new Person("John", 2));
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    public void OnAddLastFirstIsTheAdded() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        Person person = new Person("John", 3);
        list.addLast(person);
        Assertions.assertEquals(person, list.first().data);
    }
    @Test
    public void OnAddLastLastIsTheAdded() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        Person person = new Person("John", 3);
        list.addLast(person);
        Assertions.assertEquals(person, list.last().data);
    }
    @Test
    public void OnRemoveFirstSizeIsZero() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addFirst(new Person("John", 3));
        list.removeFirst();
        Assertions.assertEquals(0, list.size());
    }
    @Test
    public void OnRemoveFirstIsEmpty() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addFirst(new Person("John", 3));
        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }
    @Test
    public void OnRemoveFirstFirstIsNull() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addFirst(new Person("John", 3));
        list.removeFirst();
        Assertions.assertNull(list.first());
    }
    @Test
    public void OnRemoveFirstLastIsNull() {
        DoubleLinkedList<Person> list = new DoubleLinkedList<>();
        list.addFirst(new Person("John", 3));
        list.removeFirst();
        Assertions.assertNull(list.last());
    }

}
