import org.example.Person;
import org.example.linkedlists.CircularLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircularLinkedListTests {
    @Test
    public void OnInitSizeIsCero() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        Assertions.assertEquals(0, list.size());
    }
    @Test
    public void OnInitIsEmpty() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        Assertions.assertTrue(list.isEmpty());

    }

    @Test
    public void OnAddFirstSizeIsOne() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        list.addFirst(new Person("John", 2));
        list.addFirst(new Person("John", 3));
        Assertions.assertEquals(2, list.size());
    }
    @Test
    public void OnAddFirstIsEmptyIsFalse() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        list.addFirst(new Person("John", 2));
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    public void OnAddFirstFirstIsTheAdded() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        Person person = new Person("John", 2);
        list.addFirst(person);
        Assertions.assertEquals(person, list.first().data);
    }
    @Test
    public void OnAddFirstLastIsTheAdded() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        Person person = new Person("John", 3);
        list.addFirst(person);
        Assertions.assertEquals(person, list.last().data);
    }
    @Test
    public void OnAddLastSizeIsOne() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        list.addLast(new Person("John", 2));
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void OnAddLastIsEmptyIsFalse() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        list.addLast(new Person("John", 2));
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    public void OnAddLastFirstIsTheAdded() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        Person person = new Person("John", 3);
        list.addLast(person);
        Assertions.assertEquals(person, list.first().data);
    }
    @Test
    public void OnAddLastLastIsTheAdded() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        Person person = new Person("John", 3);
        list.addLast(person);
        Assertions.assertEquals(person, list.last().data);
    }
    @Test
    public void OnRemoveFirstSizeIsZero() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        list.addFirst(new Person("John", 3));
        list.removeFirst();
        Assertions.assertEquals(0, list.size());
    }
    @Test
    public void OnRemoveFirstIsEmpty() {
        CircularLinkedList<Person> list = new CircularLinkedList<>();
        list.addFirst(new Person("John", 3));
        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }


}
