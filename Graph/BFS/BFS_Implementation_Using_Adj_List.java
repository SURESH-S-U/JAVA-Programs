
static Queue<Innteger> q = new Queue<>();
Static ArrayList<Boolean> arr = new LinkedList<>();

public static BFS (int start)
{
    q.add(start);
    arr[start] = false;

    while(! q.isEmpty())
    {
        int val = q.remove();
        for(int v : graph.get(val))
    }
}import java.util.*;

public class GraphBFS {
    private Map<String, ArrayList<String>> adjList;

    public GraphBFS() {
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

    // BFS traversal
    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

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

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS();

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

        // Perform BFS from node A
        System.out.print("BFS Traversal starting from A: ");
        graph.bfs("A");
    }
}
