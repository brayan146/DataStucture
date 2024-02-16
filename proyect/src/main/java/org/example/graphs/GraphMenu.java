package org.example.graphs;

import org.example.Main;

import java.util.Scanner;

public class GraphMenu {
    GraphHandler graph = new GraphHandler(this);
    private static int optionSelected;

    public void Menu() {
        System.out.println("Graph Menu");
        System.out.println("1. getNumberOfVertices");
        System.out.println("2. getVertices");
        System.out.println("3. getNumberOfEdges");
        System.out.println("4. getEdge");
        System.out.println("5. outDegree");
        System.out.println("6. inDegree");
        System.out.println("7. outgoingEdges");
        System.out.println("8. incomingEdges");
        System.out.println("9. addNode");
        System.out.println("10. addEdge");
        System.out.println("11. removeNode");
        System.out.println("12. removeEdge");
        System.out.println("13. Exit");

        readOption();
        if (optionSelected == 1) {
            graph.getNumberOfVertices();
            Menu();
        }
        if (optionSelected == 2) {
            graph.getVertices();
            Menu();
        }
        if (optionSelected == 3) {
            graph.getNumberOfEdges();
            Menu();
        }
        if (optionSelected == 4) {
            graph.getEdge();
            Menu();
        }
        if (optionSelected == 5) {
            graph.outDegree();
            Menu();
        }
        if (optionSelected == 6) {
            graph.inDegree();
            Menu();
        }
        if (optionSelected == 7) {
            graph.outgoingEdges();
            Menu();
        }
        if (optionSelected == 8) {
            graph.incomingEdges();
            Menu();
        }
        if (optionSelected == 9) {
            graph.addNode();
            Menu();
        }
        if (optionSelected == 10) {
            graph.addEdge();
            Menu();
        }
        if (optionSelected == 11) {
                graph.removeNode();
                Menu();
        }
        if (optionSelected == 12) {
                graph.removeEdge();
                Menu();
        }

        if (optionSelected == 13) {
            Main.main(null);
        }



    }
    public static void readOption() {
        System.out.println("Select an option ");
        Scanner option = new Scanner(System.in);
        while (!option.hasNextInt()) {
            System.out.println("Select an option: ");
            System.out.println("That's not a valid option!. Please enter a Integer.");
            option.next();
        }
        optionSelected = option.nextInt();
    }
}
