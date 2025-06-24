
import java.util.*;

public class Reverse_The_number{

    static void rev(int n){

        if(n == 0)
        {
            return;
        }

        rev(n/10);
        System.out.print(n % 10+" ");

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        rev(num);

    }
}