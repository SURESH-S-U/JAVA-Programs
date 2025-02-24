import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
                                                        // Same for arrays.
                                                        // But we have to import arrays

                                                        // same for ArrayList also
                                                        // import ArrayList
public class A_Print_All_Methods{
    public static void main(String[] args){
        
        Method[] methods = ArrayList.class.getMethods();

        for(Method method : methods){
            System.out.println(method.getName());
        }
    }
}