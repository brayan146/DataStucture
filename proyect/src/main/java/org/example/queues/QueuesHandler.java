package org.example.queues;

import java.util.Scanner;

public class QueuesHandler {
    QueuesMenu menu;
    ArrayQueue arrayQueue = new ArrayQueue();
    DeQueue deQueue = new DeQueue();

    public QueuesHandler(QueuesMenu menu) {
        this.menu = menu;
    }
    public void enQueue(int option) {
        System.out.println("Enter a value to add to the queue");
        Scanner number = new Scanner(System.in);
        while (!number.hasNextInt()) {
            System.out.println("Enter the number to add: ");
            System.out.println("That's not a valid option!. Please enter a Integer.");
            number.next();
        }
        int numberToAdd = number.nextInt();
        if (option == 1) {
            arrayQueue.enQueue(numberToAdd);
        } else {
            System.out.println("add number 1.-first or 2.-last");
            Scanner optionToAdd = new Scanner(System.in);
            while (!optionToAdd.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                optionToAdd.next();
            }
            int optionSelected = optionToAdd.nextInt();
            if (optionSelected == 1) {
                deQueue.addFirst(numberToAdd);
            } else {
                deQueue.addLast(numberToAdd);
            }
        }
        menu.printSubMenu(option);
    }
public void deQueue(int option) {
        System.out.println("DeQueue of the queue----------------");
        if (option == 1) {
            arrayQueue.deQueue();
        } else {
            System.out.println("remove 1.-first or 2.-last");
            Scanner optionToAdd = new Scanner(System.in);
            while (!optionToAdd.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                optionToAdd.next();
            }
            int optionSelected = optionToAdd.nextInt();
            if (optionSelected == 1) {
                deQueue.removeFirst();
            } else {
                deQueue.removeLast();
            }
        }
        menu.printSubMenu(option);
    }
    public void first(int option) {
        System.out.println("First of the queue----------------");
        if (option == 1) {
            arrayQueue.first();
        } else {
            deQueue.first();
        }
        menu.printSubMenu(option);
    }
    public void isEmpty(int option) {
        System.out.println("isEmpty of the queue----------------");
        if (option == 1) {
            arrayQueue.isEmpty();
        } else {
            deQueue.isEmpty();
        }
        menu.printSubMenu(option);
    }
    public void size(int option) {
        System.out.println("Size of the queue----------------");
        if (option == 1) {
            System.out.println(arrayQueue.size());
        } else {
            System.out.println(deQueue.size());
        }
        menu.printSubMenu(option);
    }


}
