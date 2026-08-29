import java.util.*;

public class Character_And_Math_Functions {
    public static void main(String[] args) {

        // ===========================
        // Character Class Functions
        // ===========================

        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '5';
        char ch4 = ' ';

        System.out.println("===== Character Functions =====");

        System.out.println("isLetter('A')           : " + Character.isLetter(ch1));
        System.out.println("isDigit('5')            : " + Character.isDigit(ch3));
        System.out.println("isLetterOrDigit('A')    : " + Character.isLetterOrDigit(ch1));
        System.out.println("isWhitespace(' ')       : " + Character.isWhitespace(ch4));
        System.out.println("isUpperCase('A')        : " + Character.isUpperCase(ch1));
        System.out.println("isLowerCase('a')        : " + Character.isLowerCase(ch2));
        System.out.println("isAlphabetic('A')       : " + Character.isAlphabetic(ch1));

        System.out.println("toUpperCase('a')        : " + Character.toUpperCase(ch2));
        System.out.println("toLowerCase('A')        : " + Character.toLowerCase(ch1));

        System.out.println("getNumericValue('5')    : " + Character.getNumericValue(ch3));

        System.out.println("compare('A','B')        : " + Character.compare('A', 'B'));
        System.out.println("compare('B','A')        : " + Character.compare('B', 'A'));
        System.out.println("compare('A','A')        : " + Character.compare('A', 'A'));

        System.out.println("charCount(65)           : " + Character.charCount(65));
        System.out.println("hashCode('A')           : " + Character.hashCode('A'));
        System.out.println("toString('A')           : " + Character.toString('A'));
        System.out.println("valueOf('A')            : " + Character.valueOf('A'));

        // ===========================
        // Math Class Functions
        // ===========================

        System.out.println("\n===== Math Functions =====");

        System.out.println("max(10,20)              : " + Math.max(10, 20));
        System.out.println("min(10,20)              : " + Math.min(10, 20));
        System.out.println("abs(-15)                : " + Math.abs(-15));

        System.out.println("pow(2,5)                : " + Math.pow(2, 5));
        System.out.println("sqrt(25)                : " + Math.sqrt(25));
        System.out.println("cbrt(27)                : " + Math.cbrt(27));

        System.out.println("ceil(5.2)               : " + Math.ceil(5.2));
        System.out.println("floor(5.8)              : " + Math.floor(5.8));
        System.out.println("round(5.6)              : " + Math.round(5.6));

        System.out.println("random()                : " + Math.random());

        System.out.println("exp(2)                  : " + Math.exp(2));
        System.out.println("log(10)                 : " + Math.log(10));
        System.out.println("log10(100)              : " + Math.log10(100));

        System.out.println("sin(PI/2)               : " + Math.sin(Math.PI / 2));
        System.out.println("cos(0)                  : " + Math.cos(0));
        System.out.println("tan(PI/4)               : " + Math.tan(Math.PI / 4));

        System.out.println("toRadians(180)          : " + Math.toRadians(180));
        System.out.println("toDegrees(PI)           : " + Math.toDegrees(Math.PI));

        System.out.println("signum(-25)             : " + Math.signum(-25));
        System.out.println("signum(25)              : " + Math.signum(25));

        System.out.println("PI                      : " + Math.PI);
        System.out.println("E                       : " + Math.E);

        System.out.println("hypot(3,4)              : " + Math.hypot(3, 4));
        System.out.println("IEEEremainder(10,3)     : " + Math.IEEEremainder(10, 3));

        System.out.println("incrementExact(10)      : " + Math.incrementExact(10));
        System.out.println("decrementExact(10)      : " + Math.decrementExact(10));
        System.out.println("negateExact(10)         : " + Math.negateExact(10));

        System.out.println("addExact(10,20)         : " + Math.addExact(10, 20));
        System.out.println("subtractExact(20,10)    : " + Math.subtractExact(20, 10));
        System.out.println("multiplyExact(5,6)      : " + Math.multiplyExact(5, 6));

        System.out.println("floorDiv(17,5)          : " + Math.floorDiv(17, 5));
        System.out.println("floorMod(17,5)          : " + Math.floorMod(17, 5));
    }
}