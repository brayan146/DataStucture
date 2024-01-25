package org.example;

public class NullManager implements IManager{
    @Override
    public void run(){
        System.out.println("incorrect value");
    }
    public void printMenu(){
        System.out.println("emenu");
    }
}
