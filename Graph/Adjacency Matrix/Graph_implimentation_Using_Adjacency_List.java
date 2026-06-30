import java.util.*;
public class Graph_implimentation_Using_Adjacency_List{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int vertices = sc.nextInt();

        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph =  new ArrayList<>();

        for(int i=0; i< vertices; i++)
        {
            // Just create empty lists.
            graph.add(new ArrayList<>());
        }

        for(int i=0;i < edges; i++)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }


        for(int i=0;i<vertices;i++)
        {
            System.out.print(i + " : ");
            for(int num : graph.get(i))
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}