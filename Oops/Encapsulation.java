import java.util.*;


// Note *************
// Two Steps to Implement ENcapsulation.
// 1. Make the variables Private. It only used to Protect the data, So dont change the method as Private.
// 2. Define Getter and Setter to access the private contents. So that the data will be safe.


class College
{
    private String name;
    private int roll;
    private String dept;
    private int age;

    College()        // Default Constructor
    {
        this.name = "Suresh";
        this.age = 18;
        this.dept  = "AI";
        this.roll = 270;
    }

    College(String name, int age, String dept, int roll)  // Parameterized Constructor
    {
        this.name = name;
        this.age = age;
        this.dept  = dept;
        this.roll = roll;
    }


    // Getter - Used to get values of the Object
    public ArrayList<String> getDetails()
    {
        ArrayList<String> arr = new ArrayList<>(); // We cant return multiple values at one return. So we will store it in array and return the array.
        arr.add(name);
        arr.add(Integer.toString(age));     // Because The arrayList Type is String . We need to convert the Integer into String.
        arr.add(Integer.toString(roll));
        arr.add(dept);
        return  arr;
    }

    // Setter - Used to Updated or change values
    public void setDetails(String name,int roll,int age,String dept)
    {
        this.name = name;
        this.roll = roll;
        this.dept = dept;
        this.age = age;
    }

}


// Main Public class
public class Encapsulation{

    public static void main(String[] args){

        College obj = new College();

        // Calling Setter
        obj.setDetails("Suresh",101,21,"AI");

        // Calling Getter
        ArrayList<String> arr = obj.getDetails();

        // Print the values.
        for (String detail : arr) {
            System.out.println(detail);
        }

    }

}