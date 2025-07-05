import java.util.*;

class Node{
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next= null;
    }
}

public class sample{

    Node head;

    public void insertBigining(int x)
    {
        Node newNode = new Node(x);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    }

}