package org.example.stacks;

import org.example.Main;


import java.util.Scanner;

public class StackMenu {
    private static int optionSelected;
    private StackHandler runner = new StackHandler(this);

    public void Menu() {
        System.out.println("Select an option ");
        System.out.println("1.-ArrayStack");
        System.out.println("2.-LinkedStack");
        System.out.println("3.-Exit");
        readOption();
        if (optionSelected == 1) {
            printSubMenu(optionSelected);
        }
        if (optionSelected == 2) {
           printSubMenu(optionSelected);
        }
        if (optionSelected == 3) {
            Main.main(null);
        }

    }
    public static void readOption() {
        System.out.println("Select an option ");
        Scanner option = new Scanner(System.in);
        while (!option.hasNextInt()) {
            System.out.println("Select an option: ");
            System.out.println("That's not a valid option!. Please enter a Integer.");
            option.next();
        }
        optionSelected = option.nextInt();
    }

    public void printSubMenu(int option) {
        do {
            System.out.println("1.-Push");
            System.out.println("2.-Pop");
            System.out.println("3.-top");
            System.out.println("4.-isEmpty");
            System.out.println("5.-Size");
            System.out.println("6.-Print");
            System.out.println("7.- Exit");
            readOption();
            if (optionSelected == 1) {
                runner.push(option);
            }
            if (optionSelected == 2) {
                runner.pop(option);
            }
            if (optionSelected == 3) {
                runner.top(option);
            }
            if (optionSelected == 4) {
                runner.isEmpty(option);
            }
            if (optionSelected == 5) {
                runner.size(option);
            }
            if (optionSelected == 6) {
                runner.printStack(option);
            }
            if (optionSelected == 7) {
                Menu();
            }
        } while (optionSelected < 1 || optionSelected > 7);
    }




}
