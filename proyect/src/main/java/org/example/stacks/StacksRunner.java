package org.example.stacks;

import org.example.Person;
import org.example.interfaces.IRunner;

public class StacksRunner implements IRunner {


    @Override
    public void run() {

        StackMenu stackMenu = new StackMenu();
        stackMenu.Menu();
    }


}
