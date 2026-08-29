import java.util.*;
public class Sample{

    static void dfs(ArrayList<ArrayList<Integer>>tree, int node, boolean[] visited){

        visited[node] = true;
        System.out.print(node + " ");

        for(int n : tree.get(node)){
            if(!visited[n]){
                dfs(tree, n, visited);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

        for(int i=0;i<n;i++){
            tree.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++){
            int v = sc.nextInt();
            int u = sc.nextInt();

            tree.get(v).add(u);
            tree.get(u).add(v);
        }

        for(ArrayList<Integer> list : tree){
            System.out.println(list);
        }

        boolean[] visited = new boolean[tree.size()];

        dfs(tree, 0, visited);
    }
}