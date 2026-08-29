

//  Search Problem name in online for Question:
// Gas Station problem


import java.util.*;
public class Gas_Station_Optimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] provided = new int[n];
        int[] consumption = new int[n];

        for(int i=0;i<n;i++)
        {
            provided[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            consumption[i] = sc.nextInt();
        }


        int stIdx = 0;

        int diff = 0;
        int prevDiff = 0;
        int totRequired = 0;

        for(int i=0;i<n;i++)
        {
            diff = provided[i] - consumption[i];
            totRequired += diff;
            prevDiff += diff;

            if(prevDiff < 0)
            {
                stIdx = i + 1;
                prevDiff = 0;
            }
        }

        if(totRequired >= 0)
        {
            System.out.println(stIdx);
        }else{
            System.out.println(-1);
        }

    }
}
