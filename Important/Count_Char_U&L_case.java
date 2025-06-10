import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class zsample{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        ArrayList<Character> letters = new ArrayList<>();

        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            letters.add(ch);
        }

        System.out.print(letters);

        ArrayList<Character>rev = new ArrayList<>(letters);
        Collections.reverse(rev);
        System.out.print(rev);
        Collections.sort(rev);
        System.out.print(rev);


        String str1 = "";

        for(int i=0;i<rev.size();i++)
        {
            str1+=letters.get(i);
        }

        System.out.print(str1);


        int count = 0;

        ArrayList<Character>sample = new ArrayList<>();


        for(int i=0;i<letters.size();i++)
        {
            char ch =  letters.get(i);

            if(!(sample.contains(ch)))
            {
                if(Character.isLowerCase(ch))
                {
                    if(letters.contains(Character.toUpperCase(ch)))
                    {
                        count+=1;
                    }
                }
                else
                {
                    if(letters.contains(Character.toLowerCase(ch)))
                    {
                        count+=1;
                    }
                }
            }

            sample.add(ch);

        }

        System.out.print("Count is :"+ count/2);

    }
}