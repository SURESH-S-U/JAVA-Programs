import java.util.*;
public class Binary_Search {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // Find middle

            if (arr[mid] == key) {
                return mid;  // Found the key
            } else if (arr[mid] < key) {
                low = mid + 1;  // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }

        return -1;  // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 45, 8, 17, 16, 23, 38, 56};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        int key = 23;

        int result = binarySearch(numbers, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
