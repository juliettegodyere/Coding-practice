
/** Another variation of LCS
 * 
 */
package DynamicProgramming;

public class PrintLongestCommonSequence {
    static void printLcs(String str1, String str2, int m, int n){
        int L[][] = new int[m + 1][n + 1];
 
        // Following steps build L[m+1][n+1] in
        // bottom up fashion. Note that L[i][j]
        // contains length of LCS of str1[0..i-1]
        // and str2[0..j-1]
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
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
 
        int index = L[m][n];
        int temp = index;
 
        char[] lcs = new char[index + 1];
        lcs[index] = '\u0000'; // Set the terminating character
        int i = m, j = n;

        while (i > 0 && j > 0) {
            // If current character in X[] and Y are same,
            // then current character is part of LCS
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                // Put current character in result
                lcs[index - 1] = str1.charAt(i - 1);
                 i--;
                j--;
                index--;
            }else if (L[i - 1][j] > L[i][j - 1])
                i--;
            else
                j--;
        }
        System.out.print("LCS of " + str1 + " and " + str2 + " is ");
        for (int k = 0; k <= temp; k++)
            System.out.print(lcs[k]);
    }

   public static void main(String[] args) 
   {   
       String S1 = "AXZY";
       String S2 = "BAZ";
       int n = S1.length();
       int m = S2.length();
    //    System.out.println(lcs(S1, S2, n, m));
        printLcs(S1, S2, n, m);
   }
}
