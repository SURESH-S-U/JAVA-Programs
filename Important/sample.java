import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class sample{
    public static void main(String[] args){


        String str1 = "a a a a b b b b";

        ArrayList<String> str2 = new ArrayList<>(Arrays.asList(str1.trim().split("\\s+")));
        ArrayList<Integer> int2 = new ArrayList<>();

        for(int i =0;i<str2.size();i++)
        {
            System.out.println(str2.get(i));
        }

        for(int i=0;i<str2.size();i++)
        {
            int2.add(Collections.frequency(str2,str2.get(i)));
            
            for(int j=0;j<str2.size();j++)
            {
                if(str2.contains(str2.get(i)))
                {
                    str2.remove(str2.get(i));
                }
            }
        }

        System.out.print(int2);

    }
}