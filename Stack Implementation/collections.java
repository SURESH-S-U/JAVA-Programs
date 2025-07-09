package stack;
import java.util.*;
public class collections {
	public static void main(String[] args)
	{
		Stack<Integer> ob = new Stack<>();
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);
		System.out.println(ob.peek());
		System.out.println(ob.pop());
		System.out.print(ob);
	}
}
