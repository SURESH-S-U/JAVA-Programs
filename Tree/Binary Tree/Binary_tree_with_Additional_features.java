import java.util.Scanner;

class Node10 {
    int data;
    Node10 left, right;

    public Node10(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Binary_tree_with_Additional_features{

    Node10 root;

    public void insert(int data) {
        root = insertData(root, data);
    }

    public Node10 insertData(Node10 root, int data) {
        if (root == null) {
            return new Node10(data);
        }

        if (data < root.data) {
            root.left = insertData(root.left, data);
        } else {
            root.right = insertData(root.right, data);
        }

        return root;
    }

    public void inOrder_Trav() {
        System.out.print("In-order Traversal: ");
        inOrder(root);
        System.out.println();
    }

    public void inOrder(Node10 root) {
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

    public void preOrder(Node10 root) {
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

    public void postOrder(Node10 root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public boolean search(int key) {
        return searchNode(root, key);
    }

    private boolean searchNode(Node10 root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return searchNode(root.left, key);
        } else {
            return searchNode(root.right, key);
        }
    }

    public int countNodes() {
        return count(root);
    }

    private int count(Node10 root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    public int sumOfNodes() {
        return sum(root);
    }

    private int sum(Node10 root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_tree_with_Additional_features tree = new Binary_tree_with_Additional_features();

        int choice, value;
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. In-order Traversal");
            System.out.println("3. Pre-order Traversal");
            System.out.println("4. Post-order Traversal");
            System.out.println("5. Exit");
            System.out.println("6. Search");
            System.out.println("7. Count Nodes");
            System.out.println("8. Sum of Nodes");
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

                case 6:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    if (tree.search(value)) {
                        System.out.println(value + " found in the tree.");
                    } else {
                        System.out.println(value + " not found in the tree.");
                    }
                    break;

                case 7:
                    System.out.println("Total number of nodes: " + tree.countNodes());
                    break;

                case 8:
                    System.out.println("Sum of all node values: " + tree.sumOfNodes());
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
