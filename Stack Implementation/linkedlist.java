
class Stack {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node top;

	public Stack() {
		this.top = null;
	}

	public void push(int x) {
		Node newnode = new Node(x);
		newnode.next = top;
		top = newnode;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1; // Return a default/error value
		}
		int x = top.data;
		top = top.next;
		return x;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1; // Return a default/error value
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void display() {
		Node current = top;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}

public class linkedlist {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println("Top element (peek): " + s.peek());
		System.out.println("Popped element: " + s.pop());

		System.out.println("Stack contents:");
		s.display();
	}
}
