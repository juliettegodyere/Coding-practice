package Strings;

public class LongestPalinromicString {
    static boolean isPal(String s, int start, int end){

        while(start < end){
            if(s.charAt(end) != s.charAt(start)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    /**
     * This approach is 0(n^3). Another approach is to use the dynamic programming. This is 0(n^2).
     * Check it out here
     * https://www.geeksforgeeks.org/longest-palindromic-substring/
     */
    static int longestPal(String str){
        int n = str.length();
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(isPal(str, i, j)){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }
    public static void main(String args[]) 
    { 
        String str = "geeks"; 
	    int len = longestPal(str);  
        System.out.print("The length of the longest palindromic characters substring is "+ len); 
    }
}
