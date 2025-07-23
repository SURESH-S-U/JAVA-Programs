public class UndirectedGraph {
    private int vertices;
    private int[][] adjMatrix;

    // Constructor
    public UndirectedGraph(int v) {
        vertices = v;
        adjMatrix = new int[vertices][vertices]; // Initializes all values to 0
    }

    // Add edge
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;             // Just remove this for make this Directed
    }

    // Print matrix
    public void printGraph() {
        System.out.println("Adjacency Matrix (Undirected):");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {
        UndirectedGraph g = new UndirectedGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.printGraph();
    }
}
