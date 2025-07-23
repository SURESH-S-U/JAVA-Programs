public class GraphMatrix {
    private int vertices;
    private int[][] adjMatrix;

    public GraphMatrix(int v) {
        vertices = v;
        adjMatrix = new int[vertices][vertices];
    }

    public void addEdge(int src, int dest, boolean directed) {
        adjMatrix[src][dest] = 1;
        if (!directed) {
            adjMatrix[dest][src] = 1;
        }
    }

    public int[] getInOutDegree(int v) {
        int in = 0, out = 0;
        for (int i = 0; i < vertices; i++) {
            if (adjMatrix[i][v] == 1) in++;
            if (adjMatrix[v][i] == 1) out++;
        }
        return new int[]{in, out};
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphMatrix g = new GraphMatrix(4);
        boolean isDirected = true;

        g.addEdge(0, 1, isDirected);
        g.addEdge(0, 2, isDirected);
        g.addEdge(1, 2, isDirected);
        g.addEdge(2, 3, isDirected);

        g.printGraph();

        System.out.println("\nInDegree and OutDegree:");
        for (int i = 0; i < 4; i++) {
            int[] degrees = g.getInOutDegree(i);
            System.out.println("Vertex " + i + ": InDegree = " + degrees[0] + ", OutDegree = " + degrees[1]);
        }
    }
}
