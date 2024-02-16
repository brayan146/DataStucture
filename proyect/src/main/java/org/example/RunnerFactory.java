package org.example;

import org.example.Sorts.BubbleSortRunner;
import org.example.Sorts.MergeSortRunner;
import org.example.Sorts.QuickSortRunner;
import org.example.graphs.GraphRunner;
import org.example.interfaces.IRunner;
import org.example.linkedlists.LinkedListRunner;
import org.example.queues.QueuesRunner;
import org.example.stacks.StacksRunner;
import org.example.trees.BinaryTreesRunner;

import javax.print.DocFlavor;

public class RunnerFactory {
    public static IRunner getManager(int option) {
        if (option == 1) {
            return new LinkedListRunner();
        } else if (option == 2) {
            return new StacksRunner();
        } else if (option == 3) {
            return new QueuesRunner();
        } else if (option == 4) {
            return new BinaryTreesRunner();
        } else if (option == 5) {
            return new GraphRunner();
        } else if (option == 6) {
             return new MergeSortRunner();
        } else if (option == 7) {
            return new QuickSortRunner();
        } else if (option == 8) {
            return new BubbleSortRunner();
        }  else if (option == 9) {
            System.exit(0);
        }

        return new NullRunner();
    }

}
