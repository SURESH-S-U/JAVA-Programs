import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2 , 2};
        int n = arr.length;

        // Bubble Sort
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            // Optimization: Stop if no swaps (already sorted)
            if (!swapped) break;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
