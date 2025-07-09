class queue_Operations {
    private int[] a;
    private int front;
    private int rear;
    private int size;

    queue_Operations(int size){
        a = new int[size];
        this.size = size;
        this.rear = -1;
        this.front = 0;
    }

    public void enque(int val) {
        if (isFull()) {
            System.out.println("Queue reached its size");
            return;
        }
        a[++rear] = val;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }
        front++;
        if (front > rear) {
            // Reset queue if it becomes empty
            front = 0;
            rear = -1;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        return a[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return rear == -1 || front > rear;
    }
}

public class Queue_implementation_using_Array {
    public static void main(String[] args) {

        int size = 5;
        queue_Operations obj = new queue_Operations(size);

        obj.enque(10);
        obj.enque(20);
        obj.enque(30);
        obj.enque(40);
        obj.enque(50);

        obj.display();  // Print queue

        obj.dequeue();  // Remove front

        obj.display();  // Print after dequeue

        System.out.println("Peek: " + obj.peek());
    }
}
