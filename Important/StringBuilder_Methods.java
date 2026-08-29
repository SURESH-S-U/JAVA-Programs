import java.util.*;

public class StringBuilder_Methods {

    public static void main(String[] args) {

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Initial String : " + sb);

        // ======================================================
        // 1. append() - Adds text at the end
        // ======================================================
        sb.append(" World");
        System.out.println("\n1. append(\" World\")");
        System.out.println("Output : " + sb); // Hello World

        // ======================================================
        // 2. insert(index, value) - Inserts text at the given index
        // ======================================================
        sb.insert(5, ",");
        System.out.println("\n2. insert(5, \",\")");
        System.out.println("Output : " + sb); // Hello, World

        // ======================================================
        // 3. delete(start, end) - Deletes characters from start
        // to end-1
        // ======================================================
        sb.delete(5, 7);
        System.out.println("\n3. delete(5, 7)");
        System.out.println("Output : " + sb); // HelloWorld

        // ======================================================
        // 4. deleteCharAt(index) - Deletes one character
        // ======================================================
        sb.deleteCharAt(5);
        System.out.println("\n4. deleteCharAt(5)");
        System.out.println("Output : " + sb); // Helloorld

        // ======================================================
        // 5. replace(start, end, string)
        // ======================================================
        sb.replace(5, 9, " Java");
        System.out.println("\n5. replace(5, 9, \" Java\")");
        System.out.println("Output : " + sb); // Hello Java

        // ======================================================
        // 6. reverse() - Reverses the string
        // ======================================================
        sb.reverse();
        System.out.println("\n6. reverse()");
        System.out.println("Output : " + sb); // avaJ olleH

        // Reverse again to restore original
        sb.reverse();

        // ======================================================
        // 7. charAt(index) - Returns character at index
        // ======================================================
        System.out.println("\n7. charAt(1)");
        System.out.println("Output : " + sb.charAt(1)); // e

        // ======================================================
        // 8. setCharAt(index, ch) - Changes character
        // ======================================================
        sb.setCharAt(0, 'Y');
        System.out.println("\n8. setCharAt(0, 'Y')");
        System.out.println("Output : " + sb); // Yello Java

        // ======================================================
        // 9. indexOf(string) - First occurrence
        // ======================================================
        System.out.println("\n9. indexOf(\"Java\")");
        System.out.println("Output : " + sb.indexOf("Java")); // 6

        // ======================================================
        // 10. lastIndexOf(string) - Last occurrence
        // ======================================================
        StringBuilder sb2 = new StringBuilder("banana");

        System.out.println("\n10. lastIndexOf(\"a\")");
        System.out.println("String : " + sb2);
        System.out.println("Output : " + sb2.lastIndexOf("a")); // 5

        // ======================================================
        // 11. length() - Returns total number of characters
        // ======================================================
        System.out.println("\n11. length()");
        System.out.println("Output : " + sb.length()); // 10

        // ======================================================
        // 12. substring(start)
        // ======================================================
        StringBuilder sb3 = new StringBuilder("Programming");

        System.out.println("\n12. substring(3)");
        System.out.println("Output : " + sb3.substring(3)); // gramming

        // ======================================================
        // 13. substring(start, end)
        // ======================================================
        System.out.println("\n13. substring(3, 7)");
        System.out.println("Output : " + sb3.substring(3, 7)); // gram

        // ======================================================
        // 14. toString() - Converts StringBuilder to String
        // ======================================================
        String str = sb3.toString();

        System.out.println("\n14. toString()");
        System.out.println("Output : " + str);
        System.out.println("Type : " + str.getClass().getSimpleName()); // String

        // ======================================================
        // 15. capacity() - Returns current capacity
        // Default capacity = Initial String Length + 16
        // ======================================================
        System.out.println("\n15. capacity()");
        System.out.println("Output : " + sb3.capacity());

        // ======================================================
        // 16. ensureCapacity(minCapacity)
        // Increases capacity if needed
        // ======================================================
        sb3.ensureCapacity(50);

        System.out.println("\n16. ensureCapacity(50)");
        System.out.println("Capacity : " + sb3.capacity());

        // ======================================================
        // 17. setLength(length)
        // Changes the length of StringBuilder
        // ======================================================
        sb3.setLength(7);

        System.out.println("\n17. setLength(7)");
        System.out.println("Output : " + sb3); // Program

        // ======================================================
        // 18. append various data types
        // ======================================================
        StringBuilder sb4 = new StringBuilder();

        sb4.append(100);
        sb4.append(" ");
        sb4.append(25.5);
        sb4.append(" ");
        sb4.append(true);

        System.out.println("\n18. append(int, double, boolean)");
        System.out.println("Output : " + sb4);

        // ======================================================
        // 19. compareTo() (Java 11+)
        // Returns:
        // 0  -> Equal
        // <0 -> Smaller
        // >0 -> Greater
        // ======================================================
        StringBuilder s1 = new StringBuilder("Apple");
        StringBuilder s2 = new StringBuilder("Banana");

        System.out.println("\n19. compareTo()");
        System.out.println("Output : " + s1.compareTo(s2));

        // ======================================================
        // 20. isEmpty() (Java 15+)
        // ======================================================
        StringBuilder empty = new StringBuilder();

        System.out.println("\n20. isEmpty()");
        System.out.println("Output : " + empty.isEmpty()); // true
    }
}