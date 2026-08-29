import java.util.*;

public class Make_Diagonal_Zero{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] arr = new int[n][n];
        int c1 = 0;
        int c2=0;
        int max ,min;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            arr[i][i] = 0;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}