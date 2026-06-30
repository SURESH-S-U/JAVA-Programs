/*Text Cleaner for Duplicate Removal

A text-processing system is designed to clean user input by removing adjacent duplicate characters. 
Whenever two identical characters appear next to each other, they are removed as a pair. 
This process continues repeatedly until no more adjacent duplicate pairs exist.

Your task is not to return the final string, but to compute the length of the resulting string after all possible removals. 
To solve efficiently, use a stack approach (Deque):

Push characters if they are different from the top
If the current character matches the top, remove the top (pair removal)*/

import java.util.*;

public class Remove_Nearby_Duplicate_Using_Stack {

    static char[] stack = new char[100];
    static int top = 0;

    static int finalLength(String s)
    {
        for(int i=0;i < s.length();i++)
        {
            char c = s.charAt(i);
            
            if(stack[top] == c)
            {
                top--;
            }
            else{
                top++;
                stack[top] = c;
            }
        }
        
        return top;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(finalLength(s));

        sc.close();
    }
}