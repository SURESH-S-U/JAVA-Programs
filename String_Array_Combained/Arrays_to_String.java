import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'H','e','l','l','o'};
        
        System.out.println(new String(arr));       // Hello            Wont work in Integer Array.
        System.out.println(String.valueOf(arr));   // Hello            Wont work in Integer Array.
        System.out.println(Arrays.toString(arr));  // [H, e, l, l, o]  Will Work.
    }
}
