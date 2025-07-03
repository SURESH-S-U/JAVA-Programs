import java.util.*;

class College
{
    private String name;
    private int roll;
    private String dept;
    private int age;

    College()
    {
        this.name = "Suresh";
        this.age = 18;
        this.dept  = "AI";
        this.roll = 270;
    }

    public void setDetails(String name,int roll,int age,String dept)
    {
        this.name = name;
        -this.roll = roll;
        this.dept = dept;
        this.age = age;
    }

    public ArrayList<String> getDetails(ArrayList<String> arr)
    {
        arr.add(name);
        arr.add(Integer.toString(age));     // Because The arrayList Type is String . We need to convert the Integer into String.
        arr.add(Integer.toString(roll));
        arr.add(dept);
        return  arr;            // If you need to return many variables in one return statement, You need to append it in array.
    }
}


public class Encapsulation{

    public static void main(String[] args){

        College obj = new College();

        String name = "Sura";
        int age = 19;
        int roll = 290;
        String dept = "AD";

        ArrayList<String> arr = new ArrayList<>();   // ArrayList used to return all variables in one array.

        obj.setDetails(name,roll,age,dept);
        obj.getDetails(arr);

        for (String detail : arr) {
            System.out.println(detail);
        }

    }

}