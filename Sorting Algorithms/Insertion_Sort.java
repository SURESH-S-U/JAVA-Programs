import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 7, 8};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            if (arr[j] <= key) continue;   // For Optimize the code.  If arr[j] < key means Key is already in correct position.

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
 