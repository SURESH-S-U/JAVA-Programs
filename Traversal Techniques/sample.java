
import java.util.*;

public class sample{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int rs = sc.nextInt();
        int cs = sc.nextInt();

        int rowSt = 0;
        int colSt = 0;

        int[][] arr = new int[rs][cs];

        for(int i=0;i<rs;i++)
        {
            for(int j=0;j<cs;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int t=0;t<=1;t++)
        {

            for(int j=0;j<cs;j++)
            {
                System.out.print(arr[rowSt][j]+" ");
            }

            rowSt++;

            for(int i=1;i<rs;i++)
            {
                System.out.print(arr[i][cs-1]+" ");
            }

            cs--;

            for(int j=cs-2;j>=0;j--)
            {
                System.out.print(arr[rs-1][j]+" ");
            }

            rs--;

            for(int i=rs-2;i>=1;i--)
            {
                System.out.print(arr[i][colSt]+" ");
            }

            colSt++;

        }

    }
}