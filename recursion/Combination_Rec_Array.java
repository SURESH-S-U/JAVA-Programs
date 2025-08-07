import java.util.*;

public class Combination_Rec_Array {

    static void com(int[] arr, List<Integer> temp, int index) {
        // Print current combination
        System.out.println(temp);

        if(index == arr.length) {
            return;
        }

        for(int i = index; i < arr.length; i++) {
            temp.add(arr[i]);
            com(arr, temp, i + 1);
            temp.remove(temp.size() - 1); // backtrack. This in necessary Because Array are reference type. So it wont work with backtrack.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        com(arr, new ArrayList<>(), 0);
    }
}
