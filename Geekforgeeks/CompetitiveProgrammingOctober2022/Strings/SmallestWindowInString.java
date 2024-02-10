/**
 * Smallest window in a string containing all the characters of another string.
 * Given two strings S and P. Find the smallest window in the string S consisting of all the 
 * characters(including duplicates) of the string P.  Return "-1" in case there is no such window 
 * present. In case there are multiple such windows of same length, return the one with the least 
 * starting index. https://practice.geeksforgeeks.org/batch/cp-41/track/CP-33Strings/problem/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621
Note : All characters are in Lowercase alphabets. 
 */
package Strings;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowInString {

    static String smallestWindow(String st1, String str2){
        int n = st1.length();
        int m = str2.length();
        int max = Integer.MIN_VALUE;
        String maxSub = st1.charAt(0)+"";
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(findSubsequence(st1, str2, i, j)){
                     String sub = st1.substring(i, j);
                     if(max < sub.length()){
                        max = sub.length();
                        maxSub = sub;
                     }
                }
            }
        }
        return maxSub;
    }

    static boolean findSubsequence(String str1, String str2, int s, int e){
         String sub = str1.substring(s, e);
         int n = sub.length();
         int m = str2.length();
         int j = 0;
        for(int i = 0; i < n && j < m; i++){
           if(sub.charAt(i) == str2.charAt(j)){
            j++;
           }
        }
        return (j == m);
    }

    public static String smallestWindow2(String st1, String str2) {
        int n = st1.length();
        int m = str2.length();

        // Check if the lengths of both strings are valid
        if (n < m) {
            return "-1";
        }

        // Frequency maps for characters in str2 and the current window
        Map<Character, Integer> charCount = new HashMap<>();
        Map<Character, Integer> windowCount = new HashMap<>();

        // Initialize frequency map for str2
        for (char ch : str2.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        int left = 0;  // Left pointer of the window
        int minLength = Integer.MAX_VALUE;  // Minimum length of the window
        int start = -1;  // Start index of the minimum length window

        for (int right = 0; right < n; right++) {
            char currentChar = st1.charAt(right);

            // Update window frequency map
            windowCount.put(currentChar, windowCount.getOrDefault(currentChar, 0) + 1);

            // Check if the current character is part of str2 and it occurs enough times
            if (charCount.containsKey(currentChar) &&
                windowCount.get(currentChar).intValue() == charCount.get(currentChar).intValue()) {
                // Move the left pointer to minimize the window
                while (left <= right) {
                    char leftChar = st1.charAt(left);

                    if (charCount.containsKey(leftChar) &&
                        windowCount.get(leftChar).intValue() > charCount.get(leftChar).intValue()) {
                        windowCount.put(leftChar, windowCount.get(leftChar) - 1);
                        left++;
                    } else {
                        break;
                    }
                }

                // Update the minimum length and start index of the window
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    start = left;
                }
            }
        }

        // If no valid window is found
        if (start == -1) {
            return "-1";
        }

        // Return the smallest window
        return st1.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        // Example usage
        String S = "timetopractice";
        String P = "toc";
        System.out.println(smallestWindow2(S, P));  // Output: "toprac"
    }
    
}
