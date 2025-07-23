import java.util.*;

public class GraphDFS {
    private Map<String, ArrayList<String>> adjList;

    public GraphDFS() {
        adjList = new HashMap<>();
    }

    // Add vertex
    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add edge (Undirected)
    public void addEdge(String src, String dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    // DFS traversal
    public void dfs(String start) {
        Set<String> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    private void dfsHelper(String current, Set<String> visited) {
        visited.add(current);
        System.out.print(current + " ");

        for (String neighbor : adjList.get(current)) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS();

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

        // Perform DFS from node A
        System.out.print("DFS Traversal starting from A: ");
        graph.dfs("A");
    }
}
