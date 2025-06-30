
import java.util.*;

public class Boiler_Plate{                                                    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1 ; i<=num ; i++)
        {
            for(int j=num-i;j>=1;j--)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }

            System.out.println();
        }

    }
}