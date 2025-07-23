import java.util.*;

public class GraphMap {
    private Map<String, List<String>> adjList;

    public GraphMap() {
        adjList = new HashMap<>();
    }

    // Add a vertex if it doesn't exist
    public void addVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    // Add an edge (directed or undirected)
    public void addEdge(String src, String dest, boolean directed) {
        addVertex(src);
        addVertex(dest);
        adjList.get(src).add(dest);
        if (!directed) {
            adjList.get(dest).add(src);
        }
    }

    // Get in-degree and out-degree
    public int[] getInOutDegree(String vertex) {
        int in = 0;
        int out = adjList.getOrDefault(vertex, new ArrayList<>()).size();

        for (String key : adjList.keySet()) {
            for (String neighbor : adjList.get(key)) {
                if (neighbor.equals(vertex)) {
                    in++;
                }
            }
        }
        return new int[]{in, out};
    }

    // Print the adjacency list
    public void printGraph() {
        System.out.println("Adjacency List:");
        for (String key : adjList.keySet()) {
            System.out.print(key + ":");
            for (String neighbor : adjList.get(key)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        GraphMap g = new GraphMap();
        boolean isDirected = true;

        g.addEdge("A", "B", isDirected);
        g.addEdge("A", "C", isDirected);
        g.addEdge("B", "C", isDirected);
        g.addEdge("C", "D", isDirected);

        g.printGraph();

        System.out.println("\nInDegree and OutDegree:");
        for (String vertex : List.of("A", "B", "C", "D")) {
            int[] degrees = g.getInOutDegree(vertex);
            System.out.println("Vertex " + vertex + ": InDegree = " + degrees[0] + ", OutDegree = " + degrees[1]);
        }
    }
}
