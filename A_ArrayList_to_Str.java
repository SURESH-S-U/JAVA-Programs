import java.util.ArrayList;

public class A_ArrayList_to_Str {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        String result = String.join(", ", list);
        System.out.println(result);
        // Output: Apple, Banana, Cherry
    }
}



// String to Array List in java        add in character ArrayList


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";

        ArrayList<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        System.out.println(list);
        // Output: [H, e, l, l, o]
    }
}



//  Add in ArrayList<String>      add in string Arraylist

import java.util.ArrayList;

class Solution {
    public String getHint(String secret, String guess) {
        int A_count = 0;  // Bulls count
        int B_count = 0;  // Cows count

        ArrayList<String> A_secret = new ArrayList<>();
        ArrayList<String> A_guess = new ArrayList<>();

        // Add characters to ArrayList as Strings
        for (char c : secret.toCharArray()) {
            A_secret.add(String.valueOf(c)); // Convert char to String
        }
        for (char c : guess.toCharArray()) {
            A_guess.add(String.valueOf(c));  // Convert char to String
        }

        String str = String.join(",", A_guess);  // Join A_guess for testing
        System.out.println(str);  // Output the guess as a comma-separated string
        
        return ""; 
    }
}
