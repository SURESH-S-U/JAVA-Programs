import java.util.*;

// This code implements Map like Data structure using ArrayList;

public class Max_Revenue_Schedule_Optimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<int[]> jobs = new ArrayList<>();

        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {

            int deadline = sc.nextInt();
            int profit = sc.nextInt();

            jobs.add(new int[]{deadline, profit});

            maxDeadline = Math.max(maxDeadline, deadline);
        }

        // Sort by profit in descending order
        jobs.sort((a, b) -> b[1] - a[1]);

        boolean[] slot = new boolean[maxDeadline + 1];

        int count = 0;
        int sum = 0;

        for (int[] job : jobs) {

            int deadline = job[0];
            int profit = job[1];

            for (int j = deadline; j >= 1; j--) {

                if (!slot[j]) {

                    slot[j] = true;
                    count++;
                    sum += profit;
                    break;
                }
            }
        }

        System.out.println(count + " " + sum);
    }
}