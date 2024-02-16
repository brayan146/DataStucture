import org.example.Person;
import org.example.stacks.ArrayStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayStackTests {
    @Test
    public void OnInitSizeIsCero() {
        ArrayStack<Person> stack = new ArrayStack<>();
        Assertions.assertEquals(0, stack.size());
    }
    @Test
    public void OnInitIsEmpty() {
        ArrayStack<Person> stack = new ArrayStack<>();
        Assertions.assertTrue(stack.isEmpty());

    }
    @Test
    public void OnPushSizeIsOne() {
        ArrayStack<Person> stack = new ArrayStack<>();
        stack.push(new Person("John", 2));
        Assertions.assertEquals(1, stack.size());
    }
    @Test
    public void OnPushIsEmptyIsFalse() {
        ArrayStack<Person> stack = new ArrayStack<>();
        stack.push(new Person("John", 2));
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void OnPushPopIsTheAdded() {
        ArrayStack<Person> stack = new ArrayStack<>();
        Person person = new Person("John", 2);
        stack.push(person);
        Assertions.assertEquals(person, stack.pop());
    }
    @Test
    public void OnPushPopSizeIsCero() {
        ArrayStack<Person> stack = new ArrayStack<>();
        stack.push(new Person("John", 2));
        stack.pop();
        Assertions.assertEquals(0, stack.size());
    }
    @Test
    public void OnPushPopIsEmpty() {
        ArrayStack<Person> stack = new ArrayStack<>();
        stack.push(new Person("John", 2));
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }
    @Test
    public void OnPushPopPushPopIsEmpty() {
        ArrayStack<Person> stack = new ArrayStack<>();
        Person person = new Person("John", 2);
        stack.push(person);
        stack.pop();
        stack.push(person);
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }
    @Test
    public void OnPushPopPushPopSizeIsCero() {
        ArrayStack<Person> stack = new ArrayStack<>();
        Person person = new Person("John", 2);
        stack.push(person);
        stack.pop();
        stack.push(person);
        stack.pop();
        Assertions.assertEquals(0, stack.size());
    }

    @Test
    public void OnPushPopPushPopPopIsNull() {
        ArrayStack<Person> stack = new ArrayStack<>();
        Person person = new Person("John", 2);
        stack.push(person);
        stack.pop();
        stack.push(person);
        stack.pop();
        Assertions.assertNull(stack.pop());
    }


}
