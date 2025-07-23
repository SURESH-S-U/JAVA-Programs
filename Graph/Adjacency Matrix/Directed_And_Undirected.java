public class Directed_And_Undirected {
    private int vertices;
    private int[][] adjMatrix;

    // Constructor
    public Directed_And_Undirected(int v) {
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
        Directed_And_Undirected g = new Directed_And_Undirected(4);
        g.addEdge(5, 2);
        g.addEdge(3, 5);
        g.addEdge(9, 5);
        g.addEdge(2, 3);

        g.printGraph();
    }
}
