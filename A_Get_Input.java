import java.util.Scanner;

public class A_Get_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer Input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Float Input
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        // Double Input
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Long Input
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();

        // Short Input
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();

        // Byte Input
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();

        // Boolean Input
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Character Input
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);

        // String Input
        scanner.nextLine(); // Consume newline
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        // Displaying the Inputs
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Long: " + longValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("Character: " + charValue);
        System.out.println("String: " + stringValue);

        scanner.close();
    }
}
