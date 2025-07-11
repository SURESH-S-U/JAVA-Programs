import java.util.*;

public class Queue_Implementation_UsingStack{

    Stack<Integer> s1 = new Stack<>();         // First push values into the s1. It will reverse the elements.
    Stack<Integer> s2 = new Stack<>();         // Then Again push the values into another Stack it will make it as Queue.

    public void enqueue(int val)
    {
        s1.push(val);
    }

    public int dequeue()
    {
        if(s1.isEmpty())
        {
            return -1;
        }

        if(s2.isEmpty())
        {
            while(! s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek()
    {
        if(s1.isEmpty())
        {
            return -1;
        }

        if(s2.isEmpty())
        {
            while(! s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public static void main(String[] args){
        
        Queue_Implementation_UsingStack obj = new Queue_Implementation_UsingStack();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);

        System.out.println(obj.s1);

        System.out.println(obj.dequeue());

        System.out.println(obj.peek());

    }
}