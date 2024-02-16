package org.example.trees;

import org.example.Main;

import java.util.Scanner;

public class BinaryTreeMenu {
    BinaryTreeHandler binaryTreeHandler = new BinaryTreeHandler(this);
    private static int optionSelected;

    public void Menu() {

        System.out.println("Binary Tree Menu");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("5. Height");
        System.out.println("6. size");
        System.out.println("7. Print");
        System.out.println("8. Exit");
        readOption();
        if (optionSelected == 1) {
            binaryTreeHandler.Insert();
            Menu();
        }
        if (optionSelected == 2) {
            binaryTreeHandler.Delete();
            Menu();
        }
        if (optionSelected == 3) {
            binaryTreeHandler.Search();
            Menu();
        }
        if (optionSelected == 4) {
            binaryTreeHandler.Height();
            Menu();
        }
        if (optionSelected == 6) {
            binaryTreeHandler.Size();
            Menu();
        }
        if (optionSelected == 7) {
            binaryTreeHandler.Print();
            System.out.println();
            Menu();
        }
        if (optionSelected == 8) {
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
}
