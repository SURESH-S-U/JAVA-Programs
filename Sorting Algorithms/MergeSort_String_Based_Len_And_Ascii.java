import java.util.*;

public class sample {

    public static void MergeSort(String[] arr , int start , int end)
    {
        int len = end - start;
        if(len == 1) return;
        
        int mid;

        if(len % 2 == 0)
        {
            mid = start + len / 2;
        }
        else
        {
            mid = start + (len + 1) / 2;
        }

        MergeSort(arr , start , mid);
        MergeSort(arr , mid , end);

        MergeFunc(arr , start , mid , end);
    }

    public static void MergeFunc(String[] arr , int start , int mid , int end)
    {
        String[] joined = new String[end - start];
        int i = start , j = mid , k = 0;

        while(i < mid && j < end)
        {
            if(arr[i].length() < arr[j].length() || (arr[i].length() == arr[j].length() && arr[i].compareTo(arr[j]) <= 0))
            {
                joined[k++] = arr[i++];
            }
            else
            {
                joined[k++] = arr[j++];
            }
        }

        while(i < mid)
        {
            joined[k++] = arr[i++];
        }
        while(j < end)
        {
            joined[k++] = arr[j++];
        }

        for(int z = 0; z < joined.length;z++)
        {
            arr[start + z] = joined[z];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        System.out.println("Initial Array : "+Arrays.toString(arr));

        MergeSort(arr , 0 , arr.length);

        System.out.println("Initial Array : "+Arrays.toString(arr));
    }
}
 