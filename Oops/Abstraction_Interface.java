import java.util.*;

// A class cant extend 2 parent classes, But a class can extend 2 Interface classes.

// Instead of extend we use implement here.

// In interface class, It only allows abstract methods (No need to specify abstract).
// It doesn't allow concrete methods and Constructor.

interface Father {
    void money();
}

interface Mother {
    void care();
}

class Child implements Father, Mother {  // Should use implements instead of extends, It wont work at interface.

    public void money() {                // Inside interface all methods must be public.
        System.out.println("Father gives money");
    }

    public void care() {
        System.out.println("Mother gives care");
    }
}

public class Abstraction_Interface {
    public static void main(String[] args) {
        Child c = new Child();
        c.money();
        c.care();
    }
}