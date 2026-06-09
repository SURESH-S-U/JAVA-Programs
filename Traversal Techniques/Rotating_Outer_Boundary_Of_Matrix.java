
import java.util.*;

public class Rotating_Outer_Boundary_Of_Matrix{
    public static void main(String[] arsg){
        Scanner sc =  new Scanner(System.in);
        
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
        
        
        int top = 0, bottom = n-1;
        int left = 0, right = m-1;
        
        while(top < bottom && left < right)
        {
            int temp = arr[top][left];
            
            for(int i=top;i<bottom;i++)
            {
                arr[i][left] = arr[i+1][left];
            }
            
            for(int i=left;i<right;i++)
            {
                arr[bottom][i] = arr[bottom][i+1];
            }
            
            for(int i=bottom;i>top;i--)
            {
                arr[i][right] = arr[i-1][right];
            }
            
            for(int i=right;i>left;i--)
            {
                arr[top][i] = arr[top][i-1];
            }
            
            arr[top][left+1] = temp;
            
            top++;
            bottom--;
            left++;
            right--;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}