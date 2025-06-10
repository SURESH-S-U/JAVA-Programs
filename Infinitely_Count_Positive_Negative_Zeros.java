import java.util.*;

public class Infinitely_Count_Positive_Negative_Zeros{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int Pco = 0;
        int Nco = 0;
        int Zco = 0;

        while(true)
        {
            sc.nextLine();

            String n = sc.nextLine();
            
            if((int)n == 0)
            {
                Zco++;
            }
            else if((int)n > 0)
            {
                Pco++;
            }
            else if(n < "0"){
                Nco++;
            }

            else{
                break;
            }
        }

        System.out.println("Positive count : "+ Pco);
        System.out.println("Negative count : "+ Nco);
        System.out.println("Zero count : "+ Zco);

    }
}