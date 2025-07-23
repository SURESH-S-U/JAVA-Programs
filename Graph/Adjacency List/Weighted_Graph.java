import java.util.*;

public class WeightedGraphList {
    static class Edge {
        String dest;
        int weight;

        Edge(String d, int w) {
            dest = d;
            weight = w;
        }
    }

    private Map<String, ArrayList<Edge>> adjList;

    public WeightedGraphList() {
        adjList = new HashMap<>();
    }

    public void addVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(String src, String dest, int weight, boolean directed) {
        addVertex(src);
        addVertex(dest);
        adjList.get(src).add(new Edge(dest, weight));
        if (!directed) {
            adjList.get(dest).add(new Edge(src, weight));
        }
    }

    public void printGraph() {
        System.out.println("Weighted Adjacency List:");
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + ":");
            for (Edge edge : adjList.get(vertex)) {
                System.out.print(" -> (" + edge.dest + ", " + edge.weight + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WeightedGraphList g = new WeightedGraphList();
        boolean isDirected = false;

        g.addEdge("A", "B", 4, isDirected);
        g.addEdge("A", "C", 2, isDirected);
        g.addEdge("B", "C", 5, isDirected);
        g.addEdge("C", "D", 1, isDirected);
        g.addEdge("D", "A", 7, isDirected);

        g.printGraph();
    }
}
