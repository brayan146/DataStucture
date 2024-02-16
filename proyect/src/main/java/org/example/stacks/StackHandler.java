package org.example.stacks;

import java.util.Scanner;

public class StackHandler {
    StackMenu stackMenu;
    ArrayStack stack = new ArrayStack();
    LinkedListStack<Integer> linkedListStack = new LinkedListStack<Integer>();

    public StackHandler(StackMenu stackMenu) {
        this.stackMenu = stackMenu;
    }

    public void push(int option) {
        System.out.println("Enter the number to push");
        Scanner number = new Scanner(System.in);
        while (!number.hasNextInt()) {
            System.out.println("Enter the number to push: ");
            System.out.println("That's not a valid option!. Please enter a Integer.");
            number.next();
        }
        int numberToAdd = number.nextInt();
        if (option == 1) {
            stack.push(numberToAdd);
        } else {
            linkedListStack.push(numberToAdd);
        }
        stackMenu.printSubMenu(option);
    }
    public void pop(int option) {
      System.out.println("Pop of the stack----------------");
        if (option == 1) {
            stack.pop();
        } else {
            linkedListStack.pop();
        }
        stackMenu.printSubMenu(option);

    }
    public void top(int option) {
        System.out.println("Top of the stack----------------");
        if (option == 1) {
            stack.top();
        } else {
            linkedListStack.top();
        }
        stackMenu.printSubMenu(option);
    }
    public void printStack(int option) {
        System.out.println("Print of the stack----------------");
        if (option == 1) {
            stack.printStack();
            System.out.println(" ");
        } else {
            linkedListStack.printStack();
            System.out.println(" ");
        }
        stackMenu.printSubMenu(option);
    }
    public void size(int option) {
        System.out.println("Size of the stack----------------");
        if (option == 1) {
            System.out.println(stack.size());
        } else {
            System.out.println(linkedListStack.size());
        }
        stackMenu.printSubMenu(option);
    }
    public void isEmpty(int option) {
        if (option == 1) {
            stack.isEmpty();
        } else {
            linkedListStack.isEmpty();
        }
        stackMenu.printSubMenu(option);
    }

}
