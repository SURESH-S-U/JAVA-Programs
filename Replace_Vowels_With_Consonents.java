
import java.util.*;

public class Replace_Vowels_With_Consonents{

    public static boolean CheckVowels(char c)
    {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        int ind = 0;

        StringBuilder sb2 = new StringBuilder("bcdfghjklmnpqrstvwxyz");

        for(int i=0;i<str.length();i++)
        {
            if(CheckVowels(sb.charAt(i)))
            {
                sb.setCharAt(i,sb2.charAt(ind++));
            }
        }

        System.out.println("String Builder : "+sb);

    }
}