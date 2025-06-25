
import java.util.*;

public class Convert_String_to_Int_Rec{

    static int con(String str)
    {
        int n = str.charAt(str.length()-1) - '0';

        if(str.length() == 1)
        {
            return n;
        }

        return con(str.substring(0,str.length()-1)) * 10 + n;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int res = con(str);
        System.out.println(res);

    }
}