public class implementation {
	private int[] a;
	private int size;
	private int top;

	public implementation(int size) {
		this.size = size;
		a = new int[size];
		this.top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		a[++top] = x;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;  // Return error value
		}
		return a[top--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;  // Return error value
		}
		return a[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		for (int i = top; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		implementation ob = new implementation(10);
		ob.push(10);
		ob.push(20);
		ob.push(30);
		ob.push(40);
		ob.push(50);

		System.out.println("Top element (peek): " + ob.peek());
		System.out.println("Popped element: " + ob.pop());
		System.out.println("Stack elements:");
		ob.display();
	}
}
