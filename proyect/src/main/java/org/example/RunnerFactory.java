package org.example;

import org.example.interfaces.IRunner;
import org.example.linkedlists.LinkedListRunner;
import org.example.stacks.StacksRunner;

public class RunnerFactory {
    public static IRunner getManager(int option){
        if(option == 1){
            return new LinkedListRunner();
        } else if (option == 2) {
            return new StacksRunner();
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
        return new NullRunner();
    }

}
