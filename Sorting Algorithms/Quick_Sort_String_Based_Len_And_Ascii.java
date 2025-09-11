import java.util.*;

public class Quick_Sort_String_Based_Len_And_Ascii {

    public static void Quick(String[] arr , int low , int high) {
        if(low < high) {
            int pi_idx = Partition(arr , low , high);
            Quick(arr , low , pi_idx - 1);
            Quick(arr , pi_idx + 1 , high);
        }
    }

    public static int Partition(String[] arr , int low , int high) {
        String pivot = arr[low];
        int i = low + 1;    
        int j = high;

        while(true) {
            while(i <= j && (arr[i].length() < pivot.length()
                 || (arr[i].length() == pivot.length() && arr[i].compareTo(pivot) <= 0))) {
                i++;
            }

            while(i <= j && (arr[j].length() > pivot.length()
                 || (arr[j].length() == pivot.length() && arr[j].compareTo(pivot) > 0))) {
                j--;
            }

            if(i > j) break;

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        System.out.println("Initial Array : " + Arrays.toString(arr));

        Quick(arr , 0 , arr.length - 1);

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
