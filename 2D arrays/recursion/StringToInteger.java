package recursion;
import java.util.Scanner;
public class StringToInteger {
	
	public static int count(String s)
	{
		if(s.length()==1) return s.charAt(0)-'0';
		int n = count(s.substring(0,s.length()-1));
		int d = s.charAt(s.length()-1)-'0';
		return n*10+d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(count(s));
		sc.close();
	}

}
