package stack;
import java.util.*;
public class BalancedParentheses {
	
	public static boolean check(String s)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c=='(' || c=='[' || c=='{')
			{
				st.push(c);
			}
			else
			{
				if(st.isEmpty()) return false;
				char top = st.pop();
				if(c==')' && top=='(' || c==']' && top=='[' || c=='}' && top=='{') return false;
			}
		}
        return st.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(check(s)) System.out.print("Balanced");
		else System.out.print("Not Balanced");
		sc.close();
	}

}
