import java.util.*;
public class sample{

    public static int[][] rightRotate(int[][] mat, int n)
    {
        int[][] temp = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j] = mat[n - 1 - j][i];
            }
        }

        return temp;
    }

    public static int[][] leftRotate(int[][] mat, int n)
    {
        int[][] temp = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j] = mat[j][n - 1 - i];
            }
        }

        return temp;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        sc.nextLine();

        String str = sc.nextLine();

        for(char c : str.toCharArray())
        {
            if(c == 'R')
            {
                mat = rightRotate(mat , n);
            }
            else
            {
                mat = leftRotate(mat , n);
            }
        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}