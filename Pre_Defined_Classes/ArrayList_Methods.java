// Array List is a class in java that implements a dynamic array.
// Which have lots of inbuild methods that make the operation efficient and optimized.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods {
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
        System.out.println("After adding 15 at index 1:   " + numbers); // [10, 15, 20, 30]


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
        ArrayList<Integer> clonedList = new ArrayList<>(numbers);

        System.out.println("Cloned List: " + clonedList); // [40, 30, 25, 10, 5]


        // 14. Converting ArrayList to an array
        Integer[] array = numbers.toArray(new Integer[0]);

        System.out.print("Array: ");

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println(); // 40 30 25 10 5


        // 15. Clearing the ArrayList
        numbers.clear();

        System.out.println("After clearing: " + numbers); // []


        // ==================== ADDITIONAL ARRAYLIST METHODS ====================


        // 16. lastIndexOf()
        // Description: Finds the index of the LAST occurrence of a given element.
        // If the element is not present, it returns -1.
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("\nNew List: " + list); // [10, 20, 30, 20, 40]

        System.out.println("Last index of 20: " + list.lastIndexOf(20)); // 3


        // 17. Removing a specific value
        // Description: Removes the FIRST occurrence of the specified value.
        // Integer.valueOf(20) converts the int value into an Integer object.
        // This makes Java use remove(Object) instead of remove(int index).
        list.remove(Integer.valueOf(20));

        System.out.println("After removing value 20: " + list);
        // Result: [10, 30, 20, 40]


        // 18. addAll()
        // Description: Adds all elements from another collection
        // to the end of the current ArrayList.
        ArrayList<Integer> newNumbers = new ArrayList<>();

        newNumbers.add(50);
        newNumbers.add(60);

        list.addAll(newNumbers);

        System.out.println("After addAll(): " + list);
        // Result: [10, 30, 20, 40, 50, 60]


        // 19. addAll(index, collection)
        // Description: Adds all elements from another collection
        // starting from the specified index.
        list.addAll(2, newNumbers);

        System.out.println("After addAll at index 2: " + list);
        // Result: [10, 30, 50, 60, 20, 40, 50, 60]


        // 20. removeAll()
        // Description: Removes all occurrences of the elements
        // that are present in the specified collection.
        list.removeAll(newNumbers);

        System.out.println("After removeAll(): " + list);
        // Result: [10, 30, 20, 40]


        // 21. retainAll()
        // Description: Keeps only the elements that are also
        // present in the specified collection.
        // All other elements are removed.
        ArrayList<Integer> commonNumbers = new ArrayList<>();

        commonNumbers.add(10);
        commonNumbers.add(30);
        commonNumbers.add(40);

        list.retainAll(commonNumbers);

        System.out.println("After retainAll(): " + list);
        // Result: [10, 30, 40]


        // 22. containsAll()
        // Description: Checks whether the ArrayList contains
        // ALL elements from the specified collection.
        System.out.println("Contains all elements? "
                + list.containsAll(commonNumbers));
        // Result: true


        // 23. equals()
        // Description: Checks whether two ArrayLists contain
        // the same elements in the same order.
        ArrayList<Integer> anotherList = new ArrayList<>(list);

        System.out.println("Both lists are equal? "
                + list.equals(anotherList));
        // Result: true


        // 24. subList()
        // Description: Returns a portion of the ArrayList.
        // The starting index is included.
        // The ending index is NOT included.
        ArrayList<Integer> sampleList = new ArrayList<>();

        sampleList.add(10);
        sampleList.add(20);
        sampleList.add(30);
        sampleList.add(40);
        sampleList.add(50);

        System.out.println("SubList from index 1 to 4: "
                + sampleList.subList(1, 4));
        // Result: [20, 30, 40]


        // 25. removeIf()
        // Description: Removes elements that satisfy
        // the specified condition.
        sampleList.removeIf(num -> num > 30);

        System.out.println("After removeIf(num > 30): "
                + sampleList);
        // Result: [10, 20, 30]


        // ==================== ADDITIONAL COLLECTIONS METHODS ====================


        ArrayList<Integer> collectionList = new ArrayList<>();

        collectionList.add(30);
        collectionList.add(10);
        collectionList.add(50);
        collectionList.add(20);
        collectionList.add(40);

        System.out.println("\nCollection List: " + collectionList);
        // Result: [30, 10, 50, 20, 40]


        // 26. Collections.max()
        // Description: Finds and returns the largest element
        // in the collection.
        System.out.println("Maximum element: "
                + Collections.max(collectionList));
        // Result: 50


        // 27. Collections.min()
        // Description: Finds and returns the smallest element
        // in the collection.
        System.out.println("Minimum element: "
                + Collections.min(collectionList));
        // Result: 10


        // 28. Collections.frequency()
        // Description: Counts how many times a specified element
        // appears in the collection.
        collectionList.add(20);
        collectionList.add(20);

        System.out.println("Frequency of 20: "
                + Collections.frequency(collectionList, 20));
        // Result: 3


        // 29. Collections.binarySearch()
        // Description: Searches for an element in a SORTED list
        // and returns its index.
        // The list must be sorted before using binarySearch().
        Collections.sort(collectionList);

        System.out.println("Sorted List: " + collectionList);
        // Result: [10, 20, 20, 20, 30, 40, 50]

        System.out.println("Index of 30 using binarySearch: "
                + Collections.binarySearch(collectionList, 30));
        // Result: 4


        // 30. Collections.shuffle()
        // Description: Randomly rearranges the elements
        // in the collection.
        // Result can be different every time the program runs.
        Collections.shuffle(collectionList);

        System.out.println("After shuffle: "
                + collectionList);
        // Example Result: [20, 50, 10, 40, 20, 30, 20]


        // 31. Collections.swap()
        // Description: Swaps the elements at two specified indexes.
        // Here, the elements at index 0 and index 2 are swapped.
        Collections.swap(collectionList, 0, 2);

        System.out.println("After swapping index 0 and 2: "
                + collectionList);
        // Result depends on the shuffled order above.


        // 32. Collections.replaceAll()
        // Description: Replaces every occurrence of an old value
        // with a new value.
        Collections.replaceAll(collectionList, 20, 99);

        System.out.println("After replacing 20 with 99: "
                + collectionList);
        // All occurrences of 20 are replaced with 99.


        // 33. Collections.fill()
        // Description: Replaces every element in the existing list
        // with the specified value.
        ArrayList<Integer> fillList = new ArrayList<>();

        fillList.add(1);
        fillList.add(2);
        fillList.add(3);
        fillList.add(4);
        fillList.add(5);

        Collections.fill(fillList, 0);

        System.out.println("After fill(): " + fillList);
        // Result: [0, 0, 0, 0, 0]


        // 34. Collections.disjoint()
        // Description: Checks whether two collections have
        // NO elements in common.
        // Returns true if there are no common elements.
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(4);
        list2.add(5);
        list2.add(6);


        System.out.println("Lists have no common elements? "
                + Collections.disjoint(list1, list2));
        // Result: true


        // 35. Collections.copy()
        // Description: Copies all elements from the source list
        // to the destination list.
        // The destination list must already have enough space.
        ArrayList<Integer> source = new ArrayList<>();

        source.add(10);
        source.add(20);
        source.add(30);


        ArrayList<Integer> destination = new ArrayList<>();

        destination.add(0);
        destination.add(0);
        destination.add(0);


        Collections.copy(destination, source);

        System.out.println("Copied List: " + destination);
        // Result: [10, 20, 30]
    }
}
