/**The recursive solution Users/julietnkwor/Documents/workspace/Juliette/Geekforgeeks/CompetitiveProgrammingOctober2022/Recursion/LongestCommonSequence.java
 * What is subsequence
 * A subsequence can be obtained by picking zero or more characters which
 * more not be contigiuos and their oder has to be the same has they appear
 * in the string.
 * And these characters should be picked in the same order as they appear in 
 * the origonal string.
 * String "CDA"
 * "", "C", "D", "A", "CD", "CA", "DA", "CDA"
 */
package DynamicProgramming;

public class LongestCommonSequence {
    /**
     * The idea is, you begin matching both characters in String 1 and 2 from either
     * from the begining of the array or the end. Here we will begin from the end.
     * S1 = AXYZ
     * S2 = BAZ
     * 1st Match 
     * Z == Z => 1 + lcs(S1, S2, n-1, m-1)
     * S1 = AXY
     * S2 = BA
     * y == A => max(lcs(S1, S2, n-1, m), lcs(S1, S2, n, m-1))
     * lsc(S1, S2) = max(lcs("AX", "BA"), lcs("AXY", "B"))
     * 
     * We are having two dimensional memo array because they are two strings that are
     * changing. Therefore, the number of dimensional array is going to be determined by
     * the number of parameters that are changing in the recursive call.
     * Theta(mn)
     */

   static int lcs(String str1, String str2, int m, int n){
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
 
                else if (str1.charAt(i - 1)
                         == str2.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
 
                else
                    L[i][j] = Math.max(L[i - 1][j],
                                       L[i][j - 1]);
            }
        }
 
        // L[m][n] contains length of LCS
        // for X[0..n-1] and Y[0..m-1]
        return L[m][n];
    }

   public static void main(String[] args) 
   {   
       String S1 = "AXZY";
       String S2 = "BAZ";
       int n = S1.length();
       int m = S2.length();
       System.out.println(lcs(S1, S2, n, m));
   }
}
