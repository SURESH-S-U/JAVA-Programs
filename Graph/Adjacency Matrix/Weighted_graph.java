public class WeightedGraphMatrix {
    private int vertices;
    private int[][] adjMatrix;

    public WeightedGraphMatrix(int v) {
        vertices = v;
        adjMatrix = new int[v][v];

        // Initialize with 0 or INF if you want to handle no edge differently
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                adjMatrix[i][j] = 0; // or Integer.MAX_VALUE for no edge
            }
        }
    }

    public void addEdge(int src, int dest, int weight, boolean directed) {
        adjMatrix[src][dest] = weight;
        if (!directed) {
            adjMatrix[dest][src] = weight;
        }
    }

    public void printGraph() {
        System.out.println("Weighted Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        WeightedGraphMatrix g = new WeightedGraphMatrix(4);
        boolean isDirected = false;

        g.addEdge(0, 1, 4, isDirected);
        g.addEdge(0, 2, 2, isDirected);
        g.addEdge(1, 2, 5, isDirected);
        g.addEdge(2, 3, 1, isDirected);
        g.addEdge(3, 0, 7, isDirected);

        g.printGraph();
    }
}
