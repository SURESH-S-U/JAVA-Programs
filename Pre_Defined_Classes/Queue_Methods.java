import java.util.*;

public class Queue_Methods {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //====================================================
        // offer(E e) -> Inserts an element
        //====================================================

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);

        // Output:
        // [10, 20, 30]


        //====================================================
        // add(E e)
        //====================================================

        queue.add(40);

        System.out.println(queue);

        // Output:
        // [10, 20, 30, 40]


        //====================================================
        // peek() -> Returns front element
        //====================================================

        System.out.println(queue.peek());

        // Output:
        // 10

        System.out.println(queue);

        // Output:
        // [10, 20, 30, 40]


        //====================================================
        // element() -> Returns front element
        //====================================================

        System.out.println(queue.element());

        // Output:
        // 10


        //====================================================
        // poll() -> Removes and returns front element
        //====================================================

        System.out.println(queue.poll());       

        // Output:
        // 10

        System.out.println(queue);

        // Output:
        // [20, 30, 40]


        //====================================================
        // remove() -> Removes front element
        //====================================================

        System.out.println(queue.remove());

        // Output:
        // 20

        System.out.println(queue);

        // Output:
        // [30, 40]


        //====================================================
        // contains(Object o)
        //====================================================

        System.out.println(queue.contains(40));

        // Output:
        // true


        //====================================================
        // size()
        //====================================================

        System.out.println(queue.size());

        // Output:
        // 2


        //====================================================
        // isEmpty()
        //====================================================

        System.out.println(queue.isEmpty());

        // Output:
        // false


        //====================================================
        // addAll(Collection)
        //====================================================

        queue.addAll(Arrays.asList(50,60,70));

        System.out.println(queue);

        // Output:
        // [30, 40, 50, 60, 70]


        //====================================================
        // remove(Object)
        //====================================================

        queue.remove(Integer.valueOf(60));

        System.out.println(queue);

        // Output:
        // [30, 40, 50, 70]


        //====================================================
        // iterator()
        //====================================================

        Iterator<Integer> itr = queue.iterator();

        while(itr.hasNext())
            System.out.print(itr.next()+" ");

        // Output:
        // 30 40 50 70

        System.out.println();


        //====================================================
        // toArray()
        //====================================================

        Object[] arr = queue.toArray();

        System.out.println(Arrays.toString(arr));

        // Output:
        // [30, 40, 50, 70]


        //====================================================
        // clear()
        //====================================================

        queue.clear();

        System.out.println(queue);

        // Output:
        // []

    }
}