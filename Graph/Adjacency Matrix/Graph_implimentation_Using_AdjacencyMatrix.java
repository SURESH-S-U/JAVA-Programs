import java.util.*;
public class Graph_implimentation_Using_AdjacencyMatrix{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        // Creating Adjacency matrix (V x V);
        int[][] graph = new int[vertices][vertices];

        for(int i=0; i < edges; i++)
        {
            // Geting nodes
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            graph[n1][n2] = 1;       // If Node 1 is linkes with Node 2.
            graph[n2][n1] = 1;       // Node 2 also linked with Node 1.
        }

        for(int  i=0; i<vertices; i++)
        {
            for(int j=0; j<vertices; j++)
            {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }
} 