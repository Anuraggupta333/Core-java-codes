package com.String;

/**
 * Demonstrates the behavior of String and StringBuffer classes.
 */
public class StringAndStringBufferDemo {

    public static void main(String[] args) {
        // Initialize two new String objects with the same content
        String s1 = new String("Anurag");
        String s2 = new String("Anurag");

        // Concatenate "Gupta" to s1, but this does not modify s1 since strings are immutable
        s1.concat("Gupta");

        // Print s1; it will remain "Anurag" because strings are immutable
        System.out.println(s1); // Anurag

        // Check if s1 and s2 refer to the same object (false because they are created with new String())
        System.out.println(s1 == s2); // false

        // Check if s1 and s2 have the same content (true because they have the same value)
        System.out.println(s1.equals(s2)); // true

        // Initialize two StringBuffer objects with the same content
        StringBuffer sb1 = new StringBuffer("Anurag");
        StringBuffer sb2 = new StringBuffer("Anurag");

        // Uncomment the line below to append "Gupta" to sb1
        //sb1.append("Gupta");

        // Print sb1; it will show "Anurag" or "AnuragGupta" depending on whether the append is uncommented
        System.out.println(sb1); // Anurag (or AnuragGupta if append is uncommented)

        // Check if sb1 and sb2 refer to the same object (false because they are different objects)
        System.out.println(sb1 == sb2); // false

        // Check if sb1 and sb2 have the same content (false because StringBuffer doesn't override equals)
        System.out.println(sb1.equals(sb2)); // false

        // Initialize a new string and perform concatenation
        String ss = new String("Anurag");
        ss.concat("Gupta"); // This does not modify ss since strings are immutable
        ss = ss.concat("Gangil"); // This assigns a new value to ss
        System.out.println(ss); // AnuragGangil
    }
}
