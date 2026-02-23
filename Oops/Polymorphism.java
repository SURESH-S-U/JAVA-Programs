import java.util.*;

// Same method name but diff parameters and return types.

public class Polymorphism{

    // It will execute when 2 Integer params
    void add(int a, int b)
    {
        System.out.println(a+b);
    }

    // It will execute when 3 Integer params
    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }

    // It will execute when 2 Double params
    void add(double a, double b)
    {
        System.out.println(a+b);
    }


    // VarArgs
    // We can use it when we dont know how many parameters will be come.
    // All values will be stored in the Array named arr.
    void add(int...arr)
    {
        int sum = 0;
        for(int num : arr)
        {
            sum += num;
        }

        System.out.println(sum);
    }

    public static void main(String[] args){
        
        Polymorphism obj = new Polymorphism();

        obj.add(1,2);

        obj.add(1.5,2.5);

        obj.add(1,2,3);

        obj.add(1,2,3,4,5,6,7,121,3435,6768,8090);

    }
}