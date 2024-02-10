
/**
 * Given a binary string S. The task is to count the number of substrings that start and end with 1. 
 * For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
 */
package Strings;

public class BinaryString {
    /**My work O(N^2)
     * Initially
     * str = "“00100101”"
     * count = 0, i = 0, res=""
     * j = 0, res="0", count = 0
     * j = 1, res = "00", count = 0
     * j = 2, res = "001", count = 0
     * j = 3, res = "0010", count = 0
     * j = 4, res = "00100", count = 0
     * j = 5, res = "001001", count = 0
     * j = 6, res = "0010010", count = 0
     * j = 7, res = "00100101", count = 0
     * i = 1, res = ""
     * j = 1, res = "00", count = 0
     * j = 2, res = "001", count = 0
     * j = 3, res = "0010", count = 0
     * j = 4, res = "00100", count = 0
     * j = 5, res = "001001", count = 0
     * j = 6, res = "0010010", count = 0
     * j = 7, res = "00100101", count = 0
     * i = 2, res = ""
     * j = 2, res="1", count=0
     * j = 3, res = "10", count = 0
     * j = 4, res = "100", count = 0
     * j = 5, res = "1001", count = 1
     * j = 6, res = "10010", count = 0
     * j = 7, res = "100101", count = 2
     */
    static int countSubStr(String str, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            String res = "";
            for(int j = i; j < n; j++){
                res = res + str.charAt(j);
                if(str.charAt(i) == '1' && str.charAt(j) == '1' &&res.length() != 1){
                    count++;
                }
            }
        }
        return count;
    }
    //From Geekforgeeks O(n^2)
    static int countSubStr2(String str,int n) {
        int res = 0;  // Initialize result
        // Pick a starting point
        for (int i = 0; i<n; i++) {
            if (str.charAt(i) == '1') {
                // Search for all possible ending point
                for (int j = i + 1; j< n; j++) {
                    if (str.charAt(j) == '1')
                        res++;
                }
            }
        }
        return res;
    }
    //O(N)
    static int countSubStr3(String str, int n) {
        int m = 0; // Count of 1's in input string
        // Traverse input string and count of 1's in it
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1')
                m++;
        }
        // Return count of possible pairs among m 1's
        return m * (m - 1) / 2;
    }
    public static void main(String[] args) 
    {   
        String txt = "1111";
        int n = txt.length();
        System.out.println(countSubStr(txt,n));
        System.out.println(countSubStr2(txt,n));
        System.out.println(countSubStr3(txt,n));
    }
}
