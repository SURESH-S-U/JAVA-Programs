class Node5{
    int data;
    Node5 next;
    Node5 prev;

    Node5(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class sample{
    Node5 head = null;
    Node5 tail = null;

    public void addEnd(int data){
        Node5 newNode = new Node5(data);

        if(head == null)
        {
            head = tail = newNode;
            head.next = head.prev = head;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
        tail = newNode;
    }

    public void addStart(int data){
        Node5 newNode = new Node5(data);

        if(head == null)
        {
            head = tail = newNode;
            head.next = head.prev = head;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        tail.next = newNode;
        newNode.prev = tail;
        head = newNode;
    }

    public void insertIndex(int data){
        Node5 newNode = new Node5(data);
        Node5 temp = head;
        
    }

}