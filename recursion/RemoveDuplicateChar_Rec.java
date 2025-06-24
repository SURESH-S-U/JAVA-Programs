
import java.util.*;

class Remove_Duplicates{

    static String Rem(String s , String a){
        
        if(s.isEmpty()){
            return a;
        }

        char c = s.charAt(0);

        if(a.indexOf(c) == -1){
            a += c;
        }

        return Rem(s.substring(1),a);

    }

}

public class RemoveDuplicateChar_Rec{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String a = "";

        String res = Remove_Duplicates.Rem(str,a);

        System.out.println(res);

    }
}