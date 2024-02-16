package org.example;

import org.example.interfaces.IRunner;

import java.util.Scanner;

public class PrincipalMenu {
    public void PrincipalMenu(){
        System.out.println("1. LinkedList");
        System.out.println("2. Stacks");
        System.out.println("3. Queues");
        System.out.println("4. Trees");
        System.out.println("5. Graphs");
        System.out.println("6. 1 Sorting(merge)");
        System.out.println("7. 2 Sorting(quick)");
        System.out.println("8. 3 Sorting(bubble)");
        System.out.println("9. Exit");
        int optionSelected;
        do{
            System.out.println("Select an option ");
            Scanner option = new Scanner(System.in);
            while (!option.hasNextInt()) {
                System.out.println("Select an option: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                option.next();
            }
            optionSelected = option.nextInt();
            IRunner manager = RunnerFactory.getManager(optionSelected);
            manager.run();
        }while (optionSelected < 1 || optionSelected > 9);
    }

}
