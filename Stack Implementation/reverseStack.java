package stack;
import java.util.*;
public class reverseStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

        Stack<Character> st = new Stack<>();
        
        for(char i : s.toCharArray()) st.push(i);

        while(!st.isEmpty()) System.out.println(st.pop());
        sc.close();
	}

}
