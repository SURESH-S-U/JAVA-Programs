import java.util.*;

public class sample {
    public static void main(String[] args) {
        // Create an array of strings
        String[] arr = {"Apple", "cat", "bat", "toll", "teal", "sit", "bit"};

        /*
         * Arrays.sort with a custom Comparator:
         * (a, b) -> { ... } is a lambda expression that defines how to compare two strings.
         */
        Arrays.sort(arr, (a, b) -> {
            
            int lengthCompare = Integer.compare(a.length(), b.length());
            // Step 1: Compare by length
            // Integer.compare returns:
            //   -1 if a.length() < b.length()
            //    0 if equal
            //    1 if a.length() > b.length()

            // Step 2: If lengths are equal, compare alphabetically (lexicographically)
            if (lengthCompare == 0) {

                return a.compareTo(b);
            }
                // compareTo returns:
                //   negative if a < b
                //   zero if a == b
                //   positive if a > b         
                

            // Step 3: If lengths are not equal, return length comparison result
            return lengthCompare;
        });

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
