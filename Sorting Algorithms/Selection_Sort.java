import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 9, 7};
        int n = arr.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume current element is the smallest
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update index of smallest element
                }
            }
            // Swap the smallest element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
