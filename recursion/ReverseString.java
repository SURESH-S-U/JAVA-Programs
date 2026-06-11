import java.util.Scanner;
public class ReverseString {
	public static String rev(String str)
	{
		if(str.length() == 0)
		{
			return "";
		}

		return str.charAt(str.length() - 1) + rev(str.substring(0, str.length()-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		System.out.print(rev(s));
		sc.close();
	}

}
