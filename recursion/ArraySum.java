
import java.util.*;

public class ArraySum{

    static Scanner sc = new Scanner(System.in);     // We can't use Scanner outside of the main Method. Because we declare inside the main.
													// So we declared as Static method of Scanner into the class(Out side of main);
    static int func(int[] arr,int i){				// Now we can acccess it from anywhere.

        if(i == arr.length)
        {
            return 0;
        }
        
        arr[i] = sc.nextInt();
        return arr[i] + func(arr , i + 1);

    }

    public static void main(String[] args){

        int n = sc.nextInt();
        
        int[] arr = new int[n];

        int res  = func(arr,0);
        System.out.println(res);

    }
}