import java.util.*;

// Abstraction - Hiding Implementation details and showing only necessary details.
// Acieveed by 2 keywords - abstract , interface.

// It allows abstract methods , concrete methods and Constructors inside abstract class. But interface dont allow concrete and Constructors.

// Abstract key word.

// Uses "extends" keyword for inherit properties.


// Abstract class
abstract class Parent{

    // Abstract method - Must be implement in the child class.
    abstract void study();

    // Concrete method - Not necessary to implement in child class.
    void salary()
    {
        System.out.println("10,000");
    }
}


// Child 1
class Child1 extends Parent{

    // Implement abstract method.
    void study()
    {
        System.out.println("Studying at College.");
    }
}


// Child 2
class Child2 extends Parent{

    // Implement abstract method.
    void study()
    {
        System.out.println("Styding at school");
    }

    // Override concrete method.
    @Override
    void salary()
    {
        System.out.println("No Salary.");
    }
}



public class Abstraction_Abstract{
    public static void main(String[] args){

        // The object should be created like this instead od usual way.
        // The onject must be create using abstract class instead of child class.
        Parent obj1 = new Child1();
        obj1.study();
        obj1.salary();

        Parent obj2 = new Child2();
        obj2.study();
        obj2.salary();

    }
}