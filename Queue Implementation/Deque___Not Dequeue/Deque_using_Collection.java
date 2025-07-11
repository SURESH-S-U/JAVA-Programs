import java.util.*;

public class Deque_using_Collection{
    public static void main(String[] args){
        
        Deque<Integer> d = new LinkedList<>();      // We cant initialize queue As Queue. We can Declare as LinkedList.

        d.addFirst(10);
        d.addFirst(20);

        d.addLast(40);
        d.addLast(60);

        System.out.println(d);

        d.removeFirst();
        System.out.println(d);

        d.removeLast();
        System.out.println(d);

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}