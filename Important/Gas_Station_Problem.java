

//  Search Problem name in online for Question:
// Gas Station problem

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];
        int[] c = new int[n];

        for(int i=0;i<n;i++)
        {
            p[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            c[i] = sc.nextInt();
        }

        int st = -1;
        int tot = 0;
        
        for(int i=0;i<n;i++)
        {
            tot = 0;
            tot += p[i];
            if(tot - c[i] >= 0)
            {
                st = i;
                tot -= c[i];

                int j = 0;
                if(st + 1 == n)
                {
                    j = 0;
                }
                else j = st+1;
                
                while(j < n)
                {
                    if(j == st)
                    {
                        System.out.println(st);
                        return;
                    }
                    tot += p[j];
                    tot -= c[j];
                    

                    if(!(tot >= 0))
                    {
                        break;
                    }


                    j++;
                    
                    if(j == n)
                    {
                        j = j  % n;
                    }
                }
            }
        }

        System.out.println(-1);
    }
}