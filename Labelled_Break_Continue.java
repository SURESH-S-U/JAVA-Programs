// Normal Break statement
//By using normal break We can only stop the inner loop. Not outer loop.

public class LabelledBreakExample {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                
                if (j == 2) {
                    break;                                    // Normal break
                }
                System.out.printf("i=" + i + ", j=" + j);
            }
        }
    }
}                                                              // Output : 1 1    2 1     3 1





// Labelled Break Statement                   

// If we use labelled Break or continue we can break or continue the Outer loop as well as inner loop.

public class LabelledBreakExample {
    public static void main(String[] args) {

        outer: // Label

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {

                    break outer;  // exits the outer loop directly

                }
                System.out.print("i=" + i + ", j=" + j);               
            }
        }
    }                                                                       // Output :   1 1
}





//Labelled Continue


public class LabelledContinueExample {
    public static void main(String[] args) {

        outer: // Label

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {

                    continue outer; // skips to next iteration of the outer loop
                }
                System.out.printf("i=" + i + ", j=" + j);
            }
        }
    }                                     // Output : 11 13 21 23 31 33
}
