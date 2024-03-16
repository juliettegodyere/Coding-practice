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
 * https://www.youtube.com/watch?v=ZqG89Z-dKpI
 * 
 */
package DynamicProgramming;

public class LongestRepeatingSubsequence {
    static int lrs(String str1, String str2, int m, int n){
        int L[][] = new int[m + 1][n + 1];
        int i, j;
 
        // Following steps build L[m+1][n+1] in
        // bottom up fashion. Note that L[i][j]
        // contains length of LCS of str1[0..i-1]
        // and str2[0..j-1]
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
 
                else if (str1.charAt(i - 1) == str2.charAt(j - 1) && i !=j)
                    L[i][j] = L[i - 1][j - 1] + 1;
 
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
 
        // L[m][n] contains length of LCS
        // for X[0..n-1] and Y[0..m-1]
        return L[m][n];
    }

   public static void main(String[] args) 
   {   
        //You will be give only one string. Duplicate the string and find the LPS
       String S1 = "AXZY";
       String S2 = "AXZY";
       int n = S1.length();
       int m = S2.length();
       System.out.println(lrs(S1, S2, n, m));
   }
}
