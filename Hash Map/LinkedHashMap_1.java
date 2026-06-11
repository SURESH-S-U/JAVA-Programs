
// Linked HashMap is a combination of HashMap and LinkedList

import java.util.*;
public class LinkedHashMap_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        String str = sc.nextLine();

        for(char ch : str.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character key : map.keySet())
        {
            System.out.println(key +" -> "+map.get(key));
        }

        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}