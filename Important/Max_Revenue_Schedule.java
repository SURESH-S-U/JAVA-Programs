
//  Search Problem name in online for Question:
// Marketing campaign schedule for maximum revenue


// But this code won't work with duplicate revenue.

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

        int max = 0;
        
        for(int i=0;i<n;i++)
        {
            int val = sc.nextInt();
            int key = sc.nextInt();

            map.put(key,val);

            if(val > max)
            {
                max = val;
            }
        }

        int[] arr = new int[max + 1];

        Arrays.fill(arr, -1);

        int sum = 0;
        int count = 0;
        
        for(int key : map.keySet())
        {
            int temp = map.get(key);

            for(int i=temp; i>=1;i--)
            {
                if(arr[i] == -1)
                {
                    arr[i] = key;
                    count++;
                    sum += key;
                    break;
                }
            }
            
        }

        System.out.println(count + " " +sum);
    }
}