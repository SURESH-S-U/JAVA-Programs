import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Binary_Tree_implementation_WOcollections {

    Node root;

    public void insert(int data) {
        root = insertData(root, data);      // Assigned to root is necessary. if we didn't reassign to the root , it only change local copy not the tree.
    }                                       // This is necessary because Java is pass-by-value, and when we create or modify the tree nodes recursively, the new root (or any modified child) must be reassigned to the correct parent link (including the root of the entire tree).
    public Node insertData(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {  
            root.left = insertData(root.left, data);   // This is also necessay.
        } else {                                       // Because we're recursively inserting into the left subtree, and the left child of root may be updated, so we must assign it back to root.left.
            root.right = insertData(root.right, data);
        }

        return root;
    }

    public void inOrder_Trav() {
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrder_Trav() {
        System.out.print("Pre-order Traversal: ");
        preOrder(root);
        System.out.println();
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder_Trav() {
        System.out.print("Post-order Traversal: ");
        postOrder(root);
        System.out.println();
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_Tree_implementation_WOcollections tree = new Binary_Tree_implementation_WOcollections();

        int choice, value;
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. In-order Traversal");
            System.out.println("3. Pre-order Traversal");
            System.out.println("4. Post-order Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    tree.insert(value);
                    break;

                case 2:
                    tree.inOrder_Trav();
                    break;

                case 3:
                    tree.preOrder_Trav();
                    break;

                case 4:
                    tree.postOrder_Trav();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
