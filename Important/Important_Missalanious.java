import java.util.*;
public class Important_Missalanious{
    public static void main(String[] args){
        
        

        //  String to integer Conversion;
        String str = "123";
        for(char c : str.toCharArray())
        {
            int n = c - '0';
            System.out.println(n + 10);
        }


        // String split and store it in ArrayList;
        String str = "suresh is a good boy";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        System.out.println(list);

        // Another Method
        String[] arr = str.split(" ");
        for(String s : arr){
            list.add(s);
        }
        System.out.println(list);

        // Replace All unwanted;
        System.out.println(list.toString().replaceAll("[\\[\\], ]", ""));



    }
}