import java.util.*;

public class sample{

    public static void Merge_Sort(int[] arr , int n)
    {

    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        Merge_Sort(arr , n);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}