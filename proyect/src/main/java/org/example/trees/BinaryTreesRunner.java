package org.example.trees;

import org.example.interfaces.IRunner;

public class BinaryTreesRunner implements IRunner {

    @Override
    public void run() {
        BinaryTreeMenu menu = new BinaryTreeMenu();
        menu.Menu();
    }



}
