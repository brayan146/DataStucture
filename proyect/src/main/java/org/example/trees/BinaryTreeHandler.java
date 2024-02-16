package org.example.trees;

import java.util.Scanner;

public class BinaryTreeHandler {
    private final BinaryTreeMenu binaryTreeMenu;
    public BinaryTreeHandler(BinaryTreeMenu binaryTreeMenu) {
        this.binaryTreeMenu = binaryTreeMenu;
    }
    BinaryTree binaryTree = new BinaryTree();

    public void Insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to insert: ");
        int value = scanner.nextInt();
        binaryTree.insert(value);
    }
    public void Delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to delete: ");
        int value = scanner.nextInt();
        binaryTree.delete(value);
    }
    public void Search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to search: ");
        int value = scanner.nextInt();
        System.out.println(binaryTree.search(value));
    }
    public void Height() {
        System.out.println(binaryTree.height());
    }
    public void Size() {
        System.out.println(binaryTree.size());
    }
    public void Print() {
            binaryTree.print();
    }

}
