import java.util.*;

public class Group_Anagram_Using_HashMap_Optimal{

    // Sorting Method
    static String sort(String s){

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }

    // Main Method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String  str = sc.nextLine();

        String[] arr = str.split(" ");

        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();

        for(int i=0; i < arr.length; i++)
        {
            String s = arr[i];
            
            String sorted = sort(s);

            if(! map.containsKey(sorted))
            {
                map.put(sorted , new ArrayList<>());
            }

            map.get(sorted).add(s);
        }

        for(ArrayList<String> list : map.values())
        {
            System.out.println(list.toString().replaceAll("[\\[\\],]" , ""));
        }

    }
}