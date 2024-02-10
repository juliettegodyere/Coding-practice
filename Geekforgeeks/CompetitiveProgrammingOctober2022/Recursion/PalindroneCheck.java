/**
 * A string is called palindrome if it is the same if you read it from left to right
 * and right to left and it is the same.
 * Eaxample
 * str = "abbcbba"
 */
package Recursion;

public class PalindroneCheck {
    public static boolean isPalindrome(String str, int start, int end){
        {
            if(start >= end)
                return true;
    
            return ((str.charAt(start)==str.charAt(end)) && 
                     isPalindrome(str, start + 1, end - 1));
        }
    }
    public static void main(String[] args) 
	{   
        String str = "gtyyeueuu";
        System.out.println(isPalindrome(str, 0, str.length()-1));
	}
}
