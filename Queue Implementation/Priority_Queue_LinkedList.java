class Node8{
    int data;
    int priority;
    Node8 next;

    Node8(int data, int priority){
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

class Priority_Queue_LinkedList{
    Node8 head;

    public void enque(int data, int priority)
    {
        Node8 newNode = new Node8(data , priority);
        if(head == null || priority < head.priority)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node8 temp = head;
        while(temp.next != null && temp.next.priority <= temp.priority)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int dequeue()
    {
        if(head == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }

        int val = head.data;
        head = head.next;
        return val;

    }

    public int peek()
    {
        if(head == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }

        return head.data;
    }

    public void display()
    {
        Node8 temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }



    // main method

    public static void main(String[] args){
        Priority_Queue_LinkedList obj = new Priority_Queue_LinkedList();

        obj.enque(10,1);
        obj.enque(20,3);
        obj.enque(30,2);

        obj.display();
        System.out.println();

        System.out.println("Peek is : "+obj.peek());

        obj.dequeue();

        obj.display();
    }

}
