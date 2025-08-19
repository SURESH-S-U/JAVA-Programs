public class Main {
    public static void main(String[] args) {
        String str = "Hello";

        char[] charArray = str.toCharArray(); // Convert to char array

        // Print each character
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}



// Another Method

public class Main {
    public static void main(String[] args) {
        String str = "World";

        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        System.out.println(charArray); // Prints: World
    }
}
