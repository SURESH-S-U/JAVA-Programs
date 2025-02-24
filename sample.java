import java.util.Scanner;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;


public class sample{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();


        for(char ch : str)
        {
            if(Character.isUpperCase(ch))
            {
                System.out.println(ch);
            }
        }


    }
}