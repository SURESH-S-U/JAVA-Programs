import java.util.Scanner;
    /*
      Input:
      4
             7
           8 4
         9 5 2
      10 6 3 1

    */

public class Patter_LeftAngle_Numbers {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Find the starting number of the first row
        int st = 1 + (n * (n - 1)) / 2;

        int ct = 0;      // Number of extra elements in each row
        int space = n;   // Leading spaces

        // Traverse each row
        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int s = 0; s < space; s++) {
                System.out.print("  ");
            }
            space--;

            // Print the first element of the row
            System.out.print(st + " ");

            int temp = st;
            int diff = n;

            // Print the remaining elements
            while (ct > 0 && diff > (n - ct)) {
                temp -= diff;
                System.out.print(temp + " ");
                diff--;
            }

            st++;   // Starting number for next row
            ct++;   // Increase number of elements in next row

            System.out.println();
        }

        sc.close();
    }
}