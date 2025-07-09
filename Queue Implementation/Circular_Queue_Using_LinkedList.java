class Queue2 {
    class Node7 {
        int data;
        Node7 next;

        Node7(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node7 front;
    Node7 rear;

    // Constructor
    public Queue2() {
        this.front = null;
        this.rear = null;
    }

    // Enqueue operation
    public void enque(int data) {
        Node7 newNode = new Node7(data);
        if (rear == null) {
            front = rear = newNode;
            rear.next = front; // circular link
            return;
        }

        rear.next = newNode;
        rear = newNode;
        rear.next = front; // maintain circularity
    }

    // Dequeue operation
    public int deque() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        int val = front.data;

        // If only one element was present
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }

        return val;
    }

    // Peek operation
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    // Display operation
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node7 temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}



public class Circular_Queue_Using_LinkedList{
    public static void main(String[] args) {
        Queue2 q = new Queue2();

        q.enque(10);
        q.enque(20);
        q.enque(30);

        q.display(); // 10 20 30

        System.out.println("Dequeued: " + q.deque()); // 10
        System.out.println("Peek: " + q.peek());       // 20

        q.display(); // 20 30
    }
}
