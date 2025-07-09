import java.util.*;

public class Check_Whether_QueuePallindrome{

    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> q2 = new Stack<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(30);
        q.offer(20);
        q.offer(10);

        int size = q.size();

        for(int i=0;i<size/2;i++)
        {
            q2.push(q.poll());
        }

        if(size % 2 != 0)    // If it is not even. Just remove the  middle element.
        {
            q.poll();
        }

        for(int i=0;i<size/2;i++)
        {
            if(q.poll() != q2.pop())
            {
                System.out.println("Not a Pallindrome");
                return;
            }
        }

        System.out.println("Pallindrome");
    }

}