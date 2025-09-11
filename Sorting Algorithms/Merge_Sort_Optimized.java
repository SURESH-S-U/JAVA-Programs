import java.util.Arrays;

public class Merge_Sort_Optimized {

    // Main Merge Sort function
    // start -> starting index (inclusive)
    // end   -> ending index (exclusive)    End must be one index extra.-> arr.length

    public static void Merge_Sort(int[] arr, int start, int end) {

        if (end - start == 1) return;   // Base case: if subarray has 1 element, it is already sorted

        int mid = (start + end) / 2;   // Find the middle index
        
        Merge_Sort(arr, start, mid); // Recursively sort the left half [start, mid)

        Merge_Sort(arr, mid, end);    // Recursively sort the right half [mid, end)

        Merge_Function(arr, start, mid, end);  // Merge the two sorted halves
    }



    // Merge two sorted subarrays into one
    // Left:  [start, mid)
    // Right: [mid, end)

    public static void Merge_Function(int[] arr, int start, int mid, int end) {
        int[] joined = new int[end - start]; // Temporary array to store merged result

        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {        // Merge while both halves have elements

            if (arr[i] < arr[j]) 
            {
                joined[k++] = arr[i++];
            } 
            else 
            {
                joined[k++] = arr[j++];
            }

        }

        while (i < mid) {        // Copy remaining elements from the left half (if any)

            joined[k++] = arr[i++];
        }

        while (j < end) {        // Copy remaining elements from the right half (if any)

            joined[k++] = arr[j++];
        }

        for (int z = 0; z < joined.length; z++) {        // Copy the merged elements back to the original array

            arr[start + z] = joined[z];
        }
    }


    // Main Method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Merge_Sort(arr, 0, arr.length);  // Sort the whole array

        // Print the sorted array
        System.out.println(Arrays.toString(arr));      
    }
}
