package org.example.linkedlists;

import org.example.Person;
import org.example.interfaces.IRunner;

public class LinkedListRunner implements IRunner {
@Override
    public void run(){
        System.out.println("Welcome the linkedList");
        Node<String> first = new Node<>("first");
        Node<Person> second = new Node<Person>(new Person("John", 20));
        Node<Person> secondo = new Node<Person>(new Person());
        DoubleEdgeNode<Person> third = new DoubleEdgeNode<Person>(new Person("Mary", 30));
        LinkedList<String> stringLinkedList = new LinkedList<>();
        System.out.println("Size: " + stringLinkedList.size());
        System.out.println("isEmpty: " + stringLinkedList.isEmpty());
        stringLinkedList.addFirst("first");
        stringLinkedList.addLast("second");
        stringLinkedList.print();

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
