package recursion;
import java.util.Scanner;
public class EvenOddPartition {
	
	public static void eo(int[] arr,int x,boolean even)
	{
		if(x==arr.length) return;
		
		if(even && arr[x]%2==0) 
		{
			System.out.print(arr[x]+" ");
		}
		else if(!even && arr[x]%2!=0) 
		{
			System.out.print(arr[x]+" ");
		}
		eo(arr,x+1,even);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		eo(arr,0,true);
		eo(arr,0,false);
		sc.close();
	}
}
