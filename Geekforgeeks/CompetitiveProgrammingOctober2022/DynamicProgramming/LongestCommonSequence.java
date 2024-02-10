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
    public static int lcs(String S1, String S2, int n, int m){
        int memo[][] = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                memo[i][j] = -1;
            }
        }
        if(memo[n][m] !=-1){
            return memo[n][m];
        }
        if(n == 0 || m == 0){
           memo[n][m] = 0;
        }
       if(S1.charAt(n-1) == S2.charAt(m-1)){
           memo[n][m] =  1+lcs(S1, S2, n-1, m-1);
       }else{
            memo[n][m] = Math.max(lcs(S1, S2, n-1, m), lcs(S1, S2, n, m-1));
       }
       return memo[n][m];
   }
   /**
    * tabulation method
    */
    public static int lcs2(String S1, String S2, int m, int n){
        int memo[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            memo[i][0] = 0;
        }
        for(int j = 0; j <= n; j++){
            memo[0][j] = 0;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    memo[i][j] =  1+memo[i-1][j-1];
                }else{
                     memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
            } 
        }
       return memo[n][m];
   }

   public static void main(String[] args) 
   {   
       String S1 = "AXZY";
       String S2 = "BAZ";
       int n = S1.length();
       int m = S2.length();
       System.out.println(lcs2(S1, S2, n, m));
   }
}
