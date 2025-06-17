import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter traffic signal color (red / yellow / green):");
        String color = scanner.nextLine().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("STOP.");
                break;
            case "yellow":
                System.out.println("READY.");
                break;
            case "green":
                System.out.println("GO.");
                break;
            default:
                System.out.println("Invalid signal color entered.");
        }

        scanner.close();
    }
}
