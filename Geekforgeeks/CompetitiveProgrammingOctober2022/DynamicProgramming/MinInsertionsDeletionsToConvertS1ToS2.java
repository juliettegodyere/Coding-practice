package DynamicProgramming;

public class MinInsertionsDeletionsToConvertS1ToS2 {
    /**
     * To solve the problem: 
     * 1. Calculate the length of the Longest Common Subsequence (LCS)
     * 2. To transform S1 and S2 we need to delete everything from S1 which is not part of LCS. To the minimum deletion 
     * we need to perform from S1 = (S1Length - LCSLength)
     * 3. Similarly, we need to insert everything in S1 which is present in S2 but not part of lCS. So the minimum insertions 
     * we need to perform from S2 = (S2Length - LCSLength)
     * https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/
     */

    static void printMinDelAndInsert(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
 
        int len = LongestCommonSequence.lcs(str1, str2, m, n);
 
        System.out.println("Minimum number of "
                           + "deletions = ");
        System.out.println(m - len);
 
        System.out.println("Minimum number of "
                           + "insertions = ");
        System.out.println(n - len);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String str1 = new String("heap");
        String str2 = new String("pea");
       
          // Function Call
        printMinDelAndInsert(str1, str2);
    }
}
