import java.util.*;   // Amstrong means Sum of, each digits with the power of numbeer of digits. 

public class Amstrong{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int digit = 0;
        int result = 0;

        int num = scanner.nextInt();
        int onum = num;
        while(num>0){
            digit = num%10;
            result += Math.pow(digit,3);
            num /= 10;
        }

        if(onum == result){
            System.out.printf("%d is amstrong number.",onum);
        }
    }
}