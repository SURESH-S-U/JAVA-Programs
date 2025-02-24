import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArrayFunctions{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the array : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int[] sorted = Arrays.copyOf(arr,arr.length); 
        Arrays.sort(sorted);
        System.out.println("Sorted arr : "+ Arrays.toString(sorted));

        int[] rev_sorted = Arrays.copyOf(arr,arr.length); 
        Arrays.sort(rev_sorted,Collections.reverseOrder());
        System.out.println("Sorted arr : "+ Arrays.toString(rev_sorted));

        int length = arr.length;
        System.out.println("Length of array is : " + length);

        int[] copy = Arrays.copyOf(arr,length);
        System.out.println("The copied : " + Arrays.toString(copy));

        String str = Arrays.toString(arr);
        System.out.println("The string is : " + str);
    }
}