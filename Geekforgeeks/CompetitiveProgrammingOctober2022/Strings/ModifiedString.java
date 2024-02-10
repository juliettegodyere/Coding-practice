/**
 * The Modified String
 * Ishaan is playing with strings these days. He has found a new string. He wants to modify it as per the following rules to make it valid:

The string should not have three consecutive same characters (Refer example for explanation).
He can add any number of characters anywhere in the string. 
Find the minimum number of characters which Ishaan must insert in the string to make it valid.
https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33Strings/problem/the-modified-string-1587115621
 */
package Strings;

import java.util.HashMap;
import java.util.Map;

public class ModifiedString {
    //Function to find minimum number of characters which Ishaan must insert  
    //such that string doesn't have three consecutive same characters.
    //This was solved by me
    public static long modified(String a)
    {
        // Your code here
        int limit = 2;
        long sum = 0;
        for(int i = 1; i < a.length();i++){
            int count = 1;
            while(i < a.length() && a.charAt(i) == a.charAt(i-1)){
                count++;
                if(count > limit){
                    sum+=1;
                    count = 1;
                }
                i++;
            }
            if(count > limit){
                sum+=1;
                count = 1;
            }
        }
        return sum;
    }
    
    public static void main (String[] args) {
        String s = "aaaaa";
        System.out.println(modified(s));

    }
}
