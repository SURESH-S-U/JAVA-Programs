// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// Subclass
class Dog {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        Dog b = new Dog();  // upcasting
        b.makeSound();  // Output: Dog barks

        a = new Animal();
        a.makeSound();  // Output: Cat meows
    }
}
