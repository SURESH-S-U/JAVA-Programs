
import java.util.*;

public class Replace_Vowels_With_Consonents{



    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int size = str.length();
        int[] arr = new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i] = str.charAt(i) - '0';
        }

        int k = sc.nextInt();
        int sum = 0;
        for(int i=0;i<size;i++)
        {
            sum = 0;
            for(int j=i;j<i+k;j++)
            {
                sum += arr[j];
            }
            System.out.println("Sum "+(i+1)+" : "+sum);
        }

    }
}