import java.util.*;
public class bin
{
    public static void BinarySearch(char[] arr , char c)
    {
        int st = 0;
        int ed = arr.length - 1;

        while(st <= ed)
        {
            int mid = ed - st;
            if(arr[mid] == c)
            {
                System.out.print("True");
                return;
            }

            else if(c > arr[mid])
            {
                st  = mid + 1;
            }
            else 
            {
                ed = mid - 1;
            }
        }
    }


    public static void main(String[] args)
    {
        char[] arr = {'a','b','c','d','d','f'};
        char c = 'b';

        BinarySearch(arr , c);
    }
}