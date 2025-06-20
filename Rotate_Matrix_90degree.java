import java.util.*;

public class Rotate_Matrix_90degree{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for(int i=0;i<m;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(arr[j][i]+" ");
            }

            System.out.println();
        }

    }
}