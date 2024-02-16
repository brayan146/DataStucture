package org.example.graphs;

import java.util.Scanner;

public class GraphHandler {
    private final GraphMenu graphMenu;
    public GraphHandler(GraphMenu graphMenu) {
        this.graphMenu = graphMenu;
    }
    Graph graph = new Graph();

    public void getNumberOfVertices() {
        System.out.println(graph.getNumberOfVertices());
    }
    public void getVertices() {
        System.out.println(graph.getVertices());
    }
    public void getNumberOfEdges() {
        System.out.println(graph.getNumberOfEdges());
    }
    public void getEdge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source: ");
        GNode source = new GNode(scanner.nextInt());
        System.out.println("Enter the destination: ");
        GNode destination = new GNode(scanner.nextInt());
        System.out.println(graph.getEdge(source, destination));
        if (graph.getEdge(source, destination) == null) {
            System.out.println("There is no edge between those nodes");
        }
    }
    public void outDegree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the node: ");
        GNode node = new GNode(scanner.nextInt());
        System.out.println(graph.outDegree(node));
        if (graph.outDegree(node) == 0) {
            System.out.println("There is no edge between those nodes");
        }
    }
    public void inDegree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the node: ");
        GNode node = new GNode(scanner.nextInt());
        System.out.println(graph.inDegree(node));
    }
    public void outgoingEdges() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the node: ");
        GNode node = new GNode(scanner.nextInt());
        System.out.println(graph.outgoingEdges(node));
        if (graph.outgoingEdges(node)==null) {
            System.out.println("There is no edge between those nodes");
        }
    }
    public void incomingEdges() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the node: ");
        GNode node = new GNode(scanner.nextInt());
        System.out.println(graph.incomingEdges(node));
        if (graph.incomingEdges(node)==null) {
            System.out.println("There is no edge between those nodes");
        }
    }
    public void addNode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the node: ");
        GNode node = new GNode(scanner.nextInt());
        graph.addNode(node);
    }
    public void addEdge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source: ");
        GNode source = new GNode(scanner.nextInt());
        System.out.println("Enter the destination: ");
        GNode destination = new GNode(scanner.nextInt());
        System.out.println("Enter the weight: ");
        int weight = scanner.nextInt();
        graph.addEdge(source, destination, weight);
        if (graph.getEdge(source, destination) == null) {
            System.out.println("There is no edge between those nodes");
        }
        if (graph.getEdge(source, destination).getWeight() != weight) {
            System.out.println("The weight is not the same");
        }
        if (graph.getEdge(source, destination).getSource() != source) {
            System.out.println("The source is not the same");
        }
        if (graph.getEdge(source, destination).getDestination() != destination) {
            System.out.println("The destination is not the same");
        }

    }
    public void removeNode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the node: ");
        GNode node = new GNode(scanner.nextInt());
        graph.removeNode(node);
        if (graph.getEdge(node, node) != null) {
            System.out.println("The node was not removed");
        }


    }
    public void removeEdge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source: ");
        GNode source = new GNode(scanner.nextInt());
        System.out.println("Enter the destination: ");
        GNode destination = new GNode(scanner.nextInt());
        graph.removeEdge(graph.getEdge(source, destination));
        if (graph.getEdge(source, destination) != null) {
            System.out.println("The edge was not removed");
        }
    }

}
