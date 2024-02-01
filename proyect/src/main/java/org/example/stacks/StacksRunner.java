package org.example.stacks;

import org.example.Person;
import org.example.interfaces.IRunner;

public class StacksRunner implements IRunner {


    @Override
    public void run() {
        System.out.println("Welcome the stacks");
        ArrayStack<Person> personArrayStack = new ArrayStack<Person>();
        personArrayStack.printStack();
        personArrayStack.push(new Person("John", 20));
        personArrayStack.push(new Person("Mary", 30));
        personArrayStack.push(new Person("Peter", 40));
        personArrayStack.printStack();
        System.out.println("1 Pop of the stack(Peter)----------------");
        var persona=personArrayStack.pop();
        personArrayStack.printStack();
        System.out.println("2 top of the stack(Mary)----------------");
        persona=personArrayStack.top();
        System.out.println(persona);
        System.out.println("3 Pop of the stack(Mary)----------------");
        persona=personArrayStack.pop();
        personArrayStack.printStack();

    }

    @Override
    public void printMenu() {

    }
}
