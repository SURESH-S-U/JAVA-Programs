import java.util.*;

public class HashMap_Basics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 3);
        map.put("banana", 5);

        System.out.println(map.get("apple")); // 3
        System.out.println(map.getOrDefault("cherry", 0)); // 0
        System.out.println(map.containsKey("banana")); // true
        System.out.println(map.containsValue(5)); // true

        map.remove("apple");

        for (String key : map.keySet()){
            System.out.println("Key: " + key);
        }

        for (Integer value : map.values()) {                 // We can only print like this.
            System.out.println("Value: " + value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {           // Map.Entry<String, Integer>   This is a Data type.
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        
        for(Map.Entry<String,Integer> pair : map.entrySet())           // To access HashMap Key and Value at the same time.
        {
            System.out.println("Key : "+pair.getKey()+" Value : "+pair.getValue());
        }

        System.out.println(map);     // We can print like this. But it will print as a Dictionary.

        System.out.println(map.size());

        System.out.println(map.getOrDefault("Apple",0));
    }
}
