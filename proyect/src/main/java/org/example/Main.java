package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("welcome");
        System.out.println("1. LinkedList");
        System.out.println("2. Stacks");
        System.out.println("3. Queues");
        System.out.println("4. Trees");
        System.out.println("5. Graphs");
        System.out.println("6. 1 Sorting");
        System.out.println("7. 2 Sorting");
        System.out.println("8. 3 Sorting");
        int optionSelected;
        do{
            System.out.println("Select an option ");
            Scanner option = new Scanner(System.in);
            while (!option.hasNextInt()) {
                System.out.println("Select an option: ");
                System.out.println("That's not a valid option!. Please enter a Integer.");
                option.next(); // this is important!
            }
            optionSelected = option.nextInt();
           // if (optionSelected == 1){
                IManager manager = ManagerFactory.getManager(optionSelected);
                manager.run();

            //}else{
              //  System.out.println("Invalid option");
            //}
        }while (optionSelected < 1 || optionSelected > 8);
    }
}