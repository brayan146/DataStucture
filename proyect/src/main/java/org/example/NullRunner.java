package org.example;

import org.example.interfaces.IRunner;

public class NullRunner implements IRunner {
    @Override
    public void run(){
        System.out.println("incorrect value");
    }
    public void printMenu(){
        System.out.println("menu");
    }
}
