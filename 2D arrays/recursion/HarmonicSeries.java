package recursion;
import java.util.Scanner;
public class HarmonicSeries {
	
	public static double harmonicsum(int i,int n)
	{
		if(i>n) return 0;
		return 1.0/i + harmonicsum(i+1,n); 
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.print(harmonicsum(1,n));
	sc.close();
	}

}
