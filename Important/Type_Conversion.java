// File Name: Type_Conversion.java

public class Type_Conversion {

    public static void main(String[] args) {

        // double → float (Narrowing)
        double d = 100.5;
        float f = (float) d;
        System.out.println("double to float: " + f);

        // float → long (Narrowing)
        float f1 = 50.5f;
        long l = (long) f1;
        System.out.println("float to long: " + l);

        // long → int (Narrowing)
        long l1 = 1000;
        int i = (int) l1;
        System.out.println("long to int: " + i);

        // int → short (Narrowing)
        int i1 = 200;
        short s = (short) i1;
        System.out.println("int to short: " + s);

        // short → byte (Narrowing)
        short s1 = 10;
        byte b = (byte) s1;
        System.out.println("short to byte: " + b);

        // int → char (ASCII conversion)
        int x = 65;
        char ch = (char) x;
        System.out.println("int to char: " + ch);
    }
}