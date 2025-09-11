import java.util.*;

public class sample {

    public static int Binary_Search(int[] arr , int target) {
        int low = 0 , high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            System.out.println("Mid index : " + mid + "  Value : " + arr[mid]);

            if (arr[mid] == target) {
                return mid;   // return index
            }

            if (arr[low] <= arr[mid]) { // Left half is sorted
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Right half is sorted
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int res = Binary_Search(arr , target);
        if (res != -1) {
            System.out.println("Element found At index : " + res);
        } else {
            System.out.println("No Element found");
        }
    }
}
