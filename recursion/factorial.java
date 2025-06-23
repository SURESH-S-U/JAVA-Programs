
import java.util.*;


public class factorial{

    static int fact(int n){

    if(n == 1 || n == 0)
    {
        return 1;
    }

    return n * fact(n-1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num  = sc.nextInt();
        int result = fact(num);
        System.out.println(result);

    }
}