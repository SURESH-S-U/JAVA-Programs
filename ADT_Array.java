class ArrayADT {
    private int[] arr;
    private int size;
    private int capacity;

    // Constructor
    public ArrayADT(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    // Insert a value
    public void insert(int val) {
        if (size < capacity) {
            arr[size++] = val;
        } else {
            System.out.println("Overflow: Cannot insert " + val);
        }
    }

    // Get element at index
    public int get(int index) {
        if (index >= 0 && index < size) {
            return arr[index];
        } else {
            System.out.println("Invalid index: " + index);
            return -1;
        }
    }

    // Get current number of elements
    public int length() {
        return size;
    }

    // Display array contents
    public void display() {
        System.out.print("ADT Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Main class to run ADT array demo
public class ADTArrayDemo {
    public static void main(String[] args) {
        System.out.println("ADT Array Demo:");

        ArrayADT adt = new ArrayADT(10);   // It id object 

        adt.insert(5);
        adt.insert(10);
        adt.insert(15);

        adt.display();
        System.out.println("Element at index 1: " + adt.get(1));
        System.out.println("Length: " + adt.length());
    }
}
