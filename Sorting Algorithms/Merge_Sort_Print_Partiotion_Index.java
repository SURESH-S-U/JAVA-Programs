import java.util.Arrays;

public class Merge_Sort_Print_Partiotion_Index {

    public static void Merge_Sort(int[] arr, int start, int end) {

        if(start != (end - 1))
            System.out.println(start + "-" + (end-1));
        else
            System.out.println(start);

        if (end - start <= 2) return; // Base case: single element

        int len = end - start;
        int mid;

        // If odd length, left gets extra element
        if (len % 2 == 1) {
            mid = start + (len + 1) / 2; // left bigger
        } else {
            mid = start + len / 2;
        }

        // Print partition

        Merge_Sort(arr, start, mid);
        Merge_Sort(arr, mid, end);

        Merge_Function(arr, start, mid, end);
    }

    public static void Merge_Function(int[] arr, int start, int mid, int end) {
        int[] joined = new int[end - start];
        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                joined[k++] = arr[i++];
            } else {
                joined[k++] = arr[j++];
            }
        }
        while (i < mid) {
            joined[k++] = arr[i++];
        }
        while (j < end) {
            joined[k++] = arr[j++];
        }
        for (int z = 0; z < joined.length; z++) {
            arr[start + z] = joined[z];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 4,7,12,7 , 5,9};

        Merge_Sort(arr, 0, arr.length);

        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
