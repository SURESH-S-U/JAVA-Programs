package recursion;
import java.util.Scanner;
public class ReplaceLetter {
	
	public static void replace(String s,int n)
	{
		if(n==s.length()) return;
		
		if(s.charAt(n)=='a') System.out.print('z');
		else System.out.print(s.charAt(n));
		replace(s,n+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		replace(s,0);
		sc.close();
	}

}
