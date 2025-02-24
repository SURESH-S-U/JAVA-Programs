import java.util.ArrayList;
import java.util.Collections;

public class A_ArrayList_Methods {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("ArrayList created: " + numbers);

        // 2. Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("After adding elements: " + numbers); // [10, 20, 30]

        // 3. Adding element at a specific index
        numbers.add(1, 15);
        System.out.println("After adding 15 at index 1: " + numbers); // [10, 15, 20, 30]

        // 4. Accessing elements
        System.out.println("Element at index 2: " + numbers.get(2)); // 20

        // 5. Updating an element
        numbers.set(1, 25);
        System.out.println("After updating index 1: " + numbers); // [10, 25, 20, 30]

        // 6. Removing elements
        numbers.remove(2);
        System.out.println("After removing element at index 2: " + numbers); // [10, 25, 30]

        // 7. Checking if an element exists
        System.out.println("Contains 25? " + numbers.contains(25)); // true

        // 8. Finding index of an element
        System.out.println("Index of 30: " + numbers.indexOf(30)); // 2

        // 9. Checking if the ArrayList is empty
        System.out.println("Is empty? " + numbers.isEmpty()); // false

        // 10. Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + numbers.size()); // 3

        // 11. Sorting the ArrayList
        numbers.add(5);
        numbers.add(40);
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers); // [5, 10, 25, 30, 40]

        // 12. Reversing the ArrayList
        Collections.reverse(numbers);
        System.out.println("After reversing: " + numbers); // [40, 30, 25, 10, 5]

        // 13. Cloning the ArrayList
        ArrayList<Integer> clonedList = (ArrayList<Integer>) numbers.clone();
        System.out.println("Cloned List: " + clonedList); // [40, 30, 25, 10, 5]

        // 14. Converting ArrayList to an array
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 15. Clearing the ArrayList
        numbers.clear();
        System.out.println("After clearing: " + numbers); // []
    }
}
