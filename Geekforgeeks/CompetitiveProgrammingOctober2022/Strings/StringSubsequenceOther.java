/**
 * Check if a string is a subsequence of another. We are given two strings, check
 * if one is a subsequence of another.
 * A subsequence of a string is obtained by removing zero or more charaters. And all the
 * selected characters still need to remain as in the original string
 * Example
 * The subsequences of ABC are "", A, B, C, AB, AC, BC,ABC
 * In subsequence, it does not need to have contigious characters. We may remove characters from the middle.
 *  This is the difference
 * between Subsequence and substring. Substrings are contigious characters.
 * The total number of subsequences in a string of length n are 2^n. For our example, we will have 8 subsequences.
 * The reason is because you have two choices, you either take it or leave it.
 * S1 = ABCD S2 = AD -> AD is a Subsequence
 * S1 = ABCDE S2 AED -> AED is not a subsequence
 * A naive solution is to genrate all subsequences of String S1, and for any subsquence, compare with S2
 * and see if anyone matches. The time complexity will be exponential 0(2^n * n)
 */

package Strings;

public class StringSubsequenceOther {
    /**
     * IMPLEMENTATION
     * 1. Initialize two varaibles i and j starting from index 0 from s1 abd s2.
     * 2. Compare the s1[0] == s2[0]. If they match, increment both i and j
     * 3. If they don't match, increment only i
     * 4. if you reach end of any of the strings, you end the loop. If you have reached
     * the end of both s1 and s2, then you return true, meaning you have found s2 in s1
     * 0(m+n) Time
     * O(1) space
     * s1 = ABCDEF
     * s2 = ADE
     * initially j = 0
     * i = 0, j = 1;
     * i = 1,
     * i = 2,
     * i = 3, j = 2
     * i = 4, j = 3
     */
    static boolean isSubSeq(String s1, String s2, int n, int m){
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return (j == m);
    }
    //Optimazation
    static boolean isSubSeq2(String s1, String s2, int n, int m){
        if(n < m ){
            return false;
        }
        int j = 0;
        for(int i = 0; i < n && j < m; i++){
            if(s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return (j == m);
    }

    /**
     * isSubSeqRec(ABC, AC, 3, 2)
     *  ->isSubSeqRec(ABC, AC, 2, 1)
     *      ->isSubSeqRec(ABC, AC, 1, 1)
     *          ->isSubSeqRec(ABC, AC, 0, 0)
     * 0(m+n) Time TIME
     * O(N) space
     */
    static boolean isSubSeqRec(String s1, String s2, int n, int m){
        if(m == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(s1.charAt(n - 1) == s2.charAt(m-1)){
            return isSubSeq(s1, s2, n-1, m-1);
        }else{
            return isSubSeq(s1, s2, n-1, m);
        }
    }
}
