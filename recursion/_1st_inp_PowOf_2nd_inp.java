
import java.util.*;

public class _1st_inp_PowOf_2nd_inp{

    static int func(int n1,int n2)
    {
        if(n2 == 0)
        {
            return 1; 
        }
        

        return n1*func(n1,n2-1);

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res = func(n1,n2);
        System.out.println(res);

    }
}