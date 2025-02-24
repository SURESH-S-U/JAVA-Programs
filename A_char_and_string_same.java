

                                                            // if we get the char or int first.
import java.util.Scanner;                                   // we must give the scanner.newLine()
                                                            // else it does not read the string properly
public class A_char_and_string_same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking character input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);  // Read first character

        scanner.nextLine();  // Consume the leftover newline

        // Taking string input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();  // Read entire line

        // Displaying the inputs
        System.out.println("\nYou entered:");
        System.out.println("Character: " + ch);
        System.out.println("String: " + str);

        scanner.close();
    }
}
