import java.util.*;

public class Pattern_Heart{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        
        int size = (line/2)/2;
        int start = size;
        int end = line - size;
        int temp = 0;

        for(int i=0; i <= start; i++)
        {

            for(int j = 0 ; j <= line; j++)
            {
                if(j == start - temp || j == start + temp  || j == end-temp || j== end+temp)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            temp++;
            System.out.println();
        }


        int st = 0;
        for(int i=0;i<line/2;i++)
        {
            for(int j=0;j<=line;j++)
            {
                if(j == st || j == line - st)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            st++;
            System.out.println();
        }

    }

}