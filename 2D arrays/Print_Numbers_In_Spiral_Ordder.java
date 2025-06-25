
import java.util.*;

public class sample{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Output : ");
        System.out.println();

        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;

        int v = 0;

        while(top <= bottom && left <= right)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i] = v++;
            }

            top++;

            for(int i=top;i<=bottom;i++)
            {
                arr[i][right] = v++;
            }

            right--;



            for(int i=right;i>=left;i--)
            {
                arr[bottom][i] = v++;
            }

            bottom--;


            for(int i=bottom;i>=top;i--)
            {
                arr[i][left] = v++;
            }

            left++;
            
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