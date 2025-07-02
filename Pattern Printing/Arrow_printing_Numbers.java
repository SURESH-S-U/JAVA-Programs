import java.util.*;

public class Arrow_printing_Numbers{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int k = 0;
        for(int i=0;i<n*2-1;i++)
        {
            if(i <= n && k <= n*2-1)
            {
                k += 2;
            }
            else
            {
                k -= 2;
            }

            for(int j=1;j<k;j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }

}