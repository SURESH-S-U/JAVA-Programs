

// A number is Leading number when the number is grater than all other numbers in its rightside.
// Ex: {5, 25, 16, 17, 2} -- Leading numbers are -- 25, 17, 2

import java.util.*;
public class Leading_Number{
    public static void main(String[] ahgad){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        // Start from the last to first to achieve it optimally.


        int max = arr[n-1];
        System.out.println(max);  // Because last element is always leading.
        
        for(int i = n-1; i>=0;  i--)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
}