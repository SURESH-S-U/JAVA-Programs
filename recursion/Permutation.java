
import java.util.*;

public class Permutation{

    static void permutation(String str , String temp){

        if(str.isEmpty())
        {
            System.out.println(temp);
            return;
        }

        for(int  i=0; i<str.length();i++)
        {
            char c = str.charAt(i);

            String sub = str.substring(0,i) + str.substring(i+1);

            permutation(sub , temp + c);
        }

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String temp  = "";

        permutation(str , temp);

    }
}