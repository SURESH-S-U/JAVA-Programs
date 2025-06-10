import java.util.ArrayList;
import java.util.Collections;

public class A_ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 25); // inserts 25 at index 1

        // Accessing elements
        System.out.println("Element at index 2: " + numbers.get(2));

        // Updating an element
        numbers.set(1, 50); // Replaces element at index 1 with 50

        // Removing an element
        numbers.remove(2); // Remove element at index 2

        // Checking size
        System.out.println("Size: " + numbers.size());

        // Checking if the list contains a value
        System.out.println("Contains 20? " + numbers.contains(20));

        // Print the list
        System.out.println(numbers);


        // for get single index of element.

        for(int i = 0 ; i< 5 ;i++)
        {
            System.out.print(numbers.get(i));
        }






        //  FOR  STRING




        import java.util.ArrayList;
        import java.util.Collections;

        public class SortArrayList {
        public static void main(String[] args) {
            ArrayList<String> cities = new ArrayList<>();
            cities.add("Chennai");
            cities.add("Mumbai");
            cities.add("Delhi");

            // Sorting in ascending order
            Collections.sort(cities);
            System.out.println("Sorted: " + cities);
            }
        }






        // for reverse and sort in ArrayList;

        Collections.sort(cities);
        System.out.println("Sorted: " + cities);

        Collections.reverse(cities);
        System.out.println("Sorted: " + cities);

    }
}


