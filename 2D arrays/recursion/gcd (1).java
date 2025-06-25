package recursion;
import java.util.Scanner;
public class gcd {
	public static int gcdnum(int a,int b)
	{
		if(b==0) return a;
		return gcdnum(b,a%b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(gcdnum(a,b));
		sc.close();

	}

}
