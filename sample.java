
import java.util.*;

public class sample{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,16,5,18,7,8,9};

        int k = sc.nextInt();
        int Max = 0;
        int idx = 0;

        for(int i=0;i<k;i++)
        {
            Max += arr[i];
        }

        int temp = Max;


        for(int i = k; i<= arr.length -1 ;i++)
        {
            temp = temp + arr[i] - arr[i-k];       // The k number of each block of elements called as Window.
                                                      
            if(temp > Max)
            {
                Max = temp;
                idx = i;
            }
            
        }

        System.out.println(Max);

        for(int i=idx-k+1;i<=idx;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}