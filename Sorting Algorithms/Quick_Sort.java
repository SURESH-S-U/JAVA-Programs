import java.util.*;

public class Quick_Sort {

    // QuickSort function
    public static void Quick(int[] arr, int low, int high) {

        if (low < high) {  // Base condition: Only sort if the subarray has 2 or more elements 
            
            int pi_index = partition(arr, low, high);    // Partition the array and get the pivot's correct position

            Quick(arr, low, pi_index - 1);  // Recursively sort the left subarray (elements before pivot)

            Quick(arr, pi_index + 1, high);    // Recursively sort the right subarray (elements after pivot)

        }
    }

    // Partition method (Hoare's partition scheme) with first element as pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];  // Choose the first element as pivot
        int i = low + 1;       // Start from the element next to pivot
        int j = high;          // Start from the last element

        while (true) {

            while (i <= j && arr[i] <= pivot) {   // Move i to the right until we find a value greater than pivot

                i++;      
            }

            while (i <= j && arr[j] > pivot) {    // Move j to the left until we find a value smaller or equal to pivot

                j--;
            }

            // If i crosses j, partition is done
            if (i > j) {
                break;
            }

            // Swap arr[i] and arr[j] because they are in the wrong partition
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Finally, place the pivot at its correct position
        arr[low] = arr[j];
        arr[j] = pivot;

        return j;  // Return the index of the pivot
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Call QuickSort on the whole array
        Quick(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
