package org.example.linkedlists;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class LinkedListHandler {
    LinkedList<Integer> list = new LinkedList<Integer>();

    DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
    CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<Integer>();

    LinkedListMenu menu;
    public LinkedListHandler(LinkedListMenu menu) {
        this.menu = menu;
    }
    public void addFirst(int option){
        if (option == 1){
            System.out.println("Enter the number to add");
            Scanner number = new Scanner(System.in);
            while (!number.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                number.next();
            }
            int numberToAdd = number.nextInt();
            list.addFirst(numberToAdd);
            System.out.println("Added to the list");
            menu.printSubMenu(1);
        }
        if (option == 2){
            System.out.println("Enter the number to add");
            Scanner number = new Scanner(System.in);
            while (!number.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                number.next();
            }
            int numberToAdd = number.nextInt();
            doubleLinkedList.addFirst(numberToAdd);
            System.out.println("Added to the list ");
            menu.printSubMenu(2);
        }
        if (option == 3){
            System.out.println("Enter the number to add");
            Scanner number = new Scanner(System.in);
            while (!number.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                number.next();
            }
            int numberToAdd = number.nextInt();
            circularLinkedList.addFirst(numberToAdd);
            System.out.println("Added to the list ");
            menu.printSubMenu(3);
        }
    }
    public void addLast(int option){
        if (option == 1){
            System.out.println("Enter the number to add");
            Scanner number = new Scanner(System.in);
            while (!number.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                number.next();
            }
            int numberToAdd = number.nextInt();
            list.addLast(numberToAdd);
            menu.printSubMenu(1);
        }
        if (option == 2){
            System.out.println("Enter the number to add");
            Scanner number = new Scanner(System.in);
            while (!number.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                number.next();
                System.out.println("Added to the list");
            }
            int numberToAdd = number.nextInt();
            doubleLinkedList.addLast(numberToAdd);
            System.out.println("Added to the list");
            menu.printSubMenu(2);
        }
        if (option == 3){
            System.out.println("Enter the number to add");
            Scanner number = new Scanner(System.in);
            while (!number.hasNextInt()) {
                System.out.println("Enter the number to add: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                number.next();
            }
            int numberToAdd = number.nextInt();
            circularLinkedList.addLast(numberToAdd);
            System.out.println("Added to the list");
            menu.printSubMenu(3);
        }
    }

    public void removeFirst(int option){
        if (option == 1){
            list.removeFirst();
            System.out.println("Removed first element from the list");
            menu.printSubMenu(1);
        }
        if (option == 2){
            doubleLinkedList.removeFirst();
            System.out.println("Removed first element from the list");
            menu.printSubMenu(2);
        }
        if (option == 3){
            circularLinkedList.removeFirst();
            System.out.println("Removed first element from the list");
            menu.printSubMenu(3);
        }
    }

    public void isEmpty(int option){
        if (option == 1){
            System.out.println(list.isEmpty());
            menu.printSubMenu(1);
        }
        if (option == 2){
            System.out.println(doubleLinkedList.isEmpty());
            menu.printSubMenu(2);
        }
        if (option == 3){
            System.out.println(circularLinkedList.isEmpty());
            menu.printSubMenu(3);
        }
    }

    public void size(int option){
        if (option == 1){
            System.out.println(list.size());
            menu.printSubMenu(1);
        }
        if (option == 2){
            System.out.println(doubleLinkedList.size());
            menu.printSubMenu(2);
        }
        if (option == 3){
            System.out.println(circularLinkedList.size());
            menu.printSubMenu(3);
        }
    }

    public void print(int option){
        if (option == 1){
            list.print();
            System.out.println();
            menu.printSubMenu(1);
        }
        if (option == 2){
            doubleLinkedList.print();
            System.out.println();
            menu.printSubMenu(2);
        }
        if (option == 3){
            circularLinkedList.print();
            System.out.println();
            menu.printSubMenu(3);
        }
    }


}
