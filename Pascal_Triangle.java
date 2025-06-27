
import java.util.*;

public class Pascal_Triangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        int k = 1;
        for(int i=1;i<=n*2;i++)
        {
            if(i <= n)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
            }
            else
            {
                c = n -  k;
                k++;

                for(int j=1;j<=c;j++)
                {
                    System.out.print(j+" ");
                }
                
            }
            System.out.println();
        }

    }
}