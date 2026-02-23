public class Class_Object_Basics{

    // Static class - So Main method can call this without creating object to the Public class(Class_Object_Basics).
    static class Students{

        // Create a Blue print
        String name;
        int roll;
        int age;
        String school;
        String location;

        // Default Constructor - Initialize Default values
        Students()
        {
            name = "Default";
            roll = 0;
            age = 10;
            school = "BIT";
            location = "Sathy";
        }

        // Parameterized Constructor- Initialize with the user given perameters
        Students(String name, int roll, int age)
        {
            this();    // For other variables, It will take the default values from the Default Constructor.
            this.name = name;    // this. - denote the instance variables of the calss.It is necessary because the instance and the parameter have the same variable name.
            this.roll = roll;
            this.age = age;
        }

    }

    
    public static void main(String[] args){

        Students s1 = new Students();                // Creating object - calling default constructor.
        Students s2 = new Students("suresh",101,21); // Creating object - calling parameterized constructor.


        System.out.println("Name : "+s1.name+" Roll : "+s1.roll+" Age : "+s1.age+" School : "+s1.school+" Location : "+s1.location);
        System.out.println("Name : "+s2.name+" Roll : "+s2.roll+" Age : "+s2.age);
        System.out.println("Name : "+s2.name+" Roll : "+s2.roll+" Age : "+s2.age+" School : "+s2.school+" Location : "+s2.location);

    }
}