
import java.util.*;

public class CharacterFrequency{

    static Scanner sc = new Scanner(System.in);

    int func(String str,int i,int n,int count)
    {
        if(n == str.length())
        {
            return count;
        }

        if(str.charAt(i) == str.charAt(n))
        {
            count++;
        }

        return func(str,i,n+1,count);
    }

    public static void main(String[] args){

        String str = sc.nextLine();

        Set<Character> visited = new HashSet<>();   // Used to avoid Duplicate elements;  

        for(int i=0;i<str.length();i++)
        {  
            char ch = str.charAt(i); 

            if(!visited.contains(ch))
            {   
                visited.add(ch);
                CharacterFrequency obj = new CharacterFrequency();
                int res  = obj.func(str,i,0,0);
                System.out.println("Freq of Char " +ch+ " is : "+res);
            }
        }

    }
}