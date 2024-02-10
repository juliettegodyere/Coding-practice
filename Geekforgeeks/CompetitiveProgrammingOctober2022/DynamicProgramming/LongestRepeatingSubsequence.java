/**This is another variation of LCS (Longest Common Subsequence).
 * When you are matching two subsequences, we should not consider
 * the same character at the same index in both subsequences.
 * What it means is that we should not say that the triple A in
 * the example below matches themselves. Because you consider
 * every character at the same index. We need to consider characters 
 * only at different indexes.
 * Example:
 * I/P A = "AAA"
 * I/P A = "AABB"
 * A simple solution is to consider S1 = "AABB" and S2 = "AABB". 
 * Then run your standard longest common subsequence (LCS) algorithm with 
 * only one diffrence. The difference is - in LCS what we do is, when last two 
 * characters match, we do 1 plus LCS of M-1 and N-1. In this case, we will
 * add this condition with the character matching. The last two characters
 * match, and their indexes in their respective strings are not same. You know
 * this character at index 2 here, then the other character should not be at 
 * index 2 in the other string. If that is the case, then don't increment the 
 * length of LCS. i.e don't make a recursive call with 1 plus M-1 and N-1. Rather 
 * go into the ealse part and take the maximum of two cases.
 * 
 */
package DynamicProgramming;

public class LongestRepeatingSubsequence {
    
}
