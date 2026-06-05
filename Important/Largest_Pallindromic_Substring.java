import java.util.*;

public class Largest_Pallindromic_Substring{
    
    static boolean isPallindrome(String str)
    {
        int st = 0, end = str.length() - 1;
        
        while(st < end)
        {
            if(str.charAt(st) != str.charAt(end))
            {
                return false;
            }
            st++;
            end --;
        }
        return true;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int largeLen = 0;
        
        String str = sc.nextLine();
        
        int l1 = 0,l2 =0;
        
        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<str.length(); j++)
            {
                String subStr = str.substring(i, j);
                
                if(isPallindrome(subStr))
                {
                    int subLen = subStr.length();
                
                    if(subLen > largeLen)
                    {
                        largeLen = subLen;
                        l1 = i;
                        l2 = j;
                    }
                }
            }
        }
        
        System.out.println(largeLen);
        System.out.println(str.substring(l1,l2));
        
    }
}