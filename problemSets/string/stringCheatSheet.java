package string;
import java.lang.*;
import java.util.*;

public class stringCheatSheet {
    
    public static void main(String[] args) {
        stringJoiner();
        //System.out.print();
    }

    static void creatingStrings(){
        //Using literal string
        String str1 = "Hello";

        //Using new keyword
        String str2 = new String("Hello world");
    }

    //Immutable String 
    //concat strings
    static void stringImmutable(){
        String str1 = "String";
        str1 = str1.concat(" Java");
        System.out.print(str1);
    }

    static void stringMethods(){
        String s1 = "Hello";
        String s2 = "World";

        //Compares the address of the two strings
        boolean comp = s1 == s2;

        //Compares the contents of the two stirngs
        boolean comp2 = s1.equals(s2);

        //Compares the contents of the two strings and ignores the case of the chars
        boolean comp3 = s1.equalsIgnoreCase(s2);

        //Length of string
        int len = s1.length();

        //Character at index i
        char c = s1.charAt(0);

        //String to all uppercase
        String n1 = s1.toUpperCase();

        //String to all lowercase
        String n2 = s2.toLowerCase();

        //Searches string for a values and replaces it
        String n3 = s1.replace("Hello", "Goodbye");

        //Trims all the surrounding white spaces
        String n4 = "hello world".trim();

        //Searches for value
        boolean comp4 = s1.contains("Hello");

        //Converts to character array
        char [] arr = s1.toCharArray();

        //Checks to see if string is empty
        boolean comp5 = s1.isEmpty();

        //Check to see if string ends with given suffix
        boolean comp6 = s1.endsWith("lo");
    }

    //String conversion from different types
    static void stringConversion(){
        //Converts string to integer
        String s1 = "123";
        int num = Integer.parseInt(s1);

        //Converts int to string
        int num2 = 111;
        String s2 = String.valueOf(num2);

        //String to double
        String s3 = "111.1234";
        double num3 = Double.parseDouble(s3);

        //Double to  string
        double num4 = 111.345;
        String s4 = String.valueOf(num4);

    }

    static void removeEndSpaces(){
        String s = "Hello, world    ";
        int len = s.length()-1;

        for(; len>0; len--){
            if(!Character.isWhitespace(s.charAt(len))){
                break;
            }
        }

        String newStr = s.substring(0, len+1);
    }

    static void countDuplicates(){
        String s = "aaabbbccddd";
        HashMap<Character, Integer> map = new HashMap<>();
        char [] arr = s.toCharArray();
    }

    static void stringJoiner(){
        StringJoiner str = new StringJoiner("-");
        str.add("Nemanja");
        str.add("Nemanja");

        System.out.print(str);

    }
}
