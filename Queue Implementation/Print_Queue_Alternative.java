import java.util.*;

public class sample{

    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> res = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        q.offer(60);

        int size = q.size();
        if(q.size()%2 != 0)
        {
            System.out.println("Cant perform this operation");
            return;
        }

        for(int i=0;i<size/2;i++)
        {
            q2.offer(q.poll());
        }

        for(int i=0;i<size/2;i++)
        {
            res.offer(q2.poll());
            res.offer(q.poll());
        }

        System.out.println(res);
    }

}