
// Efficient method Kadane's Algorithm.

// Kadane's algorithm checks,
    // -> Whether the continues value is grater ot the currently pointed value is grater and update the current based on that.
    //   ex: if currently pointed value alone is grater than the previous continues value, then update the current variable with the new current.
    // -> Kepp the maximum value in seperate variable.  

import java.util.*;
public class Maximum_sub_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int cur = arr[0];
        int max = arr[0];

        for(int i=1 ;i<n;i++)  // Should be start from 1 - to ignore the first element is summed with first element again.
        {                   
            cur = Math.max(arr[i] + cur , arr[i]);  // In this line it compares whether the contiues + current value is grater or the current alone is grater.
                                                    // Update the current based on that.
                                                    // If it choose the current alone, Then it will ignore the previous values.
            max = Math.max(max , cur);
        }

        System.out.println(max);

    }
}