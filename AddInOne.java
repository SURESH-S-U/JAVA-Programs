import java.util.Scanner;

public class AddInOne{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int tot = 0;
        int result = 0;

        for(int i=num1;i<=num2;i++){
            tot += i;
        }

        while(tot>0){
            int digit = tot % 10;
            result += digit;
            tot /= 10;
        }

        System.out.printf("The result is : %d",result);
    }
}