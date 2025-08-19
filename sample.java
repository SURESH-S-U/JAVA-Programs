import java.util.*;

public class sample {
    public static void main(String[] args) {

        String str = "suresh is a good boy";
        String[] arr = str.split(" ");
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            System.out.print(Arrays.toString(arr));
            String key = arr[i];
            int j = i - 1;

               // For Optimize the code.  If arr[j] < key means Key is already in correct position.

            // Shift elements greater than key to the right
            while (j >= 0 && (arr[j].compareTo(key)>0)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (String num : arr) {
            System.out.print(num + " ");
        }
    }
}
 