
import java.util.*;

public class Pascal2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int j=n-i;j>=1;j--)
            {
                System.out.print(j);
            }

            for(int j=2;j<=n-i;j++)
            {
                System.out.print(j);
            }

            System.out.println();

        }

    }
}