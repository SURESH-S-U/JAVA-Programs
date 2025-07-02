import java.util.Scanner;

public class islandcount {



	public static void island(int[][] arr,int i,int j)

	{

		if(i<0 || j<0 || i>=arr.length || j>= arr[0].length || arr[i][j]==0) return;

		arr[i][j]=0;

		island(arr,i+1,j);

		island(arr,i-1,j);

		island(arr,i,j+1);

		island(arr,i,j-1);

	}

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();

		int c = sc.nextInt();

		int[][] arr = new int[r][c];

		for(int i=0;i<r;i++)

		{

			for(int j=0;j<c;j++)

			{

				arr[i][j]=sc.nextInt();

			}

		}

		int count = 0;

		for(int i=0;i<r;i++)

		{

			for(int j=0;j<c;j++)

			{

				if(arr[i][j]==1)

				{

					island(arr,i,j);

					count++;

				}

			}

		}

		System.out.print(count);

		sc.close();

	}

}