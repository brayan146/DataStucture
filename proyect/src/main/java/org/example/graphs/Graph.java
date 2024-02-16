package org.example.graphs;

import java.util.*;

public class Graph implements IGraphs{
    private List<GNode> nodes;
    private Map<GNode, List<GEdge>> edges;

    public Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new HashMap<>();
    }

    public Graph(GNode[] nodes, GEdge[] edges) {
        this();
        this.nodes.addAll(Arrays.asList(nodes));
        for (GEdge edge : edges) {
            addEdge(edge.getSource(), edge.getDestination(), edge.getWeight());
        }
    }

    public Graph(GNode[] nodes) {
        this();
        this.nodes.addAll(Arrays.asList(nodes));
    }


    @Override
    public int getNumberOfVertices() {
        return nodes.size();
    }

    @Override
    public GNode[] getVertices() {
        return nodes.toArray(new GNode[0]);
    }

    @Override
    public int getNumberOfEdges() {
        return edges.values().stream().mapToInt(List::size).sum();
    }

    @Override
    public GEdge[] getEdges() {
        return edges.values().stream().flatMap(List::stream).toArray(GEdge[]::new);
    }

    @Override
    public GEdge getEdge(GNode source, GNode destination) {
        return edges.get(source).stream().filter(edge -> edge.getDestination().equals(destination)).findFirst().orElse(null);
    }

    @Override
    public int outDegree(GNode node) {
        return edges.get(node).size();
    }

    @Override
    public int inDegree(GNode node) {
        return (int) edges.values().stream().flatMap(List::stream).filter(edge -> edge.getDestination().equals(node)).count();
    }

    @Override
    public GEdge[] outgoingEdges(GNode node) {
        return edges.get(node).toArray(new GEdge[0]);
    }

    @Override
    public GEdge[] incomingEdges(GNode node) {
        return edges.values().stream().flatMap(List::stream).filter(edge -> edge.getDestination().equals(node)).toArray(GEdge[]::new);
    }

    @Override
    public void addNode(GNode node) {
        nodes.add(node);
        edges.put(node, new ArrayList<>());
    }

    @Override
    public void addEdge(GNode source, GNode destination, int weight) {
        edges.get(source).add(new GEdge(source, destination, weight));
    }

    @Override
    public void removeNode(GNode node) {
        nodes.remove(node);
        edges.remove(node);
    }

    @Override
    public void removeEdge(GEdge edge) {
        edges.get(edge.getSource()).remove(edge);
    }

    @Override
    public void isEmpty() {
        if (nodes.isEmpty()) {
            System.out.println("The graph is empty");
        } else {
            System.out.println("The graph is not empty");
        }

    }

    public void print() {
        System.out.println("Graph");
        for (GNode node : nodes) {
            System.out.println(node);
            for (GEdge edge : edges.get(node)) {
                System.out.print(edge);
            }
        }
    }

}