package org.example.trees;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class BinaryTree implements IBinaryTrees{
    BTNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new BTNode(data);
    }
    @Override
    public void insert(int data) {
        root = insert(root, data);
    }

    @Override
    public boolean search(int data) {
        return search(root, data);
    }

    @Override
    public BTNode getRoot() {
        return root;
    }

    @Override
    public BTNode getNode(int data) {
        return getNode(root, data);
    }

    @Override
    public void delete(int data) {
        root = delete(root, data);

    }

    @Override
    public int[] inOrder() {
        int[] result = new int[size()];
        inOrder(root, result, 0);
        return result;
    }

    @Override
    public int[] preOrder() {
        int[] result = new int[size()];
        preOrder(root, result, 0);
        return result;
    }


    @Override
    public int[] postOrder() {
        int[] result = new int[size()];
        postOrder(root, result, 0);
        return result;
    }


    @Override
    public int height() {
        return height(root);
    }

    @Override
    public int size() {
        return getSize(root);
    }

    @Override
    public void print() {
        System.out.println("InOrder");
        int[] result = inOrder();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println("PreOrder");
        result = preOrder();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        System.out.println("PostOrder");
        result = postOrder();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private BTNode insert(BTNode root, int data) {
        if (root == null) {
            return new BTNode(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    private int getSize(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }

    public boolean search(BTNode root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }

    }
    
    private BTNode getNode(BTNode root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            return root;
        }
        if (data < root.data) {
            return getNode(root.left, data);
        } else {
            return getNode(root.right, data);
        }
    }
    
    private BTNode delete(BTNode root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }


    private int minValue(BTNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inOrder(BTNode root, int[] result, int index) {
        if (root == null) {
            return;
        }
        inOrder(root.left, result, index);
        result[index +getSize(root.left)] = root.data;
        inOrder(root.right, result, index + getSize(root.left)  + 1 );
    }

    /*public void inOrder(BTNode root, int[] result, int index) {
        if (root == null) {
            return;
        }
        int leftSize = getSize(root.left);
        inOrder(root.left, result, index);
        result[index + leftSize] = root.data;
        inOrder(root.right, result, index + leftSize + 1);
    }*/


    public void preOrder(BTNode root, int[] result, int index) {
        if (root == null) {
            return;
        }
        result[index] = root.data;
        preOrder(root.left, result, index + 1);
        preOrder(root.right, result, index + 1 + getSize(root.left));
    }


    public void postOrder(BTNode root, int[] result, int index) {
        if (root == null) {
            return;
        }
        postOrder(root.left, result, index);
        postOrder(root.right, result, index + getSize(root.left));
        result[index + getSize(root.left) + getSize(root.right)] = root.data;
    }




    public int height(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }


    
    
    
}
