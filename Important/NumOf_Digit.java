import java.util.*;

public class NumOf_Digit{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int digit = 0;

        while(num > 0)
        {
            num = num / 10;
            digit ++ ;
        }

        System.out.println(digit);

    }
}