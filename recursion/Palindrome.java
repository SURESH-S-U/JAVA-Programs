package recursion;
import java.util.Scanner;
public class Palindrome {
	
	public static boolean pali(String s,int l,int r)
	{
		if(l>=r) return true;
		if(s.charAt(l)!=s.charAt(r)) return false;
		return pali(s,l+1,r-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(pali(s,0,s.length()-1)) System.out.print("Palindrome");
		else System.out.print("Not a Palindrome");
		sc.close();
	}

}
