package recursion;
import java.util.Scanner;
public class ProductOfDigits {
	
	public static int pow(int n)
	{
		if(n<10) return n;
		return (n%10) * pow(n/10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(pow(n));
		sc.close();
	}

}
