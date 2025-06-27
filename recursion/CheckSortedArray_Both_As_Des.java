
import java.util.*;

public class sample{

    static boolean func(int[] arr,int n,boolean A)
    {
        if(n == 0)
        {
            return true;
        }

        if(A)
         {
            return arr[n] >= arr[n-1] && func(arr,  n-1 , A);
         }

         else
         {
            return arr[n] < arr[n-1] && func(arr , n-1 , A);
         }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {5,4,3,2,1};

        boolean isAscending = sc.nextBoolean();

        if(func(arr,arr.length-1,isAscending)){
            System .out.println("Sorted");
        }
        else
        {
            System.out.println("Not sorted");
        }

    }
}