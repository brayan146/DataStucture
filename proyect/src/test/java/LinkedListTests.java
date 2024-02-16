import org.example.Person;
import org.example.linkedlists.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LinkedListTests {
    @Test
    public void OnInitSizeIsCero() {
        LinkedList<Person> list = new LinkedList<>();
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void OnInitIsEmpty() {
        LinkedList<Person> list = new LinkedList<>();
        Assertions.assertTrue(list.isEmpty());

    }
    @Test
    public void OnAddFirstSizeIsOne() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void OnAddFirstIsEmptyIsFalse() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    public void OnAddFirstFirstIsTheAdded() {
        LinkedList<Person> list = new LinkedList<>();
        Person person = new Person("John", 2);
        list.addFirst(person);
        Assertions.assertEquals(person, list.first().data);
    }
    @Test
    public void OnAddFirstLastIsTheAdded() {
        LinkedList<Person> list = new LinkedList<>();
        Person person = new Person("John", 3);
        list.addFirst(person);
        Assertions.assertEquals(person, list.last().data);
    }
    @Test
    public void OnAddLastSizeIsOne() {
        LinkedList<Person> list = new LinkedList<>();
        list.addLast(new Person("John", 2));
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void OnAddLastIsEmptyIsFalse() {
        LinkedList<Person> list = new LinkedList<>();
        list.addLast(new Person("John", 2));
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    public void OnAddLastFirstIsTheAdded() {
        LinkedList<Person> list = new LinkedList<>();
        Person person = new Person("John", 2);
        list.addLast(person);
        Assertions.assertEquals(person, list.first().data);
    }
    @Test
    public void OnAddLastLastIsTheAdded() {
        LinkedList<Person> list = new LinkedList<>();
        Person person = new Person("John", 2);
        list.addLast(person);
        Assertions.assertEquals(person, list.last().data);
    }
    @Test
    public void OnRemoveFirstFirstIsTheSecond() {
        LinkedList<Person> list = new LinkedList<>();
        Person person = new Person("John", 2);
        list.addFirst(person);
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        Assertions.assertEquals(person, list.first().data);
    }
    @Test
    public void OnRemoveFirstLastIsTheSecond() {
        LinkedList<Person> list = new LinkedList<>();
        Person person = new Person("John", 2);
        list.addFirst(person);
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        Assertions.assertEquals(person, list.last().data);
    }
@Test
    public void OnRemoveFirstSizeIsZero() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        list.removeFirst();
        Assertions.assertEquals(0, list.size());
    }
    @Test
    public void OnRemoveFirstIsEmptyIsTrue() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        list.removeFirst();
        Assertions.assertTrue(list.isEmpty());
    }
    @Test
    public void OnRemoveFirstIsNull() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        Assertions.assertNull(list.first());
    }
    @Test
    public void OnRemoveFirstFirstIsNull() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        list.removeFirst();
        Assertions.assertNull(list.first());
    }
    @Test
    public void OnRemoveFirstLastIsNull() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        list.removeFirst();
        Assertions.assertNull(list.last());
    }
    @Test
    public void OnRemoveFirstSizeIsOne() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        list.removeFirst();
        list.addFirst(new Person("John", 2));
        Assertions.assertEquals(1, list.size());
    }
    @Test
    public void OnRemoveFirstIsEmptyIsFalse() {
        LinkedList<Person> list = new LinkedList<>();
        list.addFirst(new Person("John", 2));
        list.addFirst(new Person("John", 2));
        list.removeFirst();
        list.removeFirst();
        list.addFirst(new Person("John", 2));
        Assertions.assertFalse(list.isEmpty());
    }


}
