import org.example.graphs.GEdge;
import org.example.graphs.Graph;
import org.example.graphs.GNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GraphTests {

    @Test
    public void GetNumberOfVertices() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        GNode nodeC = new GNode("C", 3);
        GNode nodeD = new GNode("D", 4);
        GNode nodeE = new GNode("E", 5);
        GNode nodeF = new GNode("F", 6);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeA, nodeC, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeC, nodeE, 1);
        graph.addEdge(nodeD, nodeF, 1);
        graph.addEdge(nodeE, nodeF, 1);

        int result = graph.getNumberOfVertices();
        Assertions.assertEquals(6, result);
    }

    @Test
    public void GetNumberOfEdges() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        GNode nodeC = new GNode("C", 3);
        GNode nodeD = new GNode("D", 4);
        GNode nodeE = new GNode("E", 5);
        GNode nodeF = new GNode("F", 6);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeA, nodeC, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeC, nodeE, 1);
        graph.addEdge(nodeD, nodeF, 1);
        graph.addEdge(nodeE, nodeF, 1);

        int result = graph.getNumberOfEdges();
        Assertions.assertEquals(6, result);
    }
    @Test
    public void GetEdge() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        GNode nodeC = new GNode("C", 3);
        GNode nodeD = new GNode("D", 4);
        GNode nodeE = new GNode("E", 5);
        GNode nodeF = new GNode("F", 6);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeA, nodeC, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeC, nodeE, 1);
        graph.addEdge(nodeD, nodeF, 1);
        graph.addEdge(nodeE, nodeF, 1);

        GNode result = graph.getEdge(nodeA, nodeB).getDestination();
        Assertions.assertEquals(nodeB, result);
    }
    @Test
    public void OutDegree() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        GNode nodeC = new GNode("C", 3);
        GNode nodeD = new GNode("D", 4);
        GNode nodeE = new GNode("E", 5);
        GNode nodeF = new GNode("F", 6);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeA, nodeC, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeC, nodeE, 1);
        graph.addEdge(nodeD, nodeF, 1);
        graph.addEdge(nodeE, nodeF, 1);

        int result = graph.outDegree(nodeA);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void InDegree() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        GNode nodeC = new GNode("C", 3);
        GNode nodeD = new GNode("D", 4);
        GNode nodeE = new GNode("E", 5);
        GNode nodeF = new GNode("F", 6);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeA, nodeC, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeC, nodeE, 1);
        graph.addEdge(nodeD, nodeF, 1);
        graph.addEdge(nodeE, nodeF, 1);

        int result = graph.inDegree(nodeF);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void OutgoingEdges() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        GNode nodeC = new GNode("C", 3);
        GNode nodeD = new GNode("D", 4);
        GNode nodeE = new GNode("E", 5);
        GNode nodeF = new GNode("F", 6);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeA, nodeC, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeC, nodeE, 1);
        graph.addEdge(nodeD, nodeF, 1);
        graph.addEdge(nodeE, nodeF, 1);

        GEdge[] result = graph.outgoingEdges(nodeA);
        Assertions.assertEquals(2, result.length);
    }
    @Test
    public void IncomingEdges() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        GNode nodeC = new GNode("C", 3);
        GNode nodeD = new GNode("D", 4);
        GNode nodeE = new GNode("E", 5);
        GNode nodeF = new GNode("F", 6);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph.addEdge(nodeA, nodeB, 1);
        graph.addEdge(nodeA, nodeC, 1);
        graph.addEdge(nodeB, nodeD, 1);
        graph.addEdge(nodeC, nodeE, 1);
        graph.addEdge(nodeD, nodeF, 1);
        graph.addEdge(nodeE, nodeF, 1);

        GEdge[] result = graph.incomingEdges(nodeF);
        Assertions.assertEquals(2, result.length);
    }
    @Test
    public void AddNode() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        graph.addNode(nodeA);
        GNode[] result = graph.getVertices();
        Assertions.assertEquals(1, result.length);
    }
    @Test
    public void AddEdge() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addEdge(nodeA, nodeB, 1);
        GEdge[] result = graph.getEdges();
        Assertions.assertEquals(1, result.length);
    }
    @Test
    public void RemoveNode() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        graph.addNode(nodeA);
        graph.removeNode(nodeA);
        GNode[] result = graph.getVertices();
        Assertions.assertEquals(0, result.length);
    }
    @Test
    public void RemoveEdge() {
        Graph graph = new Graph();
        GNode nodeA = new GNode("A", 1);
        GNode nodeB = new GNode("B", 2);
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addEdge(nodeA, nodeB, 1);
        graph.removeEdge(graph.getEdge(nodeA, nodeB));
        GEdge[] result = graph.getEdges();
        Assertions.assertEquals(0, result.length);
    }


}
