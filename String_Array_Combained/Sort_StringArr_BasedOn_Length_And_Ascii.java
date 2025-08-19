import java.util.*;

public class Sort_StringArr_BasedOn_Length_And_Ascii {

    public static void BubbleSort(String[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                
                // Compare by length first
                if (arr[j].length() > arr[j + 1].length() ||
                   (arr[j].length() == arr[j + 1].length() && arr[j].compareTo(arr[j + 1]) > 0)) {
                    
                    // Swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) return; // Early exit optimization
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        BubbleSort(arr, n);

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
