import java.util.*;

public class TernaryOperator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b){
            System.out.println("yes");
        }

        float avg = (float) (a+b+c)/3;

        System.out.println("Avg is : "+ avg);

        if(avg > a && avg > b && avg > c){
            System.out.println("Avg grater than all 3 numbers !..");
        }
        
        if(a<b && a<c){
            a += 1;
        }
        else{
            a -= 1;
        }

        int min = (a<b && a<c) ? a : (b<c && b<a) ? b : c;
        System.out.println("The min is : "+min);

    }
}