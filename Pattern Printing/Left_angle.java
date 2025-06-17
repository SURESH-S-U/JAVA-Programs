

//      *
//     **
//    ***



import java.util.*;

public class Left_angle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int col = sc.nextInt();
        int s = 0;
        int e = col-1;
    
    for(int j= 0;j<col;j++)
    {
        if(s>e)
        {
            break;
        }
        for(int i=0;i<col;i++)
        {
            if(i <= s || i >= e)
            {
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }

           
        }
            s++;
            e--;
         System.out.println();
    }
}
}