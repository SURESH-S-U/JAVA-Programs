class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

public class CircularDoublyLinkedList {
    Node head = null;
    Node tail = null;

    // Insert at End
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;  // Circular link
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    // Insert at Beginning
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }


    // Insert at specific index (0-based)
    public void insertAtIndex(int index, int data) {
        Node newNode = new Node(data);

        if (index <= 0 || head == null) {
            insertBeginning(data);
            return;
        }

        Node curr = head;
        int count = 0;

        // Traverse until the position or tail
        while (count < index - 1 && curr.next != head) {
            curr = curr.next;
            count++;
        }

        if (curr.next == head) {
            // Index is greater than size, insert at end
            insertEnd(data);
        } else {
            // Insert in the middle
            newNode.next = curr.next;
            newNode.prev = curr;
            curr.next.prev = newNode;
            curr.next = newNode;
        }
    }


    // Delete a node by value
    public void delete(int value) {
        if (head == null) return;

        Node curr = head;
        do {
            if (curr.data == value) {
                if (curr == head && curr == tail) { // Only one node
                    head = tail = null;
                } else if (curr == head) {
                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
                return;
            }
            curr = curr.next;
        } while (curr != head);
    }

    // Search for a node
    public boolean search(int key) {
        if (head == null) return false;

        Node curr = head;
        do {
            if (curr.data == key) return true;
            curr = curr.next;
        } while (curr != head);

        return false;
    }

    // Display list forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        System.out.print("Forward: ");
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    // Display list backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = tail;
        System.out.print("Backward: ");
        do {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        } while (curr != tail);
        System.out.println();
    }

    // Main for testing
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        cdll.insertEnd(10);
        cdll.insertEnd(20);
        cdll.insertBeginning(5);
        cdll.insertAtIndex(2,55);
        cdll.insertEnd(30);

        cdll.displayForward();   // Forward: 5 10 20 30
        cdll.displayBackward();  // Backward: 30 20 10 5

        cdll.delete(10);
        cdll.displayForward();   // Forward: 5 20 30

        System.out.println("Found 20? " + cdll.search(20));  // true
        System.out.println("Found 99? " + cdll.search(99));  // false
    }

}
