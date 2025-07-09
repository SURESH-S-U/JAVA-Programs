package stack;
class stack
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node top;
	public stack()
	{
		this.top = null;
	}
	public void push(int x)
	{
		Node newnode = new Node(x);
		newnode.next = top;
		top = newnode;
	}
	public int pop()
	{
		if(isEmpty()) 
		{
			System.out.println("Stack is Empty");
		}
		int x = top.data;
		top=top.next;
		return x;
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		return top.data;
	}
	public boolean isEmpty()
	{
		return top == null;
	}
	public void display()
	{
		while(top!=null)
		{
			System.out.println(top.data);
			top=top.next;
		}
	}
}
public class linkedlist {

	public static void main(String[] args) {
		stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.display();
	}

}
