import java.util.*;

public class sample{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        HashMap<String,Integer> map = new HashMap<>();

        map.put("A",10);
        map.put("B",20);
        map.put("C",30);

        /*for(String str : map.keySet())                This is wrong. We cant Access Key  and value Pair without Entry Data type;
        {
            System.out.println("Key : "+str+"  Val : "+str.getValue());      We cant access Like this
        }*/


       
        for(Map.Entry<Character,Integer> pair : map.entrySet())
        {
            System.out.println("Key : "+pair.getKey()+"    Value : "+pair.getValue());  // This is correct Method.
        }


    }

}