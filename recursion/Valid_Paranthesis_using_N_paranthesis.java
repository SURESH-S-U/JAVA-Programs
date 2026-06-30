import java.util.*;
public class Valid_Paranthesis_using_N_paranthesis{

    static boolean validPara(String str)
    {
        Stack<Character> st  = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);

            char p = '*';
            if(! st.isEmpty())
            {
               p = st.peek();
            }
            else{
                p = '*';
            }
            if(c == '(')
            {
                st.push(c);
            }
            else if(c == ')' && p == '(')
            {
                st.pop();
            }
            else{
                return false;
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        return false;
    }

    static void permutation(String str, String temp, ArrayList<String> list)
    {
        if(str.length() == 0)
        {
            if(validPara(temp))
            {
                if(! list.contains(temp)) list.add(temp);
            }
            return;
        }

        for(int i=0;i< str.length();i++)
        {
            char c = str.charAt(i);
            String sub = str.substring(0,i) + str.substring(i+1);

            permutation(sub , temp+c, list);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n_pairs = sc.nextInt();

        String str = "";

        for(int i=0; i < n_pairs;i++)
        {
            str += '(';
        }
        for(int i=0; i < n_pairs;i++)
        {
            str += ')';
        }

        ArrayList<String> list = new ArrayList<>();

        permutation(str, "", list);
        
        System.out.println(list.toString().replaceAll("[\\[\\], ]",""));
    }
}