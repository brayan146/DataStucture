package org.example.graphs;

public class GEdge {
    private GNode start;
    private GNode end;
    private int weight;

    public GEdge(GNode start, GNode end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public GNode getSource() {
        return start;
    }

    public GNode getDestination() {
        return end;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "GEdge{" +
                "start=" + start +
                ", end=" + end +
                ", weight=" + weight +
                '}';
    }


}
