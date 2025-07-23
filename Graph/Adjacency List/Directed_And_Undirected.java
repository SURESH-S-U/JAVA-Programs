import java.util.*;          // There is many Ways to Implement  Adjacency  List.

public class Graph {
    private Map<String, ArrayList<String>> adjList;     // ArrayList inside map. Pass Vertex as Key. Connected List of Vertices as Values.

    // Constructor
    public Graph() {
        adjList = new HashMap<>();
    }

    // Add a vertex
    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge (undirected)
    public void addEdge(String src, String dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());  //  Just remove this line to make as Directed graph.
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // Just remove this line for directed graph
    }

    // Print the graph
    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + ":");
            for (String neighbor : adjList.get(vertex)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "D");
        g.addEdge("D", "E");

        g.printGraph();
    }
}
