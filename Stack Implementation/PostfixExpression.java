package stack;
import java.util.*;
public class PostfixExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
        String s[] = sc.nextLine().split("");
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length;i++)
        {
        	String t = s[i];
        	if("+/*".contains(t))
        	{
        		int a = st.pop();
        		int b = st.pop();
        		switch(t)
        		{
        		case "+" :
        			st.push(a+b);
        			break;
        		case "-" :
        			st.push(a-b);
        			break;
        		case "*" :
        			st.push(a*b);
        			break;
        		case "/" :
        			st.push(a/b);
        			break;
        		}
        	}
        	else
        	{
        		st.push(Integer.parseInt(t));
        	}
        }
        sc.close();
        System.out.print(st.pop());
	}
}
