package org.example.linkedlists;

import org.example.Main;

import java.util.Scanner;

public class LinkedListMenu {
    private int optionSelected;
    LinkedListHandler runner;

    public LinkedListMenu() {
        this.runner = new LinkedListHandler(this);
    }

    public void printMenu() {
        do {
            System.out.println("1.-LinkedList");
            System.out.println("2.-DoubleLinkedList");
            System.out.println("3.-CircularLinkedList");
            System.out.println("4.- Exit");
            System.out.println("Select an option ");
            Scanner option = new Scanner(System.in);
            while (!option.hasNextInt()) {
                System.out.println("Select an option: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                option.next();
            }
            optionSelected = option.nextInt();
            if (optionSelected == 1) {
                printSubMenu(optionSelected);
            }
            if (optionSelected == 2) {
                printSubMenu(optionSelected);
            }
            if (optionSelected == 3) {
                printSubMenu(optionSelected);
            }
            if (optionSelected == 4) {
                Main.main(null);
            }
        } while (optionSelected < 1 || optionSelected > 4);
    }
    public void printSubMenu(int option) {
        do {
            System.out.println("1.-Addfirst");
            System.out.println("2.-Addlast");
            System.out.println("3.-Remove");
            System.out.println("4.-isEmpty");
            System.out.println("5.-Size");
            System.out.println("6.-Print");
            System.out.println("7.- Exit");
            System.out.println("Select an option ");
            Scanner option1 = new Scanner(System.in);
            while (!option1.hasNextInt()) {
                System.out.println("Select an option: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                option1.next();
            }
            optionSelected = option1.nextInt();
            if (optionSelected == 1) {
                runner.addFirst(option);
            }
            if (optionSelected == 2) {
                runner.addLast(option);
            }
            if (optionSelected == 3) {
                runner.removeFirst(option);
            }
            if (optionSelected == 4) {
                runner.isEmpty(option);
            }
            if (optionSelected == 5) {
                runner.size(option);
            }
            if (optionSelected == 6) {
                runner.print(option);
            }
            if (optionSelected == 7) {
                printMenu();
            }
        } while (optionSelected < 1 || optionSelected > 7);
    }
}
