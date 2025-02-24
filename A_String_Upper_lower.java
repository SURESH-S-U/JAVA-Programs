import java.util.Scanner;
                                                        // Question: Increase count If the char in both case in str.
public class A_String_Upper_lower{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = scanner.nextLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j < str.length(); j++)
            {
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(j);

                if(i != j)
                {
                    if(Character.isUpperCase(ch1))
                    {
                        if(Character.toLowerCase(ch1) == ch2)
                        {
                            count++;
                        }
                    }
                    else
                    {
                        if(Character.toUpperCase(ch1) == ch2)
                        {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.printf("The count is : %d",count);
    }
}