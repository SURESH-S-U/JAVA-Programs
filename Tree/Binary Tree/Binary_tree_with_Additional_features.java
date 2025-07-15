import java.util.Scanner;

class Node10 {
    int data;
    Node10 left, right;

    public Node10(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Binary_tree_with_Additional_features {

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

    // ✅ Count total nodes
    public int countNodes() {
        return count(root);
    }

    private int count(Node10 root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    // ✅ Count parent nodes (nodes with at least one child)
    public int countParentNodes() {
        return countParents(root);
    }

    private int countParents(Node10 node) {
        if (node == null) return 0;

        if (node.left != null || node.right != null)
            return 1 + countParents(node.left) + countParents(node.right);

        return countParents(node.left) + countParents(node.right);
    }

    // ✅ Count leaf nodes (nodes with no children)
    public int countLeafNodes() {
        return countLeaves(root);
    }

    private int countLeaves(Node10 node) {
        if (node == null) return 0;

        if (node.left == null && node.right == null)
            return 1;

        return countLeaves(node.left) + countLeaves(node.right);
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

    // ✅ Delete a node from BST
    public void delete(int key) {
        root = deleteNode(root, key);
    }

    private Node10 deleteNode(Node10 root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {                          
            root.left = deleteNode(root.left, key);    // It will link the returned node to the current node.
        } 

        else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }
        
        else {                             // It will exicute when the curren node is the node to be deleted.

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;                 // If only right child , then remove the node and link the right child directly.
            } else if (root.right == null) {       // this will return to the previous call then change the value.
                return root.left;
            }

            // Case 3: Two children
            Node10 successor = findMin(root.right);
            root.data = successor.data;                      // It is used to copy the right sub trees smallest value.
            root.right = deleteNode(root.right, successor.data); // it is used to delete the previous place of the changed node.
        }

        return root;
    }

    private Node10 findMin(Node10 root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_tree_with_Additional_features tree = new Binary_tree_with_Additional_features();

        int choice, value;
        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Count All Nodes");
            System.out.println("4. Sum of Nodes");
            System.out.println("5. Delete Node");
            System.out.println("6. Count Parent Nodes");
            System.out.println("7. Count Leaf Nodes");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    tree.insert(value);
                    break;

                case 2:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    if (tree.search(value)) {
                        System.out.println(value + " found in the tree.");
                    } else {
                        System.out.println(value + " not found in the tree.");
                    }
                    break;

                case 3:
                    System.out.println("Total number of nodes: " + tree.countNodes());
                    break;

                case 4:
                    System.out.println("Sum of all node values: " + tree.sumOfNodes());
                    break;

                case 5:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    tree.delete(value);
                    System.out.println(value + " deleted from the tree (if it existed).");
                    break;

                case 6:
                    System.out.println("Total number of parent nodes: " + tree.countParentNodes());
                    break;

                case 7:
                    System.out.println("Total number of leaf nodes: " + tree.countLeafNodes());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
