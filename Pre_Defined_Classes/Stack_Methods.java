import java.util.*;

public class Stack_Methods {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        //====================================================
        // push(E e) -> Adds an element to the top
        //====================================================

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        // Output:
        // [10, 20, 30]


        //====================================================
        // pop() -> Removes and returns the top element
        //====================================================

        System.out.println(stack.pop());

        // Output:
        // 30

        System.out.println(stack);
        // Output:
        // [10, 20]


        //====================================================
        // peek() -> Returns the top element without removing
        //====================================================

        System.out.println(stack.peek());

        // Output:
        // 20

        System.out.println(stack);
        // Output:
        // [10, 20]


        //====================================================
        // empty() -> Checks whether stack is empty
        //====================================================

        System.out.println(stack.empty());

        // Output:
        // false


        //====================================================
        // isEmpty() -> Same as empty()
        //====================================================

        System.out.println(stack.isEmpty());

        // Output:
        // false


        //====================================================
        // size() -> Returns number of elements
        //====================================================

        System.out.println(stack.size());

        // Output:
        // 2


        //====================================================
        // search(Object o)
        // Returns position from top (1-based)
        //====================================================

        System.out.println(stack.search(20));

        // Output:
        // 1

        System.out.println(stack.search(10));

        // Output:
        // 2


        //====================================================
        // contains(Object o)
        //====================================================

        System.out.println(stack.contains(10));

        // Output:
        // true


        //====================================================
        // add(E e)
        //====================================================

        stack.add(40);

        System.out.println(stack);

        // Output:
        // [10, 20, 40]


        //====================================================
        // get(index)
        //====================================================

        System.out.println(stack.get(1));

        // Output:
        // 20


        //====================================================
        // set(index,value)
        //====================================================

        stack.set(1,100);

        System.out.println(stack);

        // Output:
        // [10, 100, 40]


        //====================================================
        // remove(index)
        //====================================================

        stack.remove(2);

        System.out.println(stack);

        // Output:
        // [10, 100]


        //====================================================
        // remove(Object)
        //====================================================

        stack.remove(Integer.valueOf(100));

        System.out.println(stack);

        // Output:
        // [10]


        //====================================================
        // firstElement()
        //====================================================

        System.out.println(stack.firstElement());

        // Output:
        // 10


        //====================================================
        // lastElement()
        //====================================================

        stack.add(20);
        stack.add(30);

        System.out.println(stack.lastElement());

        // Output:
        // 30


        //====================================================
        // iterator()
        //====================================================

        Iterator<Integer> itr = stack.iterator();

        while(itr.hasNext())
            System.out.print(itr.next()+" ");

        // Output:
        // 10 20 30


        System.out.println();


        //====================================================
        // toArray()
        //====================================================

        Object[] arr = stack.toArray();

        System.out.println(Arrays.toString(arr));

        // Output:
        // [10, 20, 30]


        //====================================================
        // clear()
        //====================================================

        stack.clear();

        System.out.println(stack);

        // Output:
        // []

    }
}