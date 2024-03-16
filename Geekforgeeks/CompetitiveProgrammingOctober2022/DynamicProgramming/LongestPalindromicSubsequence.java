/** This another variation of LCS
 * We are given a string, we need to find out the longest subsequence of the 
 * string which is palindrone
 * Example
 * Str = "GEEKSFORGEEKS"
 * One solution is to make the current string i.e str as S1 and you make another string
 * out of it, which is the reverse of it S2 = "SKEEGROFSKEEG". then you can now find the 
 * LCS of SI and S2 and what ever that is the length of LCS of S1 and S2, that is your
 * longest palindromic subsequence length for the given string.
 * 
 * Recursive solution to find the Longest Palindromic Subsequence (LPS):
 * 
 * Following is a general recursive solution with all cases handled. 

    Case1: Every single character is a palindrome of length 1
    L(i, i) = 1 (for all indexes i in given sequence)
    Case2: If first and last characters are not same
    If (X[i] != X[j])  L(i, j) = max{L(i + 1, j), L(i, j – 1)} 
    Case3: If there are only 2 characters and both are same
    Else if (j == i + 1) L(i, j) = 2  
    Case4: If there are more than two characters, and first and last characters are same
    Else L(i, j) =  L(i + 1, j – 1) + 2 
    https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/?ref=lbp
    https://www.youtube.com/watch?v=UflHuQj6MVA
    https://www.youtube.com/watch?v=_nCsPn7_OgI
 */
package DynamicProgramming;

import java.util.Arrays;

public class LongestPalindromicSubsequence {

    // A utility function to get max of two integers
    static int max(int x, int y) { return (x > y) ? x : y; }

    static int lpsRecursion(char seq[], int i, int j)
    {
        // Base Case 1: If there is only 1 character
        if (i == j) {
            return 1;
        }
 
        // Base Case 2: If there are only 2 characters and
        // both are same
        if (seq[i] == seq[j] && i + 1 == j) {
            return 2;
        }
 
        // If the first and last characters match
        if (seq[i] == seq[j]) {
            return lpsRecursion(seq, i + 1, j - 1) + 2;
        }
 
        // If the first and last characters do not match
        return max(lpsRecursion(seq, i, j - 1), lpsRecursion(seq, i + 1, j));
    }

    static int lpsDPMemo(char seq[], int i, int j)
    {
        int n = seq.length;
        int dp[][] = new int[n][n];
        for (int[] arr : dp)
            Arrays.fill(arr, -1);
 
        // Base Case 1: If there is only 1 character
        if (i == j) {
            return dp[i][j] = 1;
        }
 
        // Base Case 2: If there are only 2 characters and
        // both are same
        if (seq[i] == seq[j] && i + 1 == j) {
            return dp[i][j] = 2;
        }
        // Avoid extra call for already calculated
        // subproblems, Just return the saved ans from cache
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        // If the first and last characters match
        if (seq[i] == seq[j]) {
            return dp[i][j]
                = lpsDPMemo(seq, i + 1, j - 1) + 2;
        }
 
        // If the first and last characters do not match
        return dp[i][j] = max(lpsDPMemo(seq, i, j - 1),
        lpsDPMemo(seq, i + 1, j));
    }
 
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String seq = "GEEKSFORGEEKS";
        int n = seq.length();
        System.out.printf("The length of the LPS is %d",
        lpsRecursion(seq.toCharArray(), 0, n - 1));
    }
    
}
