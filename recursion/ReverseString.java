package recursion;
import java.util.Scanner;
public class ReverseString {
	public static String rev(String s)
	{
		if(s.isEmpty()) return "";
		return rev(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(rev(s));
		sc.close();
	}

}
