import java.util.Arrays;

public class Merge_Sort_Optimized {

    // Main Merge Sort function
    // start -> starting index (inclusive)
    // end   -> ending index (exclusive)
    public static void Merge_Sort(int[] arr, int start, int end) {
        // Base case: if subarray has 1 element, it is already sorted
        if (end - start == 1) return;

        // Find the middle index
        int mid = (start + end) / 2;

        // Recursively sort the left half [start, mid)
        Merge_Sort(arr, start, mid);

        // Recursively sort the right half [mid, end)
        Merge_Sort(arr, mid, end);

        // Merge the two sorted halves
        Merge_Function(arr, start, mid, end);
    }

    // Merge two sorted subarrays into one
    // Left:  [start, mid)
    // Right: [mid, end)
    public static void Merge_Function(int[] arr, int start, int mid, int end) {
        int[] joined = new int[end - start]; // Temporary array to store merged result

        int i = start, j = mid, k = 0;

        // Merge while both halves have elements
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                joined[k++] = arr[i++];
            } else {
                joined[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half (if any)
        while (i < mid) {
            joined[k++] = arr[i++];
        }

        // Copy remaining elements from the right half (if any)
        while (j < end) {
            joined[k++] = arr[j++];
        }

        // Copy the merged elements back to the original array
        for (int z = 0; z < joined.length; z++) {
            arr[start + z] = joined[z];
        }
    }

    // Driver function to test the Merge Sort
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 2, 6, 4};

        Merge_Sort(arr, 0, arr.length);  // Sort the whole array

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
