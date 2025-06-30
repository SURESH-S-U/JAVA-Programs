
import java.util.*;

public class Right_Angle_Triangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();                                 // Printing Incrementing Numbers
        for(int i=1; i<=num; i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print(j+" ");  // print j
            }
            System.out.println();
        }

        int num = sc.nextInt();                                 // Printing  Numbers
        for(int i=1; i<=num; i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print( i +" ");  // print i
            }
            System.out.println();
        }

        int num = sc.nextInt();                                 // Printing Star
        for(int i=1; i<=num; i++)
        {
            for(int j=1;j<=i; j++)
            {
                System.out.print("*"+" ");  // print *
            }
            System.out.println();
        }

    }
}