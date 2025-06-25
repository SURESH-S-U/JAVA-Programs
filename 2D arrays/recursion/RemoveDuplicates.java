package recursion;
import java.util.Scanner;
public class RemoveDuplicates {
	
	public static String removedup(String s,String res)
	{
		if(s.isEmpty()) return res;
		char c = s.charAt(0);
		if(res.indexOf(c)==-1) res+=c;
		return removedup(s.substring(1),res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(removedup(s,""));
		sc.close();
	}

}
