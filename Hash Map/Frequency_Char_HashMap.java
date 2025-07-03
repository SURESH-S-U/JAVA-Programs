import java.util.*;

public class Frequency_Char_HashMap{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            map.put(c , map.getOrDefault(c,0)+1);
        }

        System.out.println(map);

        for(Map.Entry<Character,Integer> pair : map.entrySet())
        {
            System.out.println("Key : "+pair.getKey()+"    Value : "+pair.getValue());
        }

    }

}