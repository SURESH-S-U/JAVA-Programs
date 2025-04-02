import java.util.Scanner;
import java.util.ArrayList;

public class A_Add_num_Arrlist{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> nums = new ArrayList<>();

        while(n>0)
        {
            int  digit = n % 10;
            nums.add(digit);
            n /= 10;
        }

        String out = nums.toString().replaceAll("[\\[\\] ]", "");

        System.out.print(out);

    }
}