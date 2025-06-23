
import java.util.*;

public class fibonacci{

    static void fib(int n,int a,int b){

        if(a<n)
        {
            System.out.print(a+","+b+",");
            a = a+b;
            b = a+b;
            fib(n,a,b);
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        fib(num,a,b);

    }
}