// Node class
class Node6 {
    int data;
    Node6 next;

    Node6(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class MyLinkedList {
    Node6 head;

    // Insert at end
    public void insert(int data) {
        Node6 newNode = new Node6(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node6 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Compare with another LinkedList
    public boolean compare(MyLinkedList other) {        // Another Linked list passed as a parameter.
        Node6 temp1 = this.head;                        // Reference of current called Linked List.
        Node6 temp2 = other.head;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // If one list is longer than the other
        return temp1 == null && temp2 == null;
    }

    // Print list
    public void printList() {
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class Implement_Mutiple_linkedList_And_compare {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();

        list1.insert(10);
        list1.insert(20);
        list1.insert(30);

        list2.insert(10);
        list2.insert(20);
        list2.insert(30);

        System.out.print("List 1: ");
        list1.printList();
        System.out.print("List 2: ");
        list2.printList();

        if (list1.compare(list2)) {
            System.out.println("✅ Both linked lists are equal.");
        } else {
            System.out.println("❌ Linked lists are not equal.");
        }
    }
}

