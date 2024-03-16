/** This is another variation of Longest Common Subsequence problem.
 * We are given two strings, we need to find out a 3rd string which is short as
 * short a string which has both the two strings as a subsequence
 * Example
 * S1 = GEEK
 * S2 = GEFK
 * One solution is to append the two strings one after the other and your result
 * as both these strings as subsequence.
 * What we want is smallest subsequence which has both S1 and S2 as subsequences.
 * What we do, is we find out the LCS again, which is GEK, you then tranverse through the 
 * S1 and insert extra characters of S1 (GEEK) and you tranverse S2 and insert characters(GEEFK).
 * Note we have to insert these extra characters in the same order
 * 
 * Formular
 * Length of the shortest supersequence  = (Sum of lengths of given two strings) - (Length of LCS of two given strings) 
 * 
 */

package DynamicProgramming;

public class ShortestCommonSubsequence {
    static int shortestSuperSequence(String X, String Y) 
    { 
        int m = X.length(); 
        int n = Y.length(); 
  
        // find lcs 
        int l = LongestCommonSequence.lcs(X, Y, m, n); 
  
        // Result is sum of input string 
        // lengths - length of lcs 
        return (m + n - l); 
    } 

    public static void main(String args[]) 
    { 
        String X = "AGGTAB"; 
        String Y = "GXTXAYB"; 
  
        System.out.println("Length of the shortest "
                           + "supersequence is "
                           + shortestSuperSequence(X, Y)); 
    } 
}
