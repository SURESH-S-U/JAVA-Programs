import java.util.Scanner;

class Node3 {
    int data;
    Node3 prev;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly_LinkedList {

    Node3 head = null; // Add this as a class-level variable

    public void insertEnd(int data) {
        Node3 newNode = new Node3(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node3 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertBgn(int data) {
        Node3 newNode = new Node3(data);

        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertPos(int idx, int data) {
        Node3 newNode = new Node3(data);

        if (idx == 0) {
            insertBgn(data);
            return;
        }

        Node3 temp = head;
        for (int i = 0; i < idx - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid Index");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        newNode.prev = temp; // Don't ignore this.

        if (newNode.next != null) // If newNode.next is null
        {
            newNode.next.prev = newNode; // This will crash the program. Don't ignore this.
        }

    }

    public void delete(int idx) {
        if (head == null)
            return;
        if (idx == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null; // If there's only one node, head.next is null, and then head.prev = null will throw a NullPointerException.
            }
            return;
        }

        Node3 temp = head;
        for (int i = 0; i < idx - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid Index");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid Index");
            return;
        }

        if (temp.next.next != null) {
            temp.next = temp.next.next;
            temp.next.prev = temp;
            return;
        }
        temp.next = null;

    }

    public void Search(int key) {
        Node3 temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Element not found");
    }

    public void display() {
        Node3 temp = head;
        System.out.print("List (in insertion order): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayRev() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node3 temp = head;

        // Go to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        System.out.print("List (in reverse order): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // main method;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Singly Linked List Menu ---");
        System.out.println("1: Insert at End");
        System.out.println("2: Insert at Beginning");
        System.out.println("3: Insert at Specific Position");
        System.out.println("4: Delete at Index");
        System.out.println("5: Search for an Element");
        System.out.println("6: Display the List In insertion order");
        System.out.println("7: Display the List In Reverse order");
        System.out.println("8: Exit");
        System.out.print("Enter your choice: ");

        Doubly_LinkedList obj = new Doubly_LinkedList();

        while (true) {
            int inp = sc.nextInt();

            switch (inp) {
                case 1:
                    System.out.print("Enter the value to insert at end: ");
                    int x0 = sc.nextInt();
                    obj.insertEnd(x0);
                    break;

                case 2:
                    System.out.print("Enter the value to insert at beginning: ");
                    int x1 = sc.nextInt();
                    obj.insertBgn(x1);
                    break;

                case 3:
                    System.out.print("Enter the index and value to insert: ");
                    int idx = sc.nextInt();
                    int x2 = sc.nextInt();
                    obj.insertPos(idx, x2);
                    break;

                case 4:
                    System.out.print("Enter the index to delete: ");
                    int pos = sc.nextInt();
                    obj.delete(pos);
                    break;

                case 5:
                    System.out.print("Enter the value to search: ");
                    int num = sc.nextInt();
                    obj.Search(num);
                    break;

                case 6:
                    obj.display();
                    break;

                case 7:
                    obj.displayRev();
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.print("\nEnter your choice: "); // Prompt again
        }
    }
}
