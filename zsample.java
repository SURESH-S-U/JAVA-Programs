import java.util.Scanner;
import java.util.ArrayList;
import java.lang.reflect.Method;

public class zsample{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Method[] methods = ArrayList.class.getMethods();

        for(Method method : methods){
            System.out.println(method.getName());
        }

    }
}