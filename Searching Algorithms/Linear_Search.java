public class Linear_Search {

    // Linear Search Function
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return index if element found
            }
        }
        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 45;

        int result = linearSearch(numbers, target);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
