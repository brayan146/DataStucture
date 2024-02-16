package org.example.queues;

import org.example.Main;


import java.util.Scanner;

public class QueuesMenu {
    private static int optionSelected;
    QueuesHandler runner = new QueuesHandler(this);
    public void menu(){
        System.out.println("Queues Menu");
        System.out.println("1.-ArrayQueue");
        System.out.println("2.-DeQueue");
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
            System.out.println("1.-EnQueue");
            System.out.println("2.-DeQueue");
            System.out.println("3.-First");
            System.out.println("4.-isEmpty");
            System.out.println("5.-Size");
            System.out.println("6.- Exit");
            readOption();
            if (optionSelected == 1) {
                runner.enQueue(option);
            }
            if (optionSelected == 2) {
                runner.deQueue(option);
            }
            if (optionSelected == 3) {
                runner.first(option);
            }
            if (optionSelected == 4) {
                runner.isEmpty(option);
            }
            if (optionSelected == 5) {
                runner.size(option);
            }
            if (optionSelected == 6) {
                menu();
            }
        } while (optionSelected != 7);
    }






}
