import java.util.Scanner;


public class ArrayProgram{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();

        int[][] arr =  new int[size][size];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<size;i++)
        {
            for(int j=size-1;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
            
        }
    }
}