package org.example;

public class LinkedListManager implements IManager{
@Override
    public void run(){
        System.out.println("Welcome the linkedList");
    }
    @Override
    public void printMenu(){
        System.out.println("1.- Add");
        System.out.println("2.- Remove");
        System.out.println("3.- Search");
        System.out.println("4.- Print");
        System.out.println("5.- Exit");

    }
}
