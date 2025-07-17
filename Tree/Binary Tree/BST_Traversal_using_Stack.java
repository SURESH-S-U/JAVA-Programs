import java.util.*;

// Node definition
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeTraversalUsingStack {

    Node root;

    // Iterative Inorder Traversal (Left, Root, Right)
    public void inorder(Node root) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    // Iterative Preorder Traversal (Root, Left, Right)
    public void preorder(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");

            if (curr.right != null)
                stack.push(curr.right);
            if (curr.left != null)
                stack.push(curr.left);
        }
    }

    // Iterative Postorder Traversal (Left, Right, Root)
    public void postorder(Node root) {
        if (root == null) return;

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node curr = stack1.pop();
            stack2.push(curr);

            if (curr.left != null)
                stack1.push(curr.left);
            if (curr.right != null)
                stack1.push(curr.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

    // Sample usage
    public static void main(String[] args) {
        TreeTraversalUsingStack tree = new TreeTraversalUsingStack();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder Traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
    }
}
