class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Suresh";
        age = 10;
        System.out.println(name);
    }

    Student(String n) {
        this();                                                // If there is no enough parameters when using paeameters ,
        this.name = n;                                         // we should use { this(); } to access the necessary parm in default.
        System.out.println(name);                              // If we use this() , we must use { this. } for other parms.
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s2 = new Student("Subash");

        s2.display();  
    }
}
