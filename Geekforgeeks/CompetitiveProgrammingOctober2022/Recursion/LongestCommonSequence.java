/**
 * What is subsequence
 * A subsequence can be obtained by picking zero or more characters which
 * more not be contigiuos and their oder has to be the same has they appear
 * in the string.
 * And these characters should be picked in the same order as they appear in 
 * the origonal string.
 * String "CDA"
 * "", "C", "D", "A", "CD", "CA", "DA", "CDA"
 */
package Recursion;

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
     * The time complexity for this is exponential
     * 
     */
    public static int lcs(String S1, String S2, int n, int m){
         if(n == 0 || m == 0){
            return 0;
         }
        if(S1.charAt(n-1) == S2.charAt(m-1)){
            return 1+lcs(S1, S2, n-1, m-1);
        }else{
            return Math.max(lcs(S1, S2, n-1, m), lcs(S1, S2, n, m-1));
        }
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
