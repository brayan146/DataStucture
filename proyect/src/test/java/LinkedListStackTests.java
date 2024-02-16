import org.example.Person;
import org.example.stacks.LinkedListStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListStackTests {
    @Test
    public void OnInitSizeIsCero() {
        LinkedListStack<Person> stack = new LinkedListStack<>();
        Assertions.assertEquals(0, stack.size());
    }
    @Test
    public void OnInitIsEmpty() {
        LinkedListStack<Person> stack = new LinkedListStack<>();
        Assertions.assertTrue(stack.isEmpty());

    }
    @Test
    public void OnPushSizeIsOne() {
        LinkedListStack<Person> stack = new LinkedListStack<>();
        stack.push(new Person("John", 2));
        Assertions.assertEquals(1, stack.size());
    }
    @Test
    public void OnPushIsEmptyIsFalse() {
        LinkedListStack<Person> stack = new LinkedListStack<>();
        stack.push(new Person("John", 2));
        Assertions.assertFalse(stack.isEmpty());
    }
    @Test
    public void OnPushPopIsTheAdded() {
        LinkedListStack<Person> stack = new LinkedListStack<>();
        Person person = new Person("John", 2);
        stack.push(person);
        Assertions.assertEquals(person, stack.pop());
    }
    @Test
    public void OnPushPopSizeIsCero() {
        LinkedListStack<Person> stack = new LinkedListStack<>();
        stack.push(new Person("John", 2));
        stack.pop();
        Assertions.assertEquals(0, stack.size());
    }
    @Test
    public void OnPushPopIsEmpty() {
        LinkedListStack<Person> stack = new LinkedListStack<>();
        stack.push(new Person("John", 2));
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

}
