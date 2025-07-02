import java.util.*;

public class BackTracking_Maze_ShortestPath{

    static void Maze(int x,int y,String path,int[][] arr, boolean[][] brr,int n,  ArrayList<String> list)   // ArrayList declaration
    {
        if(x == n-1 && y == n-1)
        {
            System.out.println(path);

            list.add(path);                  // Append the path into list.

            return;
        }

        if(x < 0 || y < 0 || x >= n || y >= n || brr[x][y] || arr[x][y] == 0)
        {
            return;
        }

        brr[x][y] = true;          // Make the node visited.

        Maze(x+1, y, path + "D", arr,brr,n,list);
        Maze(x, y+1, path + "R", arr,brr,n,list);
        Maze(x-1, y, path + "U", arr,brr,n,list);
        Maze(x, y-1, path + "L", arr,brr,n,list);

        brr[x][y] = false;                   // If there is no path from this point. BackTrack .And It will keep free for another path useage. 

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];
        boolean[][] brr = new boolean[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt(); 
            }
        }

        ArrayList<String> list = new ArrayList<>();

        if(arr[0][0] != 0)
        {
            Maze(0,0,"",arr,brr,n,list);                 // Verify the Starting point is non Zero.
        }

        String minStr = list.get(0);

        for(String s : list)
        {
            if(s.length() < minStr.length())
            {
                minStr = s;
            }
        }

        if (! list.isEmpty())                         // Prevent from ,If there is no path. Index out of bound exception will occur.
        {
            System.out.println("The Shortest Path Among All is : "+minStr);
        }

    }

}