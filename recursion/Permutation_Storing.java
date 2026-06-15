import java.util.*;
public class Permutation_Storing{

    static void permutation(String str, String temp, ArrayList<String> list)
    {
        if(str.length() == 0)
        {
            list.add(temp);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            
            String sub = str.substring(0,i) + str.substring(i+1);

            permutation(sub, temp + c, list);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        ArrayList<String> list = new ArrayList<>();

        permutation(str, "", list);

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}