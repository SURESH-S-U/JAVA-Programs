import java.util.*;

public class CharAdjacencyMatrix {
    private int[][] adjMatrix;
    private Map<Character, Integer> charToIndex;
    private int size;

    public CharAdjacencyMatrix(int maxVertices) {
        adjMatrix = new int[maxVertices][maxVertices];
        charToIndex = new HashMap<>();
        size = 0;
    }

    // Add vertex if not already present
    public void addVertex(char vertex) {
        if (!charToIndex.containsKey(vertex)) {
            charToIndex.put(vertex, size++);
        }
    }

    // Add edge between two vertices
    public void addEdge(char from, char to) {
        addVertex(from);
        addVertex(to);

        int i = charToIndex.get(from);
        int j = charToIndex.get(to);
        adjMatrix[i][j] = 1;  // for directed graph
        // adjMatrix[j][i] = 1;  // for undirected graph
    }

    // Print adjacency matrix
    public void printMatrix() {
        System.out.print("  ");
        for (char ch : charToIndex.keySet()) {
            System.out.print(ch + " ");
        }
        System.out.println();

        for (char rowChar : charToIndex.keySet()) {
            System.out.print(rowChar + " ");
            int i = charToIndex.get(rowChar);                  // For gat the index
            for (char colChar : charToIndex.keySet()) {
                int j = charToIndex.get(colChar);              // For get the index
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        CharAdjacencyMatrix graph = new CharAdjacencyMatrix(26);  // support for 26 letters

        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('C', 'D');
        graph.addEdge('D', 'E');

        graph.printMatrix();
    }
}
