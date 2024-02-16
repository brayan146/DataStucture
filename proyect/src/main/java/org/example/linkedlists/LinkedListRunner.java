package org.example.linkedlists;

import org.example.Person;
import org.example.RunnerFactory;
import org.example.interfaces.IRunner;
import java.util.Scanner;


public class LinkedListRunner implements IRunner {



@Override
    public void run(){
    LinkedListMenu linkedListMenu = new LinkedListMenu();
    linkedListMenu.printMenu();
    }


}
