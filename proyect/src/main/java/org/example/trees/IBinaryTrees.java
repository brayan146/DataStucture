package org.example.trees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface IBinaryTrees {

    void insert(int data);
    boolean search(int data);
    BTNode getRoot();
    BTNode getNode(int data);
    void delete(int data);
    int []inOrder();
    int [] preOrder();
    int [] postOrder();

    int height();
    int size();

    void print();

}
