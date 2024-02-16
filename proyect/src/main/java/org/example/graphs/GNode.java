package org.example.graphs;

public class GNode {
private String name;
    private int id;

    public GNode(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public GNode(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GNode{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
