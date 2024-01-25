package org.example;

import java.util.Stack;

public class ManagerFactory {
    public static IManager getManager(int option){
        if(option == 1){
            return new LinkedListManager();
        } else if (option == 2) {
            //return new StackManager();
        }else if (option == 3) {
            //return new QuManager();
        }else if (option == 4) {
            //return new StackManager();
        }else if (option == 5) {
            //return new StackManager();
        }else if (option == 6) {
            //return new 1StackManager();
        }else if (option == 7) {
            //return new 2StackManager();
        }else if (option == 8) {
            //return new 3SortingManager();
        }/*else {
            System.out.println("option incorrect");
        }*/
        return new NullManager();
    }

}
