public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;  // It is the default size of the array.

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Enqueue - Add element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        // First element
        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    // Dequeue - Remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int removed = queue[front];
        if (front == rear) {
            // Queue has only one element
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return removed;
    }

    // Peek - Get the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display(); // 10 20 30 40 50

        cq.dequeue();
        cq.dequeue();

        cq.display(); // 30 40 50

        cq.enqueue(60);
        cq.enqueue(70);

        cq.display(); // 30 40 50 60 70

        System.out.println("Peek: " + cq.peek()); // 30
    }
}
