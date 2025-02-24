import java.util.Scanner;                     // if you want to reverse the list array.
                                              // just copy it and reverse like below
import java.util.ArrayList;
import java.util.Collections;

public class A_ArrayList_Reverse{
    public static void main(String[] args){           //   Find Size of ArrayList :
                                                      //   num.size()
    Scanner scanner = new Scanner(System.in);

    int size = scanner.nextInt();

    ArrayList<Integer> num = new ArrayList<>();

    for(int i=0;i<size;i++)
    {
        num.add(scanner.nextInt());
    }

    for(int i=0; i < num.size() ;i++)         // num.size()
    {
        System.out.print(num.get(i) + " ");         // num.get(i)    for getting the specific index
    }

    System.out.println();

    
    // Creating a new list and copying elements from num
    ArrayList<Integer> rev = new ArrayList<>(num);                    // note ArrayList<>(num)    it is important

    // Reversing num2
    Collections.reverse(rev);

        // Printing reversed list
    for (int i = 0; i < rev.size(); i++) {
        System.out.print(rev.get(i) + " ");
    }

     scanner.close();  // Fix: Close scanner to prevent resource leak
    }
}