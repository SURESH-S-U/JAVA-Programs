public class NoMatchNoDefault {
    public static void main(String[] args) {
        int num = 5;

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}




// Using String Variable in Switch casse:


public class SwitchStringExample {
    public static void main(String[] args) {


        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Banana":
                System.out.println("Yellow fruit");
                break;
            default:
                System.out.println("Unknown fruit");


        }
    }
}





// Using Lambda or Arrow Operator   ->


public class ArrowSwitchExample {
    public static void main(String[] args) {                    // By using ->   No need to using   break for each line;
                                                                // Each line will automatically ends.
        String day = "Monday";

        switch (day) {

            case "Monday" -> System.out.println("Start of the week!");

            case "Friday" -> System.out.println("Almost weekend!");

            case "Sunday" -> System.out.println("Rest day!");

            default -> System.out.println("Just another day.");
        }
    }
}



// Using Switch case In   Return method :

public class SwitchReturnExample {

    public static String getDayType(String day) {

        return switch (day) {            // note this line it will return the result of the Switch case.

            case "Monday" -> "Weekday";

            case "Sunday" -> "Weekend";

            default -> "Invalid day";

        };
    }
}




// Using Many alternative conditional expression in one case:

public class SwitchReturnExample {

    public static String getDayType(String day) {

        return switch (day) {

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";

            case "Saturday", "Sunday" -> "Weekend";

            default -> "Invalid day";

        };
    }

    public static void main(String[] args) {
        
        System.out.println(getDayType("Monday"));   // Weekday
        System.out.println(getDayType("Sunday"));   // Weekend
        System.out.println(getDayType("Funday"));   // Invalid day
    }
}

