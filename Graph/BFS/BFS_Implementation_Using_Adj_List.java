import java.util.*;

public class BFS_Implementation_Using_Adj_List {
    
    private Map<String, ArrayList<String>> adjList;

    // Constructor
    public BFS_Implementation_Using_Adj_List() {
        adjList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an undirected edge between two vertices
    public void addEdge(String src, String dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // Perform BFS traversal from a given start node
    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        System.out.print("BFS Traversal starting from " + start + ": ");

        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BFS_Implementation_Using_Adj_List graph = new BFS_Implementation_Using_Adj_List();

        // Add vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        // Add edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");

        // Perform BFS
        graph.bfs("A");
    }
}
