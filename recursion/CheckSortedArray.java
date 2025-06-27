package recursion;
import java.util.Scanner;
public class CheckSortedArray {
	
	public static boolean sorted(int[] arr,int n)
	{
		if(n==0) return true;
		return arr[n] >= arr[n-1] && sorted(arr,n-1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = {1,2,3,4,5,6,7,1};

		if(sorted(arr,arr.length-1)) 
		{
			System.out.print("Sorted");
		}
		else 
		{
			System.out.print("Not Sorted");
		}
	}

}
