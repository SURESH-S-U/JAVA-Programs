
import java.util.*;

public class Convert_Integer_TO_Binary{

    static void bin(int n)
    {
        if(n == 0)
        {
            return;
        }

        bin(n/2);

        System.out.print(n%2);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        bin(num);

    }
}