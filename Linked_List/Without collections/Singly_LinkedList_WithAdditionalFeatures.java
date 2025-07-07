import java.util.*;

class Node2 {                // Additional 3 Features..... with Optimized solution.
    int data;                // Find Middle Element  ,  Remove Duplicates  ,  Print in reverse Order , Sorting the list.
    Node2 next;

    Node2(int x) {
        this.data = x;
        this.next = null;
    }
}

public class Singly_LinkedList_WithAdditionalFeatures {

    Node2 head;

    public void insertEnd(int x) {
        Node2 newNode = new Node2(x);

        if (head == null) {
            head = newNode;
            System.out.println("New Value " + x + " Inserted at End (List was empty).");
            return;
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println("New Value " + x + " Inserted at End.");
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node2 temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getMiddle(){
        Node2 slow = head;
        Node2 fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;     // It will go 1 step for each iteration.
            fast = fast.next.next;  // It will go 2 step for each iteration. When it reaches end , slow will reach the middle. 
        }

        System.out.println( slow.data );  // print slow data.

    }

    public void RemoveDup_For_SortedList(){
        
        // We can only use this When the List is sorted.   O(n) time complexity.

        Node2 current = head;

        while (current != null && current.next != null) 
        {
            if (current.data == current.next.data) 
            {
                current.next = current.next.next;         // skip duplicate
            } 
            else 
            {
                current = current.next;
            }
        }

        display();  // to display the list.

    }

    public void RemoveDup_For_Non_SortedList(){   // Using HashSet.
        // We can use it for both sorted and Un Sorted Linked List.  O(n) time complexity.

        HashSet<Integer> set = new HashSet<>();

        if (head == null) return;

        Node2 current = head;
        Node2 prev = null;        // Initially previous as null.

        while(current != null)
        {
            if(set.contains( current.data ))
            {
                prev.next = current.next;      // this will skip the duplicate.
            }
            else
            {
                set.add( current.data );
                prev = current;
            }

            current = current.next;

        }

        display();
        
    } 




    public void reverseOrder(Node2 node){     // We can print using head recursion. It will print in reverse order.

        if(node == null)
        {
            return;
        }

        reverseOrder(node.next);
        System.out.print(node.data+" ");

    }

    public void SortList(){                     // Using Bubble Sort.
        Node2 temp1 = head;                     // Time complexity O(n^2).
        while(temp1.next != null)
        {
            Node2 temp2 = head;
            while(temp2.next != null)
            {
                if(temp2.data > temp2.next.data)  // Compare each Data with their Adjacent data for n times.
                {
                    int tempData = temp2.data;
                    temp2.data = temp2.next.data;
                    temp2.next.data = tempData;
                }

                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }

        display();

    }


    // main Method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Singly_LinkedList_WithAdditionalFeatures obj = new Singly_LinkedList_WithAdditionalFeatures();

            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1: Insert at End");
            System.out.println("2: Display the List");
            System.out.println("3: Get Middle Element");
            System.out.println("4: Remove Duplicate values for Sorted List");
            System.out.println("5: Remove Duplicate values for Un Sorted List");
            System.out.println("6: Print in reverse Order");
            System.out.println("7: Sort the linked List");
            System.out.println("8: Exit");
            System.out.print("Enter your choice: ");
            
        while (true) {
            int inp = sc.nextInt();

            switch (inp) {
                case 1:
                    System.out.print("Enter the value to insert at end: ");
                    int x0 = sc.nextInt();
                    obj.insertEnd(x0);
                    break;

                case 2:
                    obj.display();
                    break;

                case 3:
                    System.out.println("The middle element is : ");
                    obj.getMiddle();
                    break;

                case 4:
                    System.out.println("After removed duplicate elements : ");
                    obj.RemoveDup_For_SortedList();
                    break;

                case 5:
                    System.out.println("After removed duplicate elements : ");
                    obj.RemoveDup_For_Non_SortedList();
                    break;

                case 6:
                    System.out.println("Reverse Order is : ");     // Using  recursion So we need to pass ( Head ) as Paramether.
                    obj.reverseOrder( obj.head );               // We must use obj before passing perameter Because head is not a scope of
                    break;                                                                                               //  Main Method.

                case 7:
                    System.out.println("The Sorted List is : ");
                    obj.SortList();
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
