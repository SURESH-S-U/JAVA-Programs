package recursion;
import java.util.Scanner;
public class MaxArray {
	public static int maximum(int[] arr,int i)
	{
		if(i==arr.length) return 0;
		return Math.max(arr[i],maximum(arr,i+1));
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
		System.out.print(maximum(arr,i));
		sc.close();
	}

}
