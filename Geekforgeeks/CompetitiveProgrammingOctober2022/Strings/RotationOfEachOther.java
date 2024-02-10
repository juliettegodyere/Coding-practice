/**
 * We are given two strings. We need to check if they are 
 * rotation of each other. We basically need to check if 
 * string 2 can be obtained from string one by rotating s1 
 * any number of times.
 * The simplest approach is to concanate S1 with itself
 * and search for s2 in the formed string
 * https://www.java67.com/2017/07/string-rotation-in-java-write-program.html
 */
package Strings;

//Theta(N) time and theta(N) space
public class RotationOfEachOther {
    static boolean checkRotation(String s1, String s2) {
        /* Comparing and checking string lengths */
        if (s1.length() != s2.length())
            return false;

        String temp = s1 + s1; //storing concatenated string

        if (temp.indexOf(s2) != -1) {
            return true; //returning true if 2nd string is present in concatenated string
        } else {
            return false;
        }

    }

    // Driver code 
    public static void main(String[] args) {
        String a = "dylsebxjwlmpamjneoehhlgayxtgs";
        String b = "lsebxjwlmpamjneoehhlgayxfgsdy";

        if (checkRotation(a, b))
            System.out.println("Given Strings are rotations of each other.");
        else
            System.out.println("Given Strings are not rotations of each other.");
    }

}
