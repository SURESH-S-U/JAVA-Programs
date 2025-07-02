import java.util.*;
public class BackTracking_PrintAll_Binary_DigitRange
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        bin("",n);
       
    }
    public static void bin(String s,int n)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        bin(s+"0",n-1);
        bin(s+"1",n-1);
    }
}