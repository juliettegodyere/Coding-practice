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
 */

package DynamicProgramming;

public class ShortestCommonSubsequence {
    
}
