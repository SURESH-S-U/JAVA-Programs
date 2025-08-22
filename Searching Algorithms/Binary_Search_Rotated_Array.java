import java.util.*;

public class RotatedBinarySearch {
    
    // Function to do binary search in rotated sorted array
    public static int rotatedBinarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // Print mid index at each iteration
            System.out.println("Mid index: " + mid + ", Value: " + arr[mid]);
            
            if (arr[mid] == target) {
                return mid;
            }
            
            // If left half is sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // If right half is sorted
            else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // not found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {6, 7, 8, 1, 2, 3, 4, 5};  // Sorted rotated array
        Random rand = new Random();

        System.out.print("Enter number of times to run search (n): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Pick a random index from array
            int randomIndex = rand.nextInt(arr.length);
            int target = arr[randomIndex];

            System.out.println("\nSearch " + (i + 1) + ": Target = " + target);
            int result = rotatedBinarySearch(arr, target);

            if (result != -1) {
                System.out.println("Target " + target + " found at index: " + result);
            } else {
                System.out.println("Target " + target + " not found.");
            }
        }
    }
}
