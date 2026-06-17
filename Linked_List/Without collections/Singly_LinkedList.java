import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class Singly_LinkedList {

    static Node head = null;

    public static void insertBgn(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        System.out.println("New Value " + x + " Inserted at Beginning.");
    }

    public static void insertEnd(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            System.out.println("New Value " + x + " Inserted at End (List was empty).");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println("New Value " + x + " Inserted at End.");
    }

    public static void insertPos(int idx, int x) {
        if (idx < 0) {
            System.out.println("Invalid index.");
            return;
        }

        if (idx == 0) {
            insertBgn(x);         // Calling the InsertBegining Function to insert at index 0;
            return;
        }

        Node temp = head;

        int i = 0;
        while(i < idx - 1 && temp != null)  // If temp reach null before i reach idx means invalid idx.(Out of bound)
        {
            temp = temp.next;
            i++;
        }

        if (temp == null) {         // If temp reach null before i reach idx means invalid idx.(Out of bound)
            System.out.println("Invalid index. Cannot insert.");
            return;
        }

        Node newNode = new Node(x);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("New Value " + x + " Inserted at index: " + idx);
    }

    public static void delete(int idx) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (idx == 0) {
            System.out.println("Element: " + head.data + " deleted.");
            head = head.next;                         // To make the Head null. So no more values....
            return;
        }

        Node temp = head;
        for (int i = 0; i < idx - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid index. Cannot delete.");
            return;
        }

        System.out.println("Element: " + temp.next.data + " deleted.");
        temp.next = temp.next.next;
    }

    public static void Search(int num) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == num) {
                System.out.println("Element Exists.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element Not Found.");
    }

    public static void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Singly_LinkedList obj = new Singly_LinkedList();

            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("0: Insert at End");
            System.out.println("1: Insert at Beginning");
            System.out.println("2: Insert at Specific Position");
            System.out.println("3: Delete at Index");
            System.out.println("4: Search for an Element");
            System.out.println("5: Display the List");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");
            
        while (true) {
            int inp = sc.nextInt();

            switch (inp) {
                case 0:
                    System.out.print("Enter the value to insert at end: ");
                    int x0 = sc.nextInt();
                    insertEnd(x0);
                    break;

                case 1:
                    System.out.print("Enter the value to insert at beginning: ");
                    int x1 = sc.nextInt();
                    insertBgn(x1);
                    break;

                case 2:
                    System.out.print("Enter the index and value to insert: ");
                    int idx = sc.nextInt();
                    int x2 = sc.nextInt();
                    insertPos(idx, x2);
                    break;

                case 3:
                    System.out.print("Enter the index to delete: ");
                    int idx2 = sc.nextInt();
                    delete(idx2);
                    break;

                case 4:
                    System.out.print("Enter the value to search: ");
                    int num = sc.nextInt();
                    Search(num);
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
