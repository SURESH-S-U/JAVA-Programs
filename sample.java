import java.util.*;
public class sample{

    public static void MergeSort(String[] arr , int st , int end)
    {
        int len = end - st;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        System.out.print(Arrays.toString(arr));

        MergeSort(arr , 0 , arr.length);

        System.out.print(Arrays.toString(arr));

    }
}