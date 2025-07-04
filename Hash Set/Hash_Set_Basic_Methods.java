import java.util.*; // import java.util.*

public class HashSetExample {
    public static void main(String[] args) {

        // HashSet implements Set
        Set<String> fruits = new HashSet<>(); // HashSet, Set

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(null);          // null can be added
        fruits.add("Apple");       // duplicate - will be ignored

        // size()
        System.out.println("Size: " + fruits.size());

        // contains()
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Contains 'Orange': " + fruits.contains("Orange"));

        // remove()
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // isEmpty()
        System.out.println("Is set empty? " + fruits.isEmpty());

        // for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = fruits.iterator(); // Iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // equals() and hashCode() (demonstration)
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Mango");
        anotherSet.add(null);

        System.out.println("\nEquals another set? " + fruits.equals(anotherSet)); // equals()

        // hashCode()
        System.out.println("Hash code of set: " + fruits.hashCode()); // hashCode()

        // clear()
        fruits.clear();
        System.out.println("After clear, isEmpty: " + fruits.isEmpty()); // clear(), isEmpty()
    }
}
