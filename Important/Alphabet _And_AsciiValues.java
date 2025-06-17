import java.util.*;

public class Alphabet_And_AsciiValues{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for(char i = 'a'; i <= 'z' ; i++)
        {
            System.out.println(i);
            System.out.println("Ascii Value is : "+ (int)i);            // Print Ascii value By convet Char into Integer
        }

    }
}