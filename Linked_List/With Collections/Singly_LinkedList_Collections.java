import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("🔹 Adding Elements:");
        list.add("Apple");
        list.addFirst("Mango");
        list.addLast("Banana");
        list.add(1, "Orange");
        System.out.println("List after additions: " + list); // [Mango, Orange, Apple, Banana]

        System.out.println("\n🔹 Accessing Elements:");
        System.out.println("First: " + list.getFirst());      // Mango
        System.out.println("Last: " + list.getLast());        // Banana
        System.out.println("At index 2: " + list.get(2));     // Apple
        System.out.println("Peek: " + list.peek());           // Mango
        System.out.println("PeekFirst: " + list.peekFirst()); // Mango
        System.out.println("PeekLast: " + list.peekLast());   // Banana

        System.out.println("\n🔹 Removing Elements:");
        list.remove();                // removes first (Mango)
        list.remove(1);               // removes index 1 (Apple)
        list.removeFirst();           // removes Orange
        list.removeLast();            // removes Banana (now empty)
        System.out.println("List after removals: " + list);   // []

        list.offer("Grapes");
        list.offerFirst("Kiwi");
        list.offerLast("Pineapple");
        System.out.println("List after offer: " + list);      // [Kiwi, Grapes, Pineapple]

        list.poll();                  // removes Kiwi
        list.pollFirst();            // removes Grapes
        list.pollLast();             // removes Pineapple
        System.out.println("List after polls: " + list);      // []

        System.out.println("\n🔹 Search & Check:");
        list.add("Strawberry");
        list.add("Blueberry");
        list.add("Blackberry");
        System.out.println("List: " + list);
        System.out.println("Contains Blueberry? " + list.contains("Blueberry")); // true
        System.out.println("Index of Strawberry: " + list.indexOf("Strawberry")); // 0
        System.out.println("Last Index of Blackberry: " + list.lastIndexOf("Blackberry")); // 2
        System.out.println("Is Empty? " + list.isEmpty()); // false
        System.out.println("Size: " + list.size());        // 3

        System.out.println("\n🔹 Other Methods:");
        list.set(1, "Cherry");
        System.out.println("List after set: " + list); // [Strawberry, Cherry, Blackberry]

        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array)); // [Strawberry, Cherry, Blackberry]

        LinkedList<String> cloned = (LinkedList<String>) list.clone();
        System.out.println("Cloned List: " + cloned);

        System.out.println("Reverse Order using descendingIterator:");
        Iterator<String> rev = list.descendingIterator();
        while (rev.hasNext()) {
            System.out.print(rev.next() + " "); // Blackberry Cherry Strawberry
        }

        System.out.println("\n\n🔹 Clear List:");
        list.clear();
        System.out.println("List after clear: " + list); // []
    }
}
