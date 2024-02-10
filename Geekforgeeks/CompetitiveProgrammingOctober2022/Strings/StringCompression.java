package Strings;

/**
 * What is the optimal solution for basic string compression by counting sequences of repeating characters? 
 * Given AABBBCCCD it should be A2B3C3D1
 */

public class StringCompression {
    public static String compressString(String s) {
        StringBuilder compressed = new StringBuilder();
    
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i)).append(count);
                count = 1; // Reset count for the next character
            }
        }
        return compressed.toString();
    }
    public static void main(String[] args) 
    {   
        System.out.println(compressString("AABBBCCCD"));
    }
    
}
