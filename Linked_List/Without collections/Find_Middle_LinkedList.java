import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Find_Middle_LinkedList{

    static Node middleNode(Node head)
    {
        Node f = head;
        Node s = head;
        
        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }
        
        return s;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            Node temp = new Node(x);

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        Node ans = middleNode(head);

        System.out.println(ans.data);
    }
}