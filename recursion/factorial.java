package recursion;
import java.util.Scanner;
public class factorial {

	public static int fact(int n)
	{
		if(n==0) return 1;
		else return n*fact(n-1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fact(n));

	}
}
