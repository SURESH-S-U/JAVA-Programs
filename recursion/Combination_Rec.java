
import java.util.*;

public class Combination_Rec{

    static void com(String str,String temp, int index)
    {
        
        System.out.println(temp);
        if(index == str.length())
        {

            return;
        }

        for(int i=index;i<str.length();i++)
        {
            char c = str.charAt(i);
            com(str,temp+c,i+1);
        }


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        com(str,"",0);

    }
}