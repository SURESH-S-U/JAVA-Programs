import java.util.*;

class Node {
    int data;
    Node next;

    // Constructor to initialize a node
    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class Singly_LinkedList {

    // Head of the linked list
    static Node head = null;

    // ---------------- INSERT AT BEGINNING ----------------
    public static void insertBgn(int x) {
        Node newNode = new Node(x);

        // New node points to current head
        newNode.next = head;

        // Head becomes the new node
        head = newNode;

        System.out.println("New Value " + x + " Inserted at Beginning.");
    }

    // ---------------- INSERT AT END ----------------
    public static void insertEnd(int x) {

        Node newNode = new Node(x);

        // If list is empty
        if (head == null) {
            head = newNode;
            System.out.println("New Value " + x + " Inserted at End.");
            return;
        }

        // Traverse till the last node
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the last node to new node
        temp.next = newNode;

        System.out.println("New Value " + x + " Inserted at End.");
    }

    // ---------------- INSERT AT SPECIFIC POSITION ----------------
    public static void insertPos(int idx, int x) {

        if (idx < 0) {
            System.out.println("Invalid Index.");
            return;
        }

        // Insert at beginning
        if (idx == 0) {
            insertBgn(x);
            return;
        }

        Node temp = head;
        int i = 0;

        // Traverse till index-1
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        // Invalid position
        if (temp == null) {
            System.out.println("Invalid Index.");
            return;
        }

        Node newNode = new Node(x);

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("New Value " + x + " Inserted at Index " + idx);
    }

    // ---------------- DELETE ----------------
    public static void delete(int idx) {

        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        // Delete first node
        if (idx == 0) {
            System.out.println("Deleted Element : " + head.data);
            head = head.next;
            return;
        }

        Node temp = head;

        // Reach node before deleting position
        for (int i = 0; i < idx - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid Index.");
            return;
        }

        System.out.println("Deleted Element : " + temp.next.data);

        temp.next = temp.next.next;
    }

    // ---------------- SEARCH ----------------
    public static void search(int num) {

        Node temp = head;
        int pos = 0;

        while (temp != null) {

            if (temp.data == num) {
                System.out.println("Element Found at Index : " + pos);
                return;
            }

            temp = temp.next;
            pos++;
        }

        System.out.println("Element Not Found.");
    }

    // ---------------- DISPLAY ----------------
    public static void display() {

        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node temp = head;

        System.out.print("Linked List : ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // ---------------- REVERSE LINKED LIST ----------------
    public static void reverse() {

        // Previous node
        Node prev = null;

        // Current node
        Node curr = head;

        // Store next node
        Node next = null;

        // Traverse entire list
        while (curr != null) {

            // Store next node before breaking the link
            next = curr.next;

            // Reverse the pointer
            curr.next = prev;

            // Move prev one step forward
            prev = curr;

            // Move curr one step forward
            curr = next;
        }

        // Update head
        head = prev;

        System.out.println("Linked List Reversed Successfully.");
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== Singly Linked List ==========");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Specific Position");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Display");
            System.out.println("7. Reverse Linked List");
            System.out.println("8. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Value : ");
                    insertBgn(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter Value : ");
                    insertEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Index : ");
                    int idx = sc.nextInt();

                    System.out.print("Enter Value : ");
                    int value = sc.nextInt();

                    insertPos(idx, value);
                    break;

                case 4:
                    System.out.print("Enter Index to Delete : ");
                    delete(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Element to Search : ");
                    search(sc.nextInt());
                    break;

                case 6:
                    display();
                    break;

                case 7:
                    reverse();
                    break;

                case 8:
                    System.out.println("Program Exited.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}