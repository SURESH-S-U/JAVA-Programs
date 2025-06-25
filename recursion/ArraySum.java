package recursion;
import java.util.Scanner;
public class ArraySum {
	public static int sum(int[] arr,int i)
	{
		if(i==arr.length) return 0;
		return arr[i]+sum(arr,i+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int i=0;
		System.out.print(sum(arr,i));
		sc.close();
	}

}
