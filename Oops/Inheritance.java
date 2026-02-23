import java.util.*;

// Inheritance is used for Code Reusability.
// Common functions should be The parent class.
// Unique functions should be The child class.

// So that all Common functions can be used for all child function without re declare again.



// Parent function - Contains Common functions.
class Animals{

    void legs()
    {
        System.out.println("It has 4 legs.");
    }

    void eat()
    {
        System.out.println("It eats food");
    }

    void live()
    {
        System.out.println("It lives in folest");
    }

}

// Child 1 - contains Uniques features.
class Lion extends Animals{

    void rore()
    {
        System.out.println("A lion rores.");
    }
}

// Child 2
class Elephant extends Animals{

    void travel()
    {
        System.out.println("An elephant can travel 80 km per day.");
    }
}


// Public main Class
public class Inheritance{
    public static void main(String[] args){

        Animals obj = new Animals();
        obj.legs();

        Elephant ele = new Elephant();
        ele.travel();
        ele.legs();
        ele.eat();
        ele.live();

        Lion li = new Lion();
        li.rore();
        li.legs();
        li.eat();
        li.live();

    }
}