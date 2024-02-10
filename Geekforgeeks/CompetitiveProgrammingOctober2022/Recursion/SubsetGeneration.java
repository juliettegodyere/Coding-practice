/**
 * Our task is to generate subsets of this string. You may assume that all
 * characters in the string are different. Sets typically has distict values.
 * This problem can also be seen as generating all subsequences of a string.
 * Example:
 * Str = "ABC" 
 * Subsets of Subsequences = "", "A", "B", "C", "AB", "AC", "BC", "ABC"
 * For a string of n, there are going to be 2^n sebsets or subsequences.
 * 
 * We are going to consider two things, include it don't include it.
 */

package Recursion;

import java.util.*;

public class SubsetGeneration {
    public static void subSet(String str, String curr, int i){
        int n = str.length();
        if(i == n){
            System.out.println(curr);
            return;
        }else{
            subSet(str, curr, i+1);
            subSet(str, curr+str.charAt(i), i+1);
        }
    }
    
    // Function to generate power set of a given set `S`
    public static void findPowerSet(int[] S, Deque<Integer> set, int n)
    {
        // if we have considered all elements
        if (n == 0)
        {
            System.out.println(set);
            return;
        }
 
        // consider the n'th element
        set.addLast(S[n - 1]);
        findPowerSet(S, set, n - 1);
 
        set.removeLast();                    // backtrack
 
        // or don't consider the n'th element
        findPowerSet(S, set, n - 1);
    }
    public static void main(String[] args) 
	{   
        String str = "ABC";
        int[] S = { 1, 3, 1 };
        Deque<Integer> set = new ArrayDeque<>();

        //subSet(str, "", 0);
        findPowerSet(S, set, S.length);

	}
}
