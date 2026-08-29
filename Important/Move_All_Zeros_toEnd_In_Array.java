import java.util.*;
public class Move_All_Zeros_toEnd_In_Array{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        

        int j = 0;    // J points to the next non zero position.

        for(int i=0;i<n;i++)
        {
            if(arr[i] != 0)         // If element not equal to 0 - J move.
            {                       // If element == 0 - j Dont move.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}