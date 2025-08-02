import java.util.*;

public class Merge_Sort_Easy
{
    // Recursive Merge Sort function
    public static int[] Merge_Sort(int[] arr)
    {
        // Base case: If array has 0 or 1 element, it is already sorted
        if(arr.length <= 1) return arr;

        int mid = arr.length / 2;

        int[] left = Merge_Sort(Arrays.copyOfRange(arr , 0 , mid));

        int[] right = Merge_Sort(Arrays.copyOfRange(arr , mid , arr.length));

        // Merge the two sorted halves and return the result
        return Merge(left , right);
    }

    // Function to merge two sorted arrays into a single sorted array
    public static int[] Merge(int[] left , int[] right)
    {
        int[] joined = new int[left.length + right.length]; // Final merged array

        int i = 0 , j = 0 , k = 0;

        // Compare elements from both arrays and pick the smaller one
        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                joined[k++] = left[i++]; // Take from left and move its pointer
            }
            else
            {
                joined[k++] = right[j++]; // Take from right and move its pointer
            }
        }

        // Copy remaining elements from left array (if any)
        while(i < left.length)
        {
            joined[k++] = left[i++];
        }

        // Copy remaining elements from right array (if any)
        while(j < right.length)
        {
            joined[k++] = right[j++];
        }

        return joined; // Return merged sorted array
    }

    // Main function to test Merge Sort
    public static void main(String[] args)
    {
        int[] arr = {1,3,9,4,7,5,6};

        // We need to store the returned array because the function return the nre arraay not the input array.
        arr = Merge_Sort(arr);

        for(int i : arr)
            System.out.print(i + " ");
    }
}
