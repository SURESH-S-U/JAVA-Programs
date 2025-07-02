import java.util.Scanner;

public class BackTracking_Maze {

	public static void maze(int x,int y,String path,int[][] arr,boolean[][] check,int n)
	{
		if(x==n-1 && y==n-1)
		{
			System.out.print(path);
			return;
		}

		if(x<0 || y<0 || x>=n || y>=n || arr[x][y]==0 || check[x][y]) return;

		check[x][y]=true;

		maze(x+1,y,path+"D",arr,check,n);

		maze(x-1,y,path+"U",arr,check,n);

		maze(x,y+1,path+"R",arr,check,n);

		maze(x,y-1,path+"L",arr,check,n);

		check[x][y]=false;

	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        boolean[][] check = new boolean[n][n];

        for(int i=0;i<n;i++)

        {
        	for(int j=0;j<n;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        }

        if(arr[0][0]==1) maze(0,0,"",arr,check,n);

        else System.out.print("No Starting Point");

        sc.close();

	}

}