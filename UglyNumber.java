import java.util.Scanner;

public class UglyNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while(num%2==0){
            num/=2;
        }
        while(num%3==0){
            num/=3;
        }
        while(num%5==0){
            num/=5;
        }

        if(num == 1){
            System.out.print("It is Ugly number.");
        }
    }
}